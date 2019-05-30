package jhi.diversify.server.resource;

import org.jooq.*;
import org.jooq.impl.*;
import org.restlet.data.Status;
import org.restlet.resource.*;

import java.sql.*;
import java.util.*;

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
			 SelectSelectStep<Record> select = DSL.using(conn, SQLDialect.MYSQL).select())
		{
			SelectJoinStep<Record> step = select.from(VIEW_SITEOVERVIEW);

			if (siteId != null)
				step.where(VIEW_SITEOVERVIEW.SITEID.eq(siteId));

			return step.fetch()
					   .into(ViewSiteoverview.class);
		}
		catch (SQLException e)
		{
			throw new ResourceException(Status.SERVER_ERROR_INTERNAL);
		}
	}
}
