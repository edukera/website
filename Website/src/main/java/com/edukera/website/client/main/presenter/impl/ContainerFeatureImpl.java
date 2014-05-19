package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.ComingSoon;
import com.edukera.website.client.content.presenter.Feature;
import com.edukera.website.client.data.WebsiteKeys;
import com.edukera.website.client.generic.presenter.impl.ADrawImpl;
import com.edukera.website.client.main.presenter.ContainerFeature;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ContainerFeatureImpl extends ADrawImpl<ContainerFeature.Display> implements ContainerFeature {

	private final ComingSoon mComingSoon;
	private final Feature mFeatureReasoning;
	private final Feature mFeatureCalculus;
	private final Feature mFeatureDemonstration;

	@Inject
	public ContainerFeatureImpl(EventBus eventBus, ContainerFeature.Display display) {
		super(eventBus, display);
		
		mFeatureReasoning = EdukeraWebsite.ginjector.getFeature();
		mFeatureReasoning.init(EdukeraWebsite.ginjector.getLogoReasoning(), WebsiteKeys.REASONING_TITLE, WebsiteKeys.REASONING_DESC);
		display.addWrapper(mFeatureReasoning.getDisplay().asWidget());

		mFeatureCalculus = EdukeraWebsite.ginjector.getFeature();
		mFeatureCalculus.init(EdukeraWebsite.ginjector.getLogoCalculus(), WebsiteKeys.CALCULUS_TITLE, WebsiteKeys.CALCULUS_DESC);
		display.addWrapper(mFeatureCalculus.getDisplay().asWidget());

		mFeatureDemonstration = EdukeraWebsite.ginjector.getFeature();
		mFeatureDemonstration.init(EdukeraWebsite.ginjector.getLogoDemo(), WebsiteKeys.DEMONSTRATION_TITLE, WebsiteKeys.DEMONSTRATION_DESC);
		display.addWrapper(mFeatureDemonstration.getDisplay().asWidget());

		mComingSoon = EdukeraWebsite.ginjector.getComingSoon();
		display.addWrapper(mComingSoon.getDisplay().asWidget());
	}
	
	@Override
	public void bind() {
		super.bind();
		mFeatureReasoning.bind();
		mFeatureCalculus.bind();
		mFeatureDemonstration.bind();
		mComingSoon.bind();
	}

	@Override
	public void draw() {
		mFeatureReasoning.draw();
		mFeatureCalculus.draw();
		mFeatureDemonstration.draw();
		mComingSoon.draw();
	}
	
}
