package com.edukera.website.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;

public interface WebsiteResources extends ClientBundle {
	
	public static final WebsiteResources INSTANCE =  GWT.create(WebsiteResources.class);

	@Source("css/style.css")
	public StyleCssResource styleCss();
	
}
