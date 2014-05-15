package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.ButtonLanguage;
import com.edukera.website.client.generic.presenter.impl.ADrawImpl;
import com.edukera.website.client.main.presenter.Footer;
import com.google.gwt.user.client.Window;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class FooterImpl extends ADrawImpl<Footer.Display> implements Footer {

	private final ButtonLanguage mButtonLanguage;
	
	@Inject
	public FooterImpl(EventBus eventBus, Footer.Display display) {
		super(eventBus, display);
		
		mButtonLanguage = EdukeraWebsite.ginjector.getButtonLanguage();
		display.add(mButtonLanguage.getDisplay().asWidget());
	}
	
	@Override
	public void bind() {
		super.bind();
		mButtonLanguage.bind();
	}

	@Override
	public void draw() {
		int lHeight = Window.getClientHeight() - 425;
		if (lHeight < 200) {
			lHeight = 200;
		}
		display.setHeight(lHeight);
		mButtonLanguage.draw();
	}
	
	
}
