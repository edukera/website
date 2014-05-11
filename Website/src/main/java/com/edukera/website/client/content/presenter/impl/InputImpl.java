package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.content.presenter.Input;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class InputImpl extends BasePresenter<Input.Display> implements Input {

	private boolean mFirst;
	
	@Inject
	public InputImpl(EventBus eventBus, Input.Display display) {
		super(eventBus, display);
		display.setInputText("Entrez votre email");
		display.setButtonText("Me prévenir");
	}
	
	@Override
	public void bind() {
		super.bind();
		
		registerHandler(display.getHasFocusHandlers().addFocusHandler(new FocusHandler() {
			
			@Override
			public void onFocus(FocusEvent event) {
				doFocus();
			}

		}));
	}

	private void doFocus() {
		if (!mFirst) {
			mFirst = true;
			display.setFocus();
			display.clearInput();
		}
	}

	
}