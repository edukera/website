package com.edukera.website.client.logo.presenter.impl;

import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.edukera.website.client.logo.presenter.LogoReasoning;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class LogoReasoningImpl extends BasePresenter<LogoReasoning.Display> implements LogoReasoning {

	@Inject
	public LogoReasoningImpl(EventBus eventBus, LogoReasoning.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}
	
	public void draw() {

	}
	
}
