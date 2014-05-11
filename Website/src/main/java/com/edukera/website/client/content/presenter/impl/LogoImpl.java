package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.Logo;
import com.edukera.website.client.content.presenter.TagPhrase;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class LogoImpl extends BasePresenter<Logo.Display> implements Logo {

	private final TagPhrase mTagPhrase;

	@Inject
	public LogoImpl(EventBus eventBus, Logo.Display display) {
		super(eventBus, display);
		display.setQeduText("Qedu");
		display.setMathText("math");
		
		mTagPhrase = EdukeraWebsite.ginjector.getTagPhrase();
		display.addProposition(mTagPhrase.getDisplay().asWidget());
	}
	
	@Override
	public void bind() {
		super.bind();
		mTagPhrase.bind();
	}
	
	
}
