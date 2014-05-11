package com.edukera.website.client;

import com.edukera.website.client.resources.WebsiteResources;
import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class EdukeraWebsite implements EntryPoint {

	public void onModuleLoad() {
		loadStyles();
	}
	
	private void loadStyles() {
		WebsiteResources.INSTANCE.styleCss().ensureInjected();
	}

}
