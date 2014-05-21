package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.content.presenter.LegalInformation;
import com.edukera.website.client.data.DataResources;
import com.edukera.website.client.data.WebsiteKeys;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class LegalInformationImpl extends BasePresenter<LegalInformation.Display> implements LegalInformation {

	@Inject
	public LegalInformationImpl(EventBus eventBus, LegalInformation.Display display) {
		super(eventBus, display);
	}
	
	@Override
	public void bind() {
		super.bind();
	}

	@Override
	public void draw() {
		String lTitle = DataResources.getInstance().getContent(WebsiteKeys.LEGAL_INFORMATION);
		display.setTextTitle(lTitle);
		
		String l1 = DataResources.getInstance().getContent(WebsiteKeys.LEGAL_1);
		display.setLegal1(l1);
		
		String l2 = DataResources.getInstance().getContent(WebsiteKeys.LEGAL_2);
		display.setLegal2(l2);
		
		String l3 = DataResources.getInstance().getContent(WebsiteKeys.LEGAL_3);
		display.setLegal3(l3);
	}
	
	
}
