package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.Input;
import com.edukera.website.client.content.presenter.ValueProposition;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.edukera.website.client.main.presenter.Container;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ContainerImpl extends BasePresenter<Container.Display> implements Container {

	private final ValueProposition mValueProposition;
	private final Input mInput;
	
	@Inject
	public ContainerImpl(EventBus eventBus, Container.Display display) {
		super(eventBus, display);
		mValueProposition = EdukeraWebsite.ginjector.getValueProposition();
		display.addWrapper(mValueProposition.getDisplay().asWidget());
		
		mInput = EdukeraWebsite.ginjector.getInput();
		display.addWrapper(mInput.getDisplay().asWidget());
	}
	
	@Override
	public void bind() {
		super.bind();
		mValueProposition.bind();
		mInput.bind();
	}
	
	
}
