package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.Hilbert;
import com.edukera.website.client.data.DataResources;
import com.edukera.website.client.data.WebsiteKeys;
import com.edukera.website.client.generic.presenter.impl.ADrawImpl;
import com.edukera.website.client.main.presenter.ContainerHilbert;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ContainerHilbertImpl extends ADrawImpl<ContainerHilbert.Display> implements ContainerHilbert {

	private final Hilbert mHilbert;
	
	@Inject
	public ContainerHilbertImpl(EventBus eventBus, ContainerHilbert.Display display) {
		super(eventBus, display);
		
		mHilbert = EdukeraWebsite.ginjector.getHilbert();
		display.addWrapper(mHilbert.getDisplay().asWidget());
	}

	@Override
	public void bind() {
		super.bind();
		mHilbert.bind();
	}

	@Override
	public void draw() {
		mHilbert.draw();
		String lQuote1 = DataResources.getInstance().getContent(WebsiteKeys.QUOTE_1);
		display.setQuote1Text(lQuote1);
		
		String lQuote2 = DataResources.getInstance().getContent(WebsiteKeys.QUOTE_2);
		display.setQuote2Text(lQuote2);

		String lQuote3 = DataResources.getInstance().getContent(WebsiteKeys.QUOTE_3);
		display.setQuote3Text(lQuote3);
	}

}
