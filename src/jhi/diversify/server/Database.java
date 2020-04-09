package jhi.diversify.server;

import org.jooq.*;
import org.jooq.conf.*;
import org.jooq.impl.DSL;

import java.sql.*;
import java.util.TimeZone;

import jhi.diversify.server.database.Diversify;

/**
 * @author Sebastian Raubach
 */
public class Database
{
	private static String server;
	private static String database;
	private static String port;
	private static String username;
	private static String password;

	private static String utc = TimeZone.getDefault().getID();

	public static void init(String server, String database, String port, String username, String password)
	{
		Database.server = server;
		Database.database = database;
		Database.port = port;
		Database.username = username;
		Database.password = password;

		try
		{
			// The newInstance() call is a work around for some
			// broken Java implementations

			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		}
		catch (Exception ex)
		{
			// handle the error
		}

		// Get an initial connection to try if it works
		try (Connection conn = getConnection())
		{
			DSL.using(conn, SQLDialect.MYSQL).close();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

	public static Connection getConnection()
		throws SQLException
	{
		return DriverManager.getConnection(getDatabaseUrl(), username, password);
	}

	private static String getDatabaseUrl()
	{
		return "jdbc:mysql://" + server + ":" + (port != null ? port : "3306") + "/" + database + "?useUnicode=yes&characterEncoding=UTF-8&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=" + utc;
	}

	public static DSLContext getContext(Connection connection)
	{
		Settings settings = new Settings()
			.withRenderMapping(new RenderMapping()
				.withSchemata(
					new MappedSchema().withInput(Diversify.DIVERSIFY.getQualifiedName().first())
									  .withOutput(database)));

		return DSL.using(connection, SQLDialect.MYSQL, settings);
	}

	public static void createViews()
	{
		try (Connection conn = Database.getConnection();
			 DSLContext context = Database.getContext(conn))
		{
			context.dropViewIfExists("view_plotdata").execute();
			context.execute("CREATE VIEW view_plotdata AS SELECT `plots`.`plotcode` AS `plotcode`, group_concat( DISTINCT concat( `crops`.`cropcommonname`, ' (', `varietyinplot`.`rate`, ')' ) ORDER BY `crops`.`cropcommonname` ASC SEPARATOR ' + ' ) AS `crops`, `sites`.`id` AS `siteId`, `sites`.`sitename` AS `sitename`, `plotdata`.`id` AS `id`, `plotdata`.`plot_id` AS `plot_id`, `plotdata`.`trait_id` AS `trait_id`, `plotdata`.`rep` AS `rep`, cast( `plotdata`.`value` AS DECIMAL ( 64, 10 )) AS `value`, `plotdata`.`created_on` AS `created_on`, `plotdata`.`updated_on` AS `updated_on`, `datasets`.`id` AS `datasetid`, `datasets`.`name` AS `datasetname`, YEAR ( `plotdata`.`created_on` ) AS `year`, `traits`.`traitname` AS `traitname`, `traits`.`traitcode` AS `traitcode`, `traits`.`unit` AS `unit` FROM `plotdata` LEFT JOIN `plots` ON `plots`.`id` = `plotdata`.`plot_id` LEFT JOIN `sites` ON `sites`.`id` = `plots`.`site_id` LEFT JOIN `traits` ON `traits`.`id` = `plotdata`.`trait_id` LEFT JOIN `datasets` ON `datasets`.`id` = `plotdata`.`dataset_id` LEFT JOIN `varietyinplot` ON `varietyinplot`.`plot_id` = `plots`.`id` LEFT JOIN `varieties` ON `varieties`.`id` = `varietyinplot`.`variety_id` LEFT JOIN `crops` ON `crops`.`id` = `varieties`.`crop_id` GROUP BY `plots`.`id`, `plotdata`.`id` ORDER BY `crops`");

			context.dropViewIfExists("view_siteoverview").execute();
			context.execute("CREATE VIEW view_siteoverview AS SELECT `traits`.`id` AS `traitid`, `traits`.`traitname` AS `traitname`, `traits`.`traitcode` AS `traitcode`, `traits`.`unit` AS `unit`, `sites`.`id` AS `siteid`, `sites`.`sitename` AS `sitename`, `sites`.`othername` AS `othername`, `datasets`.`id` AS `datasetid`, `datasets`.`name` AS `datasetname`, YEAR ( `plotdata`.`created_on` ) AS `YEAR`, avg( cast( `plotdata`.`value` AS DECIMAL ( 64, 10 ))) AS `avg`, min( cast( `plotdata`.`value` AS DECIMAL ( 64, 10 ))) AS `min`, max( cast( `plotdata`.`value` AS DECIMAL ( 64, 10 ))) AS `max`, std( cast( `plotdata`.`value` AS DECIMAL ( 64, 10 ))) AS `stdv` FROM (((( `plotdata` LEFT JOIN `traits` ON (( `traits`.`id` = `plotdata`.`trait_id` ))) LEFT JOIN `plots` ON (( `plots`.`id` = `plotdata`.`plot_id` ))) LEFT JOIN `sites` ON (( `sites`.`id` = `plots`.`site_id` ))) LEFT JOIN `datasets` ON (( `datasets`.`id` = `plotdata`.`dataset_id` ))) GROUP BY `traits`.`id`, `datasets`.`id`, `sites`.`id`, `YEAR`");

			context.dropViewIfExists("view_sites").execute();
			context.execute("CREATE VIEW view_sites AS select `sites`.`id` AS `id`,`sites`.`sitename` AS `sitename`,`sites`.`othername` AS `othername`,`sites`.`partner_id` AS `partner_id`,`sites`.`latitude` AS `latitude`,`sites`.`longitude` AS `longitude`,`sites`.`created_on` AS `created_on`,`sites`.`updated_on` AS `updated_on`,count(distinct `plots`.`plotcode`) AS `plots`,max(cast(`plots`.`col` as signed)) AS `columns`,max(cast(`plots`.`row` as signed)) AS `rows`,`partners`.`partnername` AS `partnername` from ((`sites` left join `partners` on((`partners`.`id` = `sites`.`partner_id`))) left join `plots` on((`plots`.`site_id` = `sites`.`id`))) group by `sites`.`id`");

			context.dropViewIfExists("view_speciesdata").execute();
			context.execute("CREATE VIEW view_speciesdata AS select `traits`.`id` AS `traitid`,`traits`.`traitname` AS `traitname`,`traits`.`traitcode` AS `traitcode`,`sites`.`id` AS `siteid`,`sites`.`sitename` AS `sitename`,`varietyinplot`.`rate` AS `rate`,`crops`.`cropcommonname` AS `cropname`,`varieties`.`id` AS `varietyid`,`varieties`.`varietyname` AS `varietyname`,`speciesdata`.`value` AS `value` from (((((((`speciesdata` left join `datasets` on((`datasets`.`id` = `speciesdata`.`dataset_id`))) left join `traits` on((`traits`.`id` = `speciesdata`.`trait_id`))) left join `varietyinplot` on((`speciesdata`.`varietyinplot_id` = `varietyinplot`.`id`))) left join `varieties` on((`varieties`.`id` = `varietyinplot`.`variety_id`))) left join `plots` on((`plots`.`id` = `varietyinplot`.`plot_id`))) left join `sites` on((`sites`.`id` = `plots`.`site_id`))) left join `crops` on((`crops`.`id` = `varieties`.`crop_id`)))");

			context.dropViewIfExists("view_speciesdata_traits").execute();
			context.execute("CREATE VIEW view_speciesdata_traits AS select `traits`.`id` AS `id`,`traits`.`traitname` AS `traitname`,`traits`.`traitcode` AS `traitcode`,`traits`.`unit` AS `unit`,`traits`.`created_on` AS `created_on`,`traits`.`updated_on` AS `updated_on`,count(`speciesdata`.`id`) AS `datapoints`,count(distinct `plots`.`id`) AS `plots` from (((`traits` left join `speciesdata` on((`speciesdata`.`trait_id` = `traits`.`id`))) left join `varietyinplot` on((`varietyinplot`.`id` = `speciesdata`.`varietyinplot_id`))) left join `plots` on((`plots`.`id` = `varietyinplot`.`plot_id`))) group by `traits`.`id` having (`datapoints` > 0)");

			context.dropViewIfExists("view_varieties").execute();
			context.execute("CREATE VIEW view_varieties AS select `varieties`.`id` AS `id`,`varieties`.`varietyname` AS `varietyname`,`crops`.`cropcommonname` AS `cropcommonname`,`crops`.`croplatinname` AS `croplatinname`,`plantpartners`.`plantpartnername` AS `plantpartnername`,count(distinct `varietyinplot`.`plot_id`) AS `plots`,count(distinct `speciesdata`.`id`) AS `datapoints` from ((((`varieties` left join `crops` on((`crops`.`id` = `varieties`.`crop_id`))) left join `plantpartners` on((`plantpartners`.`id` = `crops`.`plantpartner_id`))) left join `varietyinplot` on((`varietyinplot`.`variety_id` = `varieties`.`id`))) left join `speciesdata` on((`speciesdata`.`varietyinplot_id` = `varietyinplot`.`id`))) group by `varieties`.`id`");

			context.dropViewIfExists("view_traits").execute();
			context.execute("CREATE VIEW view_traits AS SELECT *, (SELECT COUNT(1) FROM speciesdata WHERE speciesdata.trait_id = traits.id) AS species_data_points, (SELECT COUNT(1) FROM plotdata WHERE plotdata.trait_id = traits.id) AS plot_data_points FROM traits");

			context.execute("DROP PROCEDURE IF EXISTS `export_trait_data_species`;");
			context.execute("CREATE PROCEDURE `export_trait_data_species`(IN `traitIds` text) BEGIN SET @SQL = NULL; SET @@group_concat_max_len = 64000000; SET @QRY = CONCAT('SELECT GROUP_CONCAT(DISTINCT CONCAT(\"MAX(IF(`trait_id` = \", `trait_id`,\",value,NULL)) AS \", \"`\", CONCAT(traits.`traitname`, IF(ISNULL(traits.unit), \"\", CONCAT(\" [\", traits.unit, \"]\"))), \"`\")) INTO @SQL FROM speciesdata LEFT JOIN traits ON traits.id = speciesdata.trait_id WHERE traits.id IN (', traitIds, ')'); PREPARE stmtone FROM @QRY; EXECUTE stmtone; DEALLOCATE PREPARE stmtone; IF @SQL IS NULL THEN SELECT NULL as ERROR; ELSE SET @SQL = CONCAT('SELECT varietyname, cropcommonname, plotcode, sitename, datasets.name AS `dataset`, YEAR ( `speciesdata`.`created_on` ) AS `year`, ', @SQL, ' FROM `speciesdata` LEFT JOIN `varietyinplot` ON `speciesdata`.`varietyinplot_id` = `varietyinplot`.`id` LEFT JOIN `plots` ON `plots`.`id` = `varietyinplot`.`plot_id` LEFT JOIN `traits` ON `traits`.`id` = `speciesdata`.`trait_id` LEFT JOIN `varieties` ON `varieties`.`id` = `varietyinplot`.`variety_id` LEFT JOIN `crops` ON `crops`.`id` = `varieties`.`crop_id` LEFT JOIN sites ON sites.id = plots.site_id LEFT JOIN datasets ON datasets.id = speciesdata.dataset_id WHERE `speciesdata`.`trait_id` IN (', traitIds, ') GROUP BY plotcode, plots.id, datasets.name, varieties.varietyname, crops.cropcommonname, YEAR(speciesdata.created_on)'); PREPARE stmt FROM @SQL; EXECUTE stmt; DEALLOCATE PREPARE stmt; END IF; END");

			context.execute("DROP PROCEDURE IF EXISTS `export_trait_data_plot`;");
			context.execute("CREATE PROCEDURE `export_trait_data_plot`(IN `traitIds` text) BEGIN SET @SQL = NULL; SET @@group_concat_max_len = 64000000; SET @QRY = CONCAT('SELECT GROUP_CONCAT(DISTINCT CONCAT(\"MAX(IF(`trait_id` = \", `trait_id`,\",value,NULL)) AS \", \"`\", CONCAT(traits.`traitname`, IF(ISNULL(traits.unit), \"\", CONCAT(\" [\", traits.unit, \"]\"))), \"`\")) INTO @SQL FROM plotdata LEFT JOIN traits ON traits.id = plotdata.trait_id WHERE traits.id IN (', traitIds, ')'); PREPARE stmtone FROM @QRY; EXECUTE stmtone; DEALLOCATE PREPARE stmtone; IF @SQL IS NULL THEN SELECT NULL as ERROR; ELSE SET @SQL = CONCAT('SELECT group_concat( DISTINCT concat( `crops`.`cropcommonname`, \" (\", `varietyinplot`.`rate`, \")\" ) ORDER BY `crops`.`cropcommonname` ASC SEPARATOR \" + \") AS `crops`, plotcode, sitename, datasets.name AS `dataset`, YEAR ( `plotdata`.`created_on` ) AS `year`, ', @SQL, ' FROM `plotdata` LEFT JOIN `plots` ON `plots`.`id` = `plotdata`.`plot_id` LEFT JOIN `traits` ON `traits`.`id` = `plotdata`.`trait_id` LEFT JOIN `varietyinplot` ON `varietyinplot`.`plot_id` = `plots`.`id` LEFT JOIN `varieties` ON `varieties`.`id` = `varietyinplot`.`variety_id` LEFT JOIN `crops` ON `crops`.`id` = `varieties`.`crop_id` LEFT JOIN sites ON sites.id = plots.site_id LEFT JOIN datasets ON datasets.id = plotdata.dataset_id WHERE `plotdata`.`trait_id` IN (', traitIds, ') GROUP BY plots.id, datasets.name, YEAR(plotdata.created_on)'); PREPARE stmt FROM @SQL; EXECUTE stmt; DEALLOCATE PREPARE stmt; END IF; END");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
