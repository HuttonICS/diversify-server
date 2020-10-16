package jhi.diversify.server.resource;

import jhi.diversify.server.Database;
import jhi.diversify.server.pojo.VarietyTraitStats;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.restlet.data.Status;
import org.restlet.resource.*;

import java.sql.*;
import java.util.List;
import java.util.logging.Logger;

import static jhi.diversify.server.database.tables.Plotdata.*;
import static jhi.diversify.server.database.tables.Traits.*;
import static jhi.diversify.server.database.tables.Varieties.*;
import static jhi.diversify.server.database.tables.Varietyinplot.*;

public class VarietyTraitStatsResource extends ServerResource
{
	private Integer varietyId;

	@Override
	protected void doInit()
		throws ResourceException
	{
		super.doInit();

		try
		{
			varietyId = Integer.parseInt(getRequestAttributes().get("varietyId").toString());
		}
		catch (Exception e)
		{
		}
	}

	@Get
	public List<VarietyTraitStats> getVarietyTraitStats()
	{
		try (Connection conn = Database.getConnection();
			 DSLContext context = Database.getContext(conn))
		{
			Field<String> varieties = DSL.select(DSL.groupConcat(VARIETIES.VARIETYNAME).orderBy(VARIETIES.ID.sortAsc(varietyId)).separator(", "))
										 .from(VARIETIES)
										 .leftJoin(VARIETYINPLOT).on(VARIETYINPLOT.VARIETY_ID.eq(VARIETIES.ID))
										 .where(VARIETYINPLOT.PLOT_ID.eq(PLOTDATA.PLOT_ID)).asField("varieties");

			return context.select(
				TRAITS.ID.as("trait_id"),
				TRAITS.TRAITNAME.as("trait_name"),
				DSL.avg(PLOTDATA.VALUE.cast(Double.class)).as("average_value"),
				varieties
			).from(PLOTDATA)
						  .leftJoin(VARIETYINPLOT).on(VARIETYINPLOT.PLOT_ID.eq(PLOTDATA.PLOT_ID))
						  .leftJoin(VARIETIES).on(VARIETIES.ID.eq(VARIETYINPLOT.VARIETY_ID))
						  .leftJoin(TRAITS).on(TRAITS.ID.eq(PLOTDATA.TRAIT_ID))
						  .where(DSL.exists(DSL.selectOne()
											   .from(VARIETYINPLOT)
											   .where(VARIETYINPLOT.PLOT_ID.eq(PLOTDATA.PLOT_ID))
											   .and(VARIETYINPLOT.VARIETY_ID.eq(varietyId))))
						  .groupBy(PLOTDATA.TRAIT_ID, varieties)
						  .orderBy(TRAITS.TRAITNAME, varieties)
						  .fetchInto(VarietyTraitStats.class);
		}
		catch (SQLException e)
		{
			Logger.getLogger("").info(e.getMessage());
			e.printStackTrace();
			throw new ResourceException(Status.SERVER_ERROR_INTERNAL);
		}
	}
}
