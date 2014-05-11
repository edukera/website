package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.content.presenter.Input;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class InputImpl extends BasePresenter<Input.Display> implements Input {

	@Inject
	public InputImpl(EventBus eventBus, Input.Display display) {
		super(eventBus, display);
		display.setInputText("Entrez votre email");
		display.setButtonText("Me prévenir");
	}
	
	@Override
	public void bind() {
		super.bind();
	}
	
	
}
