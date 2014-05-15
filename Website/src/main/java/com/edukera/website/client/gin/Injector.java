package com.edukera.website.client.gin;


import com.edukera.website.client.content.presenter.Connection;
import com.edukera.website.client.content.presenter.Feature;
import com.edukera.website.client.content.presenter.Input;
import com.edukera.website.client.content.presenter.Logo;
import com.edukera.website.client.content.presenter.Soon;
import com.edukera.website.client.content.presenter.ValueProposition;
import com.edukera.website.client.generic.presenter.Tools;
import com.edukera.website.client.main.presenter.ContainerFeature;
import com.edukera.website.client.main.presenter.ContainerHilbert;
import com.edukera.website.client.main.presenter.ContainerSky;
import com.edukera.website.client.main.presenter.Footer;
import com.edukera.website.client.main.presenter.Header;
import com.edukera.website.client.main.presenter.Main;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.web.bindery.event.shared.EventBus;


@GinModules(Module.class)
public interface Injector extends Ginjector {

	/* Generic */
	EventBus getEventBus();	
	Tools getTools();
	
	/* Main */
	Main getMain();
	Header getHeader();
	Footer getFooter();
	ContainerSky getContainerSky();
	ContainerFeature getContainerFeature();
	ContainerHilbert getContainerHilbert();
	
	/* Content */
	Logo getLogo();
	Input getInput();
	Connection getConnection();
	ValueProposition getValueProposition();
	Soon getSoon();
	Feature getFeature();
}
