package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.Input;
import com.edukera.website.client.data.DataResources;
import com.edukera.website.client.data.WebsiteKeys;
import com.edukera.website.client.generic.presenter.impl.ADrawImpl;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class InputImpl extends ADrawImpl<Input.Display> implements Input {

	private Boolean mFirst;
	private State mState;
	
	@Inject
	public InputImpl(EventBus eventBus, Input.Display display) {
		super(eventBus, display);
		mFirst = false;
		mState = State.blank;
	}
	
	@Override
	public void bind() {
		super.bind();
		
		registerHandler(display.getButtonHasClickHandlers().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				doClickButton();
			}

		}));
		
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

	private void doClickButton() {
		String lEmail = display.getInputText();
		if (lEmail != null &&
				checkEmail(lEmail)) {
			EdukeraWebsite.ginjector.getMain().saveEmail(lEmail);
		} else {
			mState = State.malformed;
			draw();
		}
	}
	
	public void draw() {
		EdukeraWebsite.ginjector.getTools().sendText("la");
		if (!mFirst) {
			String lInput = DataResources.getInstance().getContent(WebsiteKeys.INPUTINPUT);
			display.setInputText(lInput);
		}

		String lButton = DataResources.getInstance().getContent(WebsiteKeys.INPUTBUTTON);
		display.setButtonText(lButton);
		
		display.unsetSavedMode();
		display.unsetErrorMode();
		switch (mState) {
		case saved:
			display.setSavedMode();
			String lSaved = DataResources.getInstance().getContent(WebsiteKeys.INPUT_EMAIL_SAVED);
			display.setMessageText(lSaved);
			break;
			
		case duplicate:
			display.setErrorMode();
			String lDuplicate = DataResources.getInstance().getContent(WebsiteKeys.INPUT_EMAIL_DUPLICATE);
			display.setMessageText(lDuplicate);
			break;
			
		case malformed:
			display.setErrorMode();
			String lMalformed = DataResources.getInstance().getContent(WebsiteKeys.INPUT_EMAIL_MALFORMED);
			display.setMessageText(lMalformed);
			break;

		case error:
			display.setErrorMode();
			String lError = DataResources.getInstance().getContent(WebsiteKeys.INPUT_EMAIL_ERROR);
			display.setMessageText(lError);
			break;
			
		default:
			display.setMessageText("");
		}
	}

	public void setState(State iState) {
		mState = iState;
	}
		
	private boolean checkEmail(String iEmail) {
		return iEmail.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$");
	}
}
