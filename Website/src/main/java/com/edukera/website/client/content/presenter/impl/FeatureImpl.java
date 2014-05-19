package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.content.presenter.Feature;
import com.edukera.website.client.data.DataResources;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class FeatureImpl extends BasePresenter<Feature.Display> implements Feature {

	private String mId;
	private String mTitle;
	private String mDesc;
	
	@Inject
	public FeatureImpl(EventBus eventBus, Feature.Display display) {
		super(eventBus, display);
	}
	
	@Override
	public void bind() {
		super.bind();
	}
	
	public void init(String iId, String iTitle, String iDesc) {
		mId = iId;
		mTitle = iTitle;
		mDesc = iDesc;
	}
	
	public void draw() {
		String lTitle = DataResources.getInstance().getContent(mTitle);
		display.setTitleText(lTitle);
		
		String lDesc = DataResources.getInstance().getContent(mDesc);
		display.setDescText(lDesc);
	}
	
}
