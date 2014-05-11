package com.edukera.website.client.gin;


import com.edukera.website.client.content.presenter.Input;
import com.edukera.website.client.content.presenter.Logo;
import com.edukera.website.client.content.presenter.TagPhrase;
import com.edukera.website.client.generic.presenter.Tools;
import com.edukera.website.client.main.presenter.Container;
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
	Container getContainer();

	/* Content */
	Logo getLogo();
	TagPhrase getTagPhrase();
	Input getInput();
}
