package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.Input;
import com.edukera.website.client.data.DataResources;
import com.edukera.website.client.data.WebsiteKeys;
import com.edukera.website.client.generic.presenter.impl.ADrawImpl;
import com.edukera.website.client.resources.GAnalyticsTools;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
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

		registerHandler(display.getHasKeyDownHandler().addKeyDownHandler(new KeyDownHandler() {

			@Override
			public void onKeyDown(KeyDownEvent iEvent) {
				doKeyDown(iEvent);
			}
		}));
	}

	private void doKeyDown(KeyDownEvent iEvent) {
		int lKeyCode = iEvent.getNativeEvent().getKeyCode();
		switch (lKeyCode) {
		case KeyCodes.KEY_ENTER:
			doClickButton();
			break;
		case KeyCodes.KEY_ESCAPE:
			clearAll();
			break;
		default:
			break;
		}
	}

	private void clearAll() {
		String lInput = DataResources.getInstance().getContent(WebsiteKeys.INPUTINPUT);
		display.setInputText(lInput);
		display.unsetFocus();
		display.setFocus(false);
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
		GAnalyticsTools.clickButton();
		if (lEmail != null &&
				checkEmail(lEmail)) {
			GAnalyticsTools.validEmail();
			EdukeraWebsite.ginjector.getMain().saveEmail(lEmail);
		} else {
			GAnalyticsTools.malformedEmail();
			mState = State.malformed;
			draw();
		}
	}

	public void draw() {
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
			display.hideInput();
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
