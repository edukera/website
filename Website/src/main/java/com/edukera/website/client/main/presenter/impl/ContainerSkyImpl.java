package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.Input;
import com.edukera.website.client.content.presenter.Launch;
import com.edukera.website.client.content.presenter.Soon;
import com.edukera.website.client.content.presenter.ValueProposition;
import com.edukera.website.client.generic.presenter.impl.ADrawImpl;
import com.edukera.website.client.main.presenter.ContainerSky;
import com.google.gwt.user.client.Window;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ContainerSkyImpl extends ADrawImpl<ContainerSky.Display> implements ContainerSky {

	private final ValueProposition mValueProposition;
	private final Soon mSoon;
	private final Input mInput;
	private final Launch mLaunch;
	
	@Inject
	public ContainerSkyImpl(EventBus eventBus, ContainerSky.Display display) {
		super(eventBus, display);
		mValueProposition = EdukeraWebsite.ginjector.getValueProposition();
		display.addWrapper(mValueProposition.getDisplay().asWidget());
		
		mSoon = EdukeraWebsite.ginjector.getSoon();
		display.addWrapper(mSoon.getDisplay().asWidget());
		
		mInput = EdukeraWebsite.ginjector.getInput();
		display.addWrapper(mInput.getDisplay().asWidget());
		
		mLaunch = EdukeraWebsite.ginjector.getLaunch();
//		display.addWrapper(mLaunch.getDisplay().asWidget());
	}
	
	@Override
	public void bind() {
		super.bind();
		mValueProposition.bind();
		mSoon.bind();
		mInput.bind();
		mLaunch.bind();
	}

	@Override
	public void draw() {
		int lHeight = Window.getClientHeight() - 70;
		if (lHeight < 500) {
			lHeight = 500;
		}
		display.setHeight(lHeight);
		mValueProposition.draw();
		mSoon.draw();
		mInput.draw();
		mLaunch.draw();
	}
	
}
