package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.ComingSoon;
import com.edukera.website.client.content.presenter.Feature;
import com.edukera.website.client.generic.presenter.impl.ADrawImpl;
import com.edukera.website.client.main.presenter.ContainerFeature;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ContainerFeatureImpl extends ADrawImpl<ContainerFeature.Display> implements ContainerFeature {

	private final ComingSoon mComingSoon;
	private final Feature mFeature;
	
	@Inject
	public ContainerFeatureImpl(EventBus eventBus, ContainerFeature.Display display) {
		super(eventBus, display);
		
		mComingSoon = EdukeraWebsite.ginjector.getComingSoon();
		display.addWrapper(mComingSoon.getDisplay().asWidget());
		
		mFeature = EdukeraWebsite.ginjector.getFeature();
		display.addWrapper(mFeature.getDisplay().asWidget());
	}
	
	@Override
	public void bind() {
		super.bind();
		mComingSoon.bind();
		mFeature.bind();
	}

	@Override
	public void draw() {
		mComingSoon.draw();
		mFeature.draw();
	}
	
	
}
