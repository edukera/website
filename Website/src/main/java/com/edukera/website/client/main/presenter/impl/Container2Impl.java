package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.Input;
import com.edukera.website.client.content.presenter.Soon;
import com.edukera.website.client.content.presenter.ValueProposition;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.edukera.website.client.main.presenter.Container2;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class Container2Impl extends BasePresenter<Container2.Display> implements Container2 {

	private final ValueProposition mValueProposition;
	private final Soon mSoon;
	private final Input mInput;
	
	@Inject
	public Container2Impl(EventBus eventBus, Container2.Display display) {
		super(eventBus, display);
		mValueProposition = EdukeraWebsite.ginjector.getValueProposition();
		display.addWrapper(mValueProposition.getDisplay().asWidget());
		
		mSoon = EdukeraWebsite.ginjector.getSoon();
		display.addWrapper(mSoon.getDisplay().asWidget());
		
		mInput = EdukeraWebsite.ginjector.getInput();
		display.addWrapper(mInput.getDisplay().asWidget());
	}
	
	@Override
	public void bind() {
		super.bind();
		mValueProposition.bind();
		mSoon.bind();
		mInput.bind();
	}
	
	
}
