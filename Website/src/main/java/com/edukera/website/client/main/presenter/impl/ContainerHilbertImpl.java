package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.data.DataResources;
import com.edukera.website.client.data.WebsiteKeys;
import com.edukera.website.client.generic.presenter.impl.ADrawImpl;
import com.edukera.website.client.main.presenter.ContainerHilbert;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ContainerHilbertImpl extends ADrawImpl<ContainerHilbert.Display> implements ContainerHilbert {

	@Inject
	public ContainerHilbertImpl(EventBus eventBus, ContainerHilbert.Display display) {
		super(eventBus, display);
	}
	
	@Override
	public void bind() {
		super.bind();
	}

	@Override
	public void draw() {
		String lQuote = "\"" + DataResources.getInstance().getContent(WebsiteKeys.QUOTE) + "\"";
		display.setQuoteText(lQuote);
	}
	
}
