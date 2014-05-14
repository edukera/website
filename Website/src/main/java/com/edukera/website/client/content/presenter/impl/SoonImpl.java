package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.content.presenter.Soon;
import com.edukera.website.client.data.DataResources;
import com.edukera.website.client.data.WebsiteKeys;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class SoonImpl extends BasePresenter<Soon.Display> implements Soon {

	@Inject
	public SoonImpl(EventBus eventBus, Soon.Display display) {
		super(eventBus, display);
	}
	
	@Override
	public void bind() {
		super.bind();
	}

	@Override
	public void draw() {
		String lFirstLine = DataResources.getInstance().getContent(WebsiteKeys.SOONFIRSTLINE);
		display.setFirstLineText(lFirstLine);
		
		String lSecondLine = DataResources.getInstance().getContent(WebsiteKeys.SOONSECONDLINE);
		display.setSecondLineText(lSecondLine);
	}
	
	
}
