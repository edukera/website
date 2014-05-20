package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.content.presenter.Chevron;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ChevronImpl extends BasePresenter<Chevron.Display> implements Chevron {

	@Inject
	public ChevronImpl(EventBus eventBus, Chevron.Display display) {
		super(eventBus, display);
	}
	
	@Override
	public void bind() {
		super.bind();
	}

	@Override
	public void draw() {
		
	}
	
	
}
