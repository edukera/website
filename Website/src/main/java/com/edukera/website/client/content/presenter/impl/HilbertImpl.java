package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.content.presenter.Hilbert;
import com.edukera.website.client.data.DataResources;
import com.edukera.website.client.data.WebsiteKeys;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class HilbertImpl extends BasePresenter<Hilbert.Display> implements Hilbert {

	@Inject
	public HilbertImpl(EventBus eventBus, Hilbert.Display display) {
		super(eventBus, display);

	}
	
	@Override
	public void bind() {
		super.bind();
	}

	@Override
	public void draw() {
		String lUrl = DataResources.getInstance().getContent(WebsiteKeys.HILBERT_URL);
		display.setUrl(lUrl);
		
		display.setName("David Hilbert");
	}
	
	
}
