package jhi.diversify.server;

import org.restlet.*;
import org.restlet.data.*;
import org.restlet.engine.application.*;
import org.restlet.resource.*;
import org.restlet.routing.*;
import org.restlet.service.*;
import org.restlet.util.*;

import java.util.*;

import jhi.diversify.server.resource.*;

/**
 * @author Sebastian Raubach
 */
public class Diversify extends Application
{
	public Diversify()
	{
		// Set information about API
		setName("Diversify Server");
		setDescription("This is the server implementation of Diversify");
		setOwner("Information & Computational Sciences, The James Hutton Institute");
		setAuthor("Sebastian Raubach <sebastian.raubach@hutton.ac.uk>");
	}

	private void attachToRouter(Router router, String url, Class<? extends ServerResource> clazz)
	{
		router.attach(url, clazz);
		router.attach(url + "/", clazz);
	}

	@Override
	public Restlet createInboundRoot()
	{
		Context context = getContext();

		// Set the encoder
		Filter encoder = new Encoder(context, false, true, new EncoderService(true));

		// Set the Cors filter
		CorsFilter corsFilter = new CorsFilter(context, encoder)
		{
			@Override
			protected int beforeHandle(Request request, Response response)
			{
				if (getCorsResponseHelper().isCorsRequest(request))
				{
					Series<Header> headers = request.getHeaders();

					for (Header header : headers)
					{
						if (header.getName().equalsIgnoreCase("origin"))
						{
							response.setAccessControlAllowOrigin(header.getValue());
						}
					}
				}
				return super.beforeHandle(request, response);
			}
		};
		corsFilter.setAllowedOrigins(new HashSet<>(Collections.singletonList("*")));
		corsFilter.setSkippingResourceForCorsOptions(true);
		corsFilter.setAllowingAllRequestedHeaders(true);
		corsFilter.setDefaultAllowedMethods(new HashSet<>(Arrays.asList(Method.POST, Method.GET, Method.PUT, Method.PATCH, Method.DELETE, Method.OPTIONS)));
		corsFilter.setAllowedCredentials(true);

		// Create new router
		Router router = new Router(context);
		// Attach the url handlers
		attachToRouter(router, "/site", SiteResource.class);
		attachToRouter(router, "/site/summary", SiteSummaryResource.class);
		attachToRouter(router, "/site/{siteId}/summary", SiteSummaryResource.class);
		attachToRouter(router, "/site/{siteId}/data", SiteDataResource.class);
		attachToRouter(router, "/site/{siteId}/data/{traitId}", SiteDataResource.class);
		attachToRouter(router, "/variety/{varietyId}/traitstats", VarietyTraitStatsResource.class);
		attachToRouter(router, "/variety/data", VarietyDataResource.class);
		attachToRouter(router, "/variety", VarietyResource.class);
		attachToRouter(router, "/trait", TraitResource.class);
		attachToRouter(router, "/trait/{traitIds}/plot", TraitPlotDataResource.class);
		attachToRouter(router, "/trait/{traitIds}/species", TraitSpeciesDataResource.class);
		attachToRouter(router, "/variety/data/trait", VarietyDataTraitResource.class);

		// CORS first, then encoder
		corsFilter.setNext(encoder);
		// After that the unauthorized paths
		encoder.setNext(router);

		return corsFilter;
	}
}