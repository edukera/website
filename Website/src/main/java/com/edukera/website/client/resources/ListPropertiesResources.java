// DO NOT EDIT: Powered by Edukera
package com.edukera.website.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface ListPropertiesResources extends ClientBundle {

	public static final ListPropertiesResources INSTANCE =  GWT.create(ListPropertiesResources.class);

	@Source("/properties/website.de.properties")
	TextResource websitedeProperties();

	@Source("/properties/website.el.properties")
	TextResource websiteelProperties();

	@Source("/properties/website.en.properties")
	TextResource websiteenProperties();

	@Source("/properties/website.es.properties")
	TextResource websiteesProperties();

	@Source("/properties/website.fr.properties")
	TextResource websitefrProperties();

	@Source("/properties/website.it.properties")
	TextResource websiteitProperties();

	@Source("/properties/website.jp.properties")
	TextResource websitejpProperties();

	@Source("/properties/website.hi.properties")
	TextResource websitehiProperties();

	@Source("/properties/website.ko.properties")
	TextResource websitekoProperties();

	@Source("/properties/website.pt.properties")
	TextResource websiteptProperties();

	@Source("/properties/website.ru.properties")
	TextResource websiteruProperties();

	@Source("/properties/website.zh.properties")
	TextResource websitezhProperties();

}