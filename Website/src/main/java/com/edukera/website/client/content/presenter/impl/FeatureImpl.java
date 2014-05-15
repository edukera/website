package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.content.presenter.Feature;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class FeatureImpl extends BasePresenter<Feature.Display> implements Feature {

	@Inject
	public FeatureImpl(EventBus eventBus, Feature.Display display) {
		super(eventBus, display);
	}
	
	@Override
	public void bind() {
		super.bind();
	}
	public void draw() {

	}
	
}
