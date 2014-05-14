package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.content.presenter.ValueProposition;
import com.edukera.website.client.data.DataResources;
import com.edukera.website.client.data.WebsiteKeys;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ValuePropositionImpl extends BasePresenter<ValueProposition.Display> implements ValueProposition {

	@Inject
	public ValuePropositionImpl(EventBus eventBus, ValueProposition.Display display) {
		super(eventBus, display);
	}
	
	@Override
	public void bind() {
		super.bind();
	}
	
	public void draw() {
		String lTitle = DataResources.getInstance().getContent(WebsiteKeys.VALUEPROPOSITIONTITLE);
		display.setTitleText(lTitle);
		
		String lFirstLine = DataResources.getInstance().getContent(WebsiteKeys.VALUEPROPOSITIONFIRSTLINE);
		display.setFirstLineText(lFirstLine);

		String lSecondLine = DataResources.getInstance().getContent(WebsiteKeys.VALUEPROPOSITIONSECONDLINE);
		display.setSecondLineText(lSecondLine);
	}
	
	
}
