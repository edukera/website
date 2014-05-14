package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.generic.presenter.impl.ADrawImpl;
import com.edukera.website.client.main.presenter.Container2;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class Container2Impl extends ADrawImpl<Container2.Display> implements Container2 {

	@Inject
	public Container2Impl(EventBus eventBus, Container2.Display display) {
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
