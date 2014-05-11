package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.edukera.website.client.main.presenter.Container;
import com.edukera.website.client.main.presenter.Header;
import com.edukera.website.client.main.presenter.Main;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class MainImpl extends BasePresenter<Main.Display> implements Main {

	private final Header mHeader;
	private final Container mContainer;
	
	@Inject
	public MainImpl(EventBus eventBus, Main.Display display) {
		super(eventBus, display);
		mHeader = EdukeraWebsite.ginjector.getHeader();
		mContainer = EdukeraWebsite.ginjector.getContainer();
		
		display.add(mHeader.getDisplay().asWidget());
		display.add(mContainer.getDisplay().asWidget());
	}
	
	@Override
	public void bind() {
		super.bind();
		mHeader.bind();
		mContainer.bind();
	}
	
	
}
