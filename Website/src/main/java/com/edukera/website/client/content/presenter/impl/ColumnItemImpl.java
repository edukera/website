package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.content.presenter.ColumnItem;
import com.edukera.website.client.data.DataResources;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ColumnItemImpl extends BasePresenter<ColumnItem.Display> implements ColumnItem {

	private String mId;
	private String mUrl;
	
	@Inject
	public ColumnItemImpl(EventBus eventBus, ColumnItem.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}
	
	public void init(String iId, String iUrl) {
		mId = iId;
		mUrl = iUrl;
	}

	public void draw() {
		String lText = DataResources.getInstance().getContent(mId);
		display.setContentText(lText);
		display.setUrl(mUrl);
	}
	
}
