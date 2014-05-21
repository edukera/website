package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.content.presenter.AColumnItem;
import com.edukera.website.client.data.DataResources;
import com.edukera.website.client.generic.presenter.impl.ADrawImpl;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public abstract class AColumnItemImpl<D extends AColumnItem.Display> extends ADrawImpl<D> implements AColumnItem<D> {

	private String mId;
	
	@Inject
	public AColumnItemImpl(EventBus eventBus, D display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}
	
	public void init(String iId) {
		mId = iId;
	}

	public void draw() {
		String lText = DataResources.getInstance().getContent(mId);
		display.setContentText(lText);
	}
	
}
