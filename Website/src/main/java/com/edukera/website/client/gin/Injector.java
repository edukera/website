package com.edukera.website.client.gin;


import com.edukera.website.client.generic.presenter.Tools;
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
	
	Main getMain();
	Header getHeader();
	Footer getFooter();

}
