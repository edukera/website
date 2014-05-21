package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.content.presenter.ContactUs;
import com.edukera.website.client.data.DataResources;
import com.edukera.website.client.data.WebsiteKeys;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ContactUsImpl extends BasePresenter<ContactUs.Display> implements ContactUs {

	@Inject
	public ContactUsImpl(EventBus eventBus, ContactUs.Display display) {
		super(eventBus, display);
	}
	
	@Override
	public void bind() {
		super.bind();
	}

	@Override
	public void draw() {
		String lTitle = DataResources.getInstance().getContent(WebsiteKeys.CONTACT_US);
		display.setTextTitle(lTitle);
		
		display.setEmail("contact@edukera.com");
	}
	
	
}
