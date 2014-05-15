package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.About;
import com.edukera.website.client.content.presenter.Connection;
import com.edukera.website.client.content.presenter.Logo;
import com.edukera.website.client.content.presenter.Product;
import com.edukera.website.client.generic.presenter.impl.ADrawImpl;
import com.edukera.website.client.main.presenter.Header;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class HeaderImpl extends ADrawImpl<Header.Display> implements Header {

	private final Logo mLogo;
	private final About mAbout;
	private final Product mProduct;
	private final Connection mConnection;
	
	@Inject
	public HeaderImpl(EventBus eventBus, Header.Display display) {
		super(eventBus, display);
		
		mLogo = EdukeraWebsite.ginjector.getLogo();
		display.addContainer(mLogo.getDisplay().asWidget());
		
		mProduct = EdukeraWebsite.ginjector.getProduct();
		display.addContainer(mProduct.getDisplay().asWidget());

		mAbout = EdukeraWebsite.ginjector.getAbout();
		display.addContainer(mAbout.getDisplay().asWidget());

		mConnection = EdukeraWebsite.ginjector.getConnection();
		display.addContainer(mConnection.getDisplay().asWidget());
	}
	
	@Override
	public void bind() {
		super.bind();
		mLogo.bind();
		mAbout.bind();
		mProduct.bind();
		mConnection.bind();
	}

	@Override
	public void draw() {
		mLogo.draw();
		mAbout.draw();
		mProduct.draw();
		mConnection.draw();
	}
	
}
