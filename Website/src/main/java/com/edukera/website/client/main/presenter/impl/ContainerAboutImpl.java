package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.ContactUs;
import com.edukera.website.client.content.presenter.LegalInformation;
import com.edukera.website.client.generic.presenter.impl.ADrawImpl;
import com.edukera.website.client.main.presenter.ContainerAbout;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ContainerAboutImpl extends ADrawImpl<ContainerAbout.Display> implements ContainerAbout {

	private final ContactUs mContactUs;
	private final LegalInformation mLegalInformation;
	
	@Inject
	public ContainerAboutImpl(EventBus eventBus, ContainerAbout.Display display) {
		super(eventBus, display);
		
		mContactUs = EdukeraWebsite.ginjector.getContactUs();
		display.addContent(mContactUs.getDisplay().asWidget());
		
		mLegalInformation = EdukeraWebsite.ginjector.getLegalInformation();
		display.addContent(mLegalInformation.getDisplay().asWidget());
	}
	
	@Override
	public void bind() {
		super.bind();
		mContactUs.bind();
		mLegalInformation.bind();
	}

	@Override
	public void draw() {
		mContactUs.draw();
		mLegalInformation.draw();
	}
	
}
