package jhi.diversify.server.resource;

import org.jooq.*;
import org.jooq.impl.*;
import org.restlet.data.Status;
import org.restlet.resource.*;

import java.sql.*;
import java.util.*;

import jhi.diversify.server.*;
import jhi.diversify.server.database.tables.pojos.*;

import static jhi.diversify.server.database.tables.ViewSpeciesdataTraits.*;

/**
 * @author Sebastian Raubach
 */
public class VarietyDataTraitResource extends ServerResource
{
	@Get("json")
	public List<ViewSpeciesdataTraits> getJson()
	{
		try (Connection conn = Database.getConnection();
			 SelectSelectStep<Record> select = DSL.using(conn, SQLDialect.MYSQL).select())
		{
			return select.from(VIEW_SPECIESDATA_TRAITS)
						 .fetch()
						 .into(ViewSpeciesdataTraits.class);
		}
		catch (SQLException e)
		{
			throw new ResourceException(Status.SERVER_ERROR_INTERNAL);
		}
	}
}
