package com.edukera.website.client.logo.presenter.impl;

import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.edukera.website.client.logo.presenter.LogoDemo;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class LogoDemoImpl extends BasePresenter<LogoDemo.Display> implements LogoDemo {

	@Inject
	public LogoDemoImpl(EventBus eventBus, LogoDemo.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}
	
	public void draw() {

	}
	
}
