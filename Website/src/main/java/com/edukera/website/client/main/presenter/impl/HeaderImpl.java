package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.Connection;
import com.edukera.website.client.content.presenter.Logo;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.edukera.website.client.main.presenter.Header;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class HeaderImpl extends BasePresenter<Header.Display> implements Header {

	private final Logo mLogo;
	private final Connection mConnection;
	
	@Inject
	public HeaderImpl(EventBus eventBus, Header.Display display) {
		super(eventBus, display);
		
		mLogo = EdukeraWebsite.ginjector.getLogo();
		display.addContainer(mLogo.getDisplay().asWidget());
		
		mConnection = EdukeraWebsite.ginjector.getConnection();
		display.addContainer(mConnection.getDisplay().asWidget());
	}
	
	@Override
	public void bind() {
		super.bind();
		mLogo.bind();
		mConnection.bind();
	}
	
}
