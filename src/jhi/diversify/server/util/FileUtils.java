package jhi.diversify.server.util;

import org.jooq.*;

import java.io.*;
import java.util.UUID;
import java.util.stream.*;

/**
 * @author Sebastian Raubach
 */
public class FileUtils
{
	public static final String CRLF = "\r\n";

	public static File createTempFile(String name, String extension)
	{
		extension = extension.replace(".", "");

		File folder = new File(System.getProperty("java.io.tmpdir"), "diversify");
		folder.mkdirs();

		File file;
		do
		{
			file = new File(folder, name + "-" + UUID.randomUUID() + "." + extension);
		} while (file.exists());

		return file;
	}

	public static void exportToFile(Writer bw, Result<? extends Record> results)
		throws IOException
	{
		Row row = results.fieldsRow();
		bw.write(row.fieldStream()
					.map(Field::getName)
					.collect(Collectors.joining("\t", "", CRLF)));
		results.forEach(r -> {
			try
			{
				bw.write(IntStream.range(0, row.size())
								  .boxed()
								  .map(i -> {
									  Object value = r.getValue(i);
									  if (value == null)
										  return "";
									  else
										  return value.toString();
								  })
								  .collect(Collectors.joining("\t", "", CRLF)));
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		});
	}
}
