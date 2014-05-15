package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.generic.presenter.impl.ADrawImpl;
import com.edukera.website.client.main.presenter.ContainerFeature;
import com.edukera.website.client.main.presenter.ContainerHilbert;
import com.edukera.website.client.main.presenter.ContainerSky;
import com.edukera.website.client.main.presenter.Footer;
import com.edukera.website.client.main.presenter.Header;
import com.edukera.website.client.main.presenter.Main;
import com.google.gwt.user.client.Window;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class MainImpl extends ADrawImpl<Main.Display> implements Main {

	private final Header mHeader;
	private final ContainerSky mContainerSky;
	private final ContainerFeature mContainerFeature;
	private final ContainerHilbert mContainerHilbert;
	private final Footer mFooter;
	
	@Inject
	public MainImpl(EventBus eventBus, Main.Display display) {
		super(eventBus, display);
		mHeader = EdukeraWebsite.ginjector.getHeader();
		mContainerSky = EdukeraWebsite.ginjector.getContainerSky();
		mContainerFeature = EdukeraWebsite.ginjector.getContainerFeature();
		mContainerHilbert = EdukeraWebsite.ginjector.getContainerHilbert();
		mFooter = EdukeraWebsite.ginjector.getFooter();
		
		display.add(mHeader.getDisplay().asWidget());
		display.add(mContainerSky.getDisplay().asWidget());
		display.add(mContainerFeature.getDisplay().asWidget());
		display.add(mContainerHilbert.getDisplay().asWidget());
		display.add(mFooter.getDisplay().asWidget());
	}
	
	@Override
	public void bind() {
		super.bind();
		mHeader.bind();
		mContainerSky.bind();
		mContainerFeature.bind();
		mContainerHilbert.bind();
		mFooter.bind();
	}

	@Override
	public void draw() {
		int lHeight = Window.getClientHeight();
		display.setHeight(lHeight);
		mHeader.draw();
		mContainerSky.draw();
		mContainerFeature.draw();
		mContainerHilbert.draw();
		mFooter.bind();
	}
	
	
}
