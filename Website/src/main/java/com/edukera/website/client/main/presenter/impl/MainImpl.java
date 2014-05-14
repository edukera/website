package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.generic.presenter.impl.ADrawImpl;
import com.edukera.website.client.main.presenter.ContainerSky;
import com.edukera.website.client.main.presenter.ContainerFeature;
import com.edukera.website.client.main.presenter.Header;
import com.edukera.website.client.main.presenter.Main;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class MainImpl extends ADrawImpl<Main.Display> implements Main {

	private final Header mHeader;
	private final ContainerSky mContainer;
	private final ContainerFeature mContainer2;
	
	@Inject
	public MainImpl(EventBus eventBus, Main.Display display) {
		super(eventBus, display);
		mHeader = EdukeraWebsite.ginjector.getHeader();
		mContainer = EdukeraWebsite.ginjector.getContainerSky();
		mContainer2 = EdukeraWebsite.ginjector.getContainerFeature();
		
		display.add(mHeader.getDisplay().asWidget());
		display.add(mContainer.getDisplay().asWidget());
		display.add(mContainer2.getDisplay().asWidget());
	}
	
	@Override
	public void bind() {
		super.bind();
		mHeader.bind();
		mContainer.bind();
	}

	@Override
	public void draw() {
		mHeader.draw();
		mContainer.draw();
	}
	
	
}
