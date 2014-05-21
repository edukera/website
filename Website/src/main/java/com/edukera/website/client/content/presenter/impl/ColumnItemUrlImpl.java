package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.content.presenter.ColumnItemUrl;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ColumnItemUrlImpl extends AColumnItemImpl<ColumnItemUrl.Display> implements ColumnItemUrl {

	private String mUrl;
	
	@Inject
	public ColumnItemUrlImpl(EventBus eventBus, ColumnItemUrl.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}
	
	public void init(String iId, String iUrl) {
		super.init(iId);
		mUrl = iUrl;
	}

	public void draw() {
		super.draw();
		display.setUrl(mUrl);
	}
	
}
