package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.content.presenter.Feature;
import com.edukera.website.client.data.DataResources;
import com.edukera.website.client.data.WebsiteKeys;
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
		String lReasoning = DataResources.getInstance().getContent(WebsiteKeys.REASONING_DESC);
		display.setReasoningText(lReasoning);
		
		String lCalculus = DataResources.getInstance().getContent(WebsiteKeys.CALCULUS_DESC);
		display.setCalculusText(lCalculus);
		
		String lWritting = DataResources.getInstance().getContent(WebsiteKeys.WRITTING_DESC);
		display.setWrittingText(lWritting);
	}
	
}
