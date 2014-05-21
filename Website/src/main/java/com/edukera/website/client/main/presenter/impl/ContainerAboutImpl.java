package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.generic.presenter.impl.ADrawImpl;
import com.edukera.website.client.main.presenter.ContainerAbout;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ContainerAboutImpl extends ADrawImpl<ContainerAbout.Display> implements ContainerAbout {

	@Inject
	public ContainerAboutImpl(EventBus eventBus, ContainerAbout.Display display) {
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
