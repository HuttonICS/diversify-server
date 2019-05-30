package jhi.diversify.server.resource;

import org.jooq.*;
import org.jooq.impl.*;
import org.restlet.data.Status;
import org.restlet.resource.*;

import java.sql.*;
import java.util.*;

import jhi.diversify.server.*;
import jhi.diversify.server.database.tables.pojos.*;

import static jhi.diversify.server.database.tables.ViewVarieties.*;

/**
 * @author Sebastian Raubach
 */
public class VarietyResource extends ServerResource
{
	@Get("json")
	public List<ViewVarieties> getJson()
	{
		try (Connection conn = Database.getConnection();
			 SelectSelectStep<Record> select = DSL.using(conn, SQLDialect.MYSQL).select())
		{
			return select.from(VIEW_VARIETIES)
						 .fetch()
						 .into(ViewVarieties.class);
		}
		catch (SQLException e)
		{
			throw new ResourceException(Status.SERVER_ERROR_INTERNAL);
		}
	}
}
