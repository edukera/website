package com.edukera.website.client.logo.presenter.impl;

import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.edukera.website.client.logo.presenter.LogoCalculus;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class LogoCalculusImpl extends BasePresenter<LogoCalculus.Display> implements LogoCalculus {

	@Inject
	public LogoCalculusImpl(EventBus eventBus, LogoCalculus.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}
	
	public void draw() {

	}
	
}
