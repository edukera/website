package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.Logo;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class LogoImpl extends BasePresenter<Logo.Display> implements Logo {

	@Inject
	public LogoImpl(EventBus eventBus, Logo.Display display) {
		super(eventBus, display);
		display.setEdukText("eduk");
		display.setEraText("era");

	}
	
	@Override
	public void bind() {
		super.bind();
		
		registerHandler(display.getHasClickHandlers().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				doClick();
			}

		}));
	}

	@Override
	public void draw() {
		
	}
	
	private void doClick() {
		EdukeraWebsite.ginjector.getMain().clickLogo();
	}
}
