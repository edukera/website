package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.TagPhrase;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.edukera.website.client.main.presenter.Container;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ContainerImpl extends BasePresenter<Container.Display> implements Container {

	private final TagPhrase mTagPhrase;
	
	@Inject
	public ContainerImpl(EventBus eventBus, Container.Display display) {
		super(eventBus, display);
		mTagPhrase = EdukeraWebsite.ginjector.getTagPhrase();
		display.add(mTagPhrase.getDisplay().asWidget());
	}
	
	@Override
	public void bind() {
		super.bind();
		mTagPhrase.bind();
	}
	
	
}
