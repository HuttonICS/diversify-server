package jhi.diversify.server;

import javax.servlet.*;

public class ApplicationListener implements ServletContextListener
{
	@Override
	public void contextInitialized(ServletContextEvent sce)
	{
		ServletContext ctx = sce.getServletContext();
		String database = ctx.getInitParameter("database");
		String username = ctx.getInitParameter("username");
		String password = ctx.getInitParameter("password");
		Database.init(database, username, password);

		Database.createViews();
	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent)
	{
	}
}
