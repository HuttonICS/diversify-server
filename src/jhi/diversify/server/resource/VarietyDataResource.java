package jhi.diversify.server.resource;

import org.jooq.*;
import org.jooq.impl.*;
import org.restlet.data.Status;
import org.restlet.resource.*;

import java.sql.*;
import java.util.*;
import java.util.logging.Logger;

import jhi.diversify.server.*;
import jhi.diversify.server.database.tables.pojos.*;

import static jhi.diversify.server.database.tables.ViewSpeciesdata.*;

/**
 * @author Sebastian Raubach
 */
public class VarietyDataResource extends ServerResource
{
	private static final String PARAM_VARIETY_IDS = "varietyIds";
	private static final String PARAM_TRAIT_IDS = "traitIds";

	private List<String> varietyIds = null;
	private List<String> traitIds = null;

	@Override
	protected void doInit()
		throws ResourceException
	{
		super.doInit();

		try
		{
			this.varietyIds = Arrays.asList(getQueryValue(PARAM_VARIETY_IDS).split(","));
		}
		catch (Exception e)
		{
		}

		try
		{
			this.traitIds = Arrays.asList(getQueryValue(PARAM_TRAIT_IDS).split(","));
		}
		catch (Exception e)
		{
		}
	}

	@Get("json")
	public List<ViewSpeciesdata> getJson()
	{
		try (Connection conn = Database.getConnection();
			 DSLContext context = Database.getContext(conn);
			 SelectSelectStep<Record> select = context.select())
		{
			SelectJoinStep<Record> step = select.from(VIEW_SPECIESDATA);

			if (varietyIds != null && varietyIds.size() > 0)
				step.where(VIEW_SPECIESDATA.VARIETYID.in(varietyIds));

			if (traitIds != null && traitIds.size() > 0)
				step.where(VIEW_SPECIESDATA.TRAITID.in(traitIds));

			return step.where(VIEW_SPECIESDATA.RATE.eq(100))
					   .fetch()
					   .into(ViewSpeciesdata.class);
		}
		catch (SQLException e)
		{
			Logger.getLogger("").info(e.getMessage());
			e.printStackTrace();
			throw new ResourceException(Status.SERVER_ERROR_INTERNAL);
		}
	}
}
