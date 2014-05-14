package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.generic.presenter.impl.ADrawImpl;
import com.edukera.website.client.main.presenter.ContainerFeature;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ContainerFeatureImpl extends ADrawImpl<ContainerFeature.Display> implements ContainerFeature {

	@Inject
	public ContainerFeatureImpl(EventBus eventBus, ContainerFeature.Display display) {
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
