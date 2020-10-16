package jhi.diversify.server.resource;

import org.jooq.*;
import org.restlet.data.Status;
import org.restlet.resource.*;

import java.sql.*;
import java.util.*;
import java.util.logging.Logger;

import jhi.diversify.server.*;
import jhi.diversify.server.database.tables.pojos.*;

import static jhi.diversify.server.database.tables.ViewSiteoverview.*;

/**
 * @author Sebastian Raubach
 */
public class SiteSummaryResource extends ServerResource
{
	private Integer siteId = null;

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
	}

	@Get("json")
	public List<ViewSiteoverview> getJson()
	{
		try (Connection conn = Database.getConnection();
			 DSLContext context = Database.getContext(conn);
			 SelectSelectStep<Record> select = context.select())
		{
			SelectJoinStep<Record> step = select.from(VIEW_SITEOVERVIEW);

			if (siteId != null)
				step.where(VIEW_SITEOVERVIEW.SITEID.eq(siteId));

			return step.fetch()
					   .into(ViewSiteoverview.class);
		}
		catch (SQLException e)
		{
			Logger.getLogger("").info(e.getMessage());
			e.printStackTrace();
			throw new ResourceException(Status.SERVER_ERROR_INTERNAL);
		}
	}
}
