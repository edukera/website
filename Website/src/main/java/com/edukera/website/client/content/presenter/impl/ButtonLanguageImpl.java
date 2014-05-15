package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.ButtonLanguage;
import com.edukera.website.client.data.Language;
import com.edukera.website.client.generic.presenter.impl.ADrawImpl;
import com.edukera.website.client.main.presenter.Main;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Timer;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ButtonLanguageImpl extends ADrawImpl<ButtonLanguage.Display> implements ButtonLanguage {

	@Inject
	public ButtonLanguageImpl (
			EventBus eventBus,
			ButtonLanguage.Display display) {
		super(eventBus, display);
		
	}
	
	@Override
	public void bind() {
		super.bind();
		
		registerHandler(display.getHasClickHandlers().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {

			}

		}));
		
		addLanguage(Language.en);
		addLanguage(Language.fr);
		
//		for (final Language lLanguage : Language.values()) {
//			addLanguage(lLanguage);
//		}

	}
	
	

	public void draw() {
		Main lMain = EdukeraWebsite.ginjector.getMain();
		Language lLanguage = lMain.getLanguage();
		display.setContent(lLanguage.toString());
		
		display.clearMenu();
		Timer lTimer = new Timer() {
			
			@Override
			public void run() {
				display.all();
			}
		};
		lTimer.schedule(300);
	}

	private void doChangeLanguage(Language iLanguage) {
		if (iLanguage != null) {
			Main lMain = EdukeraWebsite.ginjector.getMain();
			Language lLanguage = lMain.getLanguage();
			if (iLanguage != lLanguage) {
				lMain.setLanguage(iLanguage);
				lMain.draw();
			}
		}
	}
	
	private void addLanguage(final Language lLanguage) {
		registerHandler(display.addLanguage(lLanguage.toString(), lLanguage.getDescription()).addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				doChangeLanguage(lLanguage);
			}

		}));
	}

}
