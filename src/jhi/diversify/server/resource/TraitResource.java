package jhi.diversify.server.resource;

import org.jooq.*;
import org.jooq.impl.*;
import org.restlet.data.Status;
import org.restlet.resource.*;

import java.sql.*;
import java.util.*;

import jhi.diversify.server.*;
import jhi.diversify.server.database.tables.pojos.*;

import static jhi.diversify.server.database.tables.Traits.*;

/**
 * @author Sebastian Raubach
 */
public class TraitResource extends ServerResource
{
	@Get("json")
	public List<Traits> getJson()
	{
		try (Connection conn = Database.getConnection();
			 SelectSelectStep<Record> select = DSL.using(conn, SQLDialect.MYSQL).select())
		{
			return select.from(TRAITS)
						 .fetch()
						 .into(Traits.class);
		}
		catch (SQLException e)
		{
			throw new ResourceException(Status.SERVER_ERROR_INTERNAL);
		}
	}
}
