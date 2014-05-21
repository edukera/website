package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.ColumnItemAbout;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ColumnItemAboutImpl extends AColumnItemImpl<ColumnItemAbout.Display> implements ColumnItemAbout {

	@Inject
	public ColumnItemAboutImpl(EventBus eventBus, ColumnItemAbout.Display display) {
		super(eventBus, display);
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
	

	private void doClick() {
		EdukeraWebsite.ginjector.getMain().updateAboutMode(true);
	}
}
