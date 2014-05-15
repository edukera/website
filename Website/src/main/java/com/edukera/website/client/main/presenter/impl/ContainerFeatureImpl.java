package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.Feature;
import com.edukera.website.client.generic.presenter.impl.ADrawImpl;
import com.edukera.website.client.main.presenter.ContainerFeature;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ContainerFeatureImpl extends ADrawImpl<ContainerFeature.Display> implements ContainerFeature {

	private final Feature mFeature;
	
	@Inject
	public ContainerFeatureImpl(EventBus eventBus, ContainerFeature.Display display) {
		super(eventBus, display);
		
		mFeature = EdukeraWebsite.ginjector.getFeature();
		
		display.addWrapper(mFeature.getDisplay().asWidget());
	}
	
	@Override
	public void bind() {
		super.bind();
		mFeature.bind();
	}

	@Override
	public void draw() {
		mFeature.draw();
	}
	
	
}
