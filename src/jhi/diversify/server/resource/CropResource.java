package jhi.diversify.server.resource;

import org.jooq.*;
import org.jooq.impl.*;
import org.restlet.data.Status;
import org.restlet.resource.*;

import java.sql.*;
import java.util.*;

import jhi.diversify.server.*;
import jhi.diversify.server.database.tables.pojos.*;

import static jhi.diversify.server.database.tables.Varieties.*;

/**
 * @author Sebastian Raubach
 */
public class CropResource extends ServerResource
{
	@Get("json")
	public List<Varieties> getJson()
	{
		try (Connection conn = Database.getConnection();
			 DSLContext context = Database.getContext(conn);
			 SelectSelectStep<Record> select = context.select())
		{
			return select.from(VARIETIES)
						 .fetch()
						 .into(Varieties.class);
		}
		catch (SQLException e)
		{
			throw new ResourceException(Status.SERVER_ERROR_INTERNAL);
		}
	}
}
