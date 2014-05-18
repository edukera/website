package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.content.presenter.ComingSoon;
import com.edukera.website.client.data.DataResources;
import com.edukera.website.client.data.WebsiteKeys;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ComingSoonImpl extends BasePresenter<ComingSoon.Display> implements ComingSoon {

	@Inject
	public ComingSoonImpl(EventBus eventBus, ComingSoon.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();

	}

	public void draw() {
		String lText = DataResources.getInstance().getContent(WebsiteKeys.COMING_SOON);
		display.setContentText(lText);
	}
	
}
