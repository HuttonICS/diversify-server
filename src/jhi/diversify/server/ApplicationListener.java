package jhi.diversify.server;

import javax.servlet.*;

import jhi.diversify.server.util.PropertyWatcher;

public class ApplicationListener implements ServletContextListener
{
	@Override
	public void contextInitialized(ServletContextEvent sce)
	{
		PropertyWatcher.initialize();

		Database.createViews();
	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent)
	{
	}
}
