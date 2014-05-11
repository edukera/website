package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.edukera.website.client.main.presenter.Header;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class HeaderImpl extends BasePresenter<Header.Display> implements Header {

	@Inject
	public HeaderImpl(EventBus eventBus, Header.Display display) {
		super(eventBus, display);
		
	}
	
	@Override
	public void bind() {
		super.bind();
	}
	
}
