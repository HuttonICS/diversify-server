package jhi.diversify.server.resource;

import org.jooq.*;
import org.restlet.data.Status;
import org.restlet.resource.*;

import java.sql.*;
import java.util.*;
import java.util.logging.Logger;

import jhi.diversify.server.*;
import jhi.diversify.server.database.tables.pojos.*;

import static jhi.diversify.server.database.tables.ViewPlotdata.*;

/**
 * @author Sebastian Raubach
 */
public class SiteDataResource extends ServerResource
{
	private static final String PARAM_DATASET_ID = "datasetId";

	private Integer siteId    = null;
	private Integer traitId   = null;
	private Integer datasetId = null;

	@Override
	protected void doInit()
		throws ResourceException
	{
		super.doInit();

		try
		{
			siteId = Integer.parseInt(getRequestAttributes().get("siteId").toString());
		}
		catch (Exception e)
		{
		}

		try
		{
			traitId = Integer.parseInt(getRequestAttributes().get("traitId").toString());
		}
		catch (Exception e)
		{
		}

		try
		{
			datasetId = Integer.parseInt(getQueryValue(PARAM_DATASET_ID));
		}
		catch (Exception e)
		{
		}
	}

	@Get("json")
	public List<ViewPlotdata> getJson()
	{
		if (siteId == null)
		{
			throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
		}
		else
		{
			try (Connection conn = Database.getConnection();
				 DSLContext context = Database.getContext(conn);
				 SelectSelectStep<Record> select = context.select())
			{
				SelectConditionStep<Record> step = select.from(VIEW_PLOTDATA)
														 .where(VIEW_PLOTDATA.SITEID.eq(siteId));

				if (traitId != null)
					step.and(VIEW_PLOTDATA.TRAIT_ID.eq(traitId));
				if (datasetId != null)
					step.and(VIEW_PLOTDATA.DATASETID.eq(datasetId));

				return step.fetch()
						   .into(ViewPlotdata.class);
			}
			catch (SQLException e)
			{
				Logger.getLogger("").info(e.getMessage());
				e.printStackTrace();
				throw new ResourceException(Status.SERVER_ERROR_INTERNAL);
			}
		}
	}
}
