package jhi.diversify.server.resource;

import org.jooq.DSLContext;
import org.jooq.tools.StringUtils;
import org.restlet.data.Status;
import org.restlet.data.*;
import org.restlet.representation.FileRepresentation;
import org.restlet.resource.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.logging.Logger;

import jhi.diversify.server.Database;
import jhi.diversify.server.database.routines.ExportTraitDataPlot;
import jhi.diversify.server.util.FileUtils;

/**
 * @author Sebastian Raubach
 */
public class TraitPlotDataResource extends ServerResource
{
	private String traitIds;

	@Override
	protected void doInit()
		throws ResourceException
	{
		super.doInit();

		this.traitIds = getRequestAttributes().get("traitIds").toString();

		if (!StringUtils.isEmpty(this.traitIds))
		{
			// Replace everything that isn't a digit or a comma
			this.traitIds = this.traitIds.replaceAll("[^0-9,]", "");
		}
	}

	@Get
	public FileRepresentation getFile()
	{
		if (StringUtils.isEmpty(traitIds))
			throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);

		FileRepresentation representation;
		File file = FileUtils.createTempFile("traits-plotdata", ".tsv");

		try (Connection conn = Database.getConnection();
			 DSLContext context = Database.getContext(conn);
			 PrintWriter bw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8))))
		{
			ExportTraitDataPlot procedure = new ExportTraitDataPlot();
			procedure.setTraitids(traitIds);
			procedure.execute(context.configuration());

			FileUtils.exportToFile(bw, procedure.getResults().get(0));
		}
		catch (SQLException | IOException e)
		{
			Logger.getLogger("").info(e.getMessage());
			e.printStackTrace();
			throw new ResourceException(Status.SERVER_ERROR_INTERNAL);
		}

		Disposition disposition = new Disposition(Disposition.TYPE_ATTACHMENT);
		disposition.setFilename(file.getName());
		representation = new FileRepresentation(file, MediaType.TEXT_PLAIN);
		representation.setSize(file.length());
		representation.setDisposition(disposition);

		return representation;
	}
}
