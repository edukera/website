package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.Input;
import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.google.gwt.event.dom.client.HasBlurHandlers;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.HasFocusHandlers;
import com.google.gwt.event.dom.client.HasKeyDownHandlers;
import com.google.gwt.event.dom.client.HasKeyPressHandlers;
import com.google.gwt.event.dom.client.HasKeyUpHandlers;
import com.google.gwt.user.client.ui.TextBox;

public class InputView extends ADivView implements Input.Display {

	private final TextBox mInput;
	private final DivPanel mButton;
	private final DivPanel mButtonContent;
	private final DivPanel mMessage;
	private final DivPanel mMessageContent;
	
	
	public InputView() {
		mRoot.addStyleName(STYLE.input());
		
		mInput = new TextBox();
		mRoot.add(mInput);
		mInput.addStyleName(STYLE.inputInput());

		mButton = new DivPanel();
		mRoot.add(mButton);
		mButton.addStyleName(STYLE.inputButton());
		mButton.addStyleName(STYLE.transAll());
		
		mButtonContent = new DivPanel();
		mButton.add(mButtonContent);
		mButtonContent.addStyleName(STYLE.inputButtonContent());
		
		mMessage = new DivPanel();
		mRoot.add(mMessage);
		mMessage.addStyleName(STYLE.inputMessage());
		mMessage.addStyleName(STYLE.transAll());
		
		mMessageContent = new DivPanel();
		mMessage.add(mMessageContent);
		mMessageContent.addStyleName(STYLE.inputMessageContent());
	}
	
	public HasFocusHandlers getHasFocusHandlers() {
		return mInput;
	}
	
	public HasBlurHandlers getHasBlurHandlers() {
		return mInput;
	}
	
	public HasClickHandlers getButtonHasClickHandlers() {
		return mButton;
	}

	public void setInputText(String iText) {
		mInput.setText(iText);
	}

	public void setButtonText(String iText) {
		mButtonContent.setText(iText);
	}

	@Override
	public void setFocus() {
		mInput.addStyleName(STYLE.focus());
	}

	@Override
	public void unsetFocus() {
		mInput.removeStyleName(STYLE.focus());
	}

	@Override
	public void clearInput() {
		mInput.setText("");
	}
	
	public String getInputText() {
		return mInput.getText();
	}

	@Override
	public void setSavedMode() {
		mRoot.addStyleName(STYLE.saved());
	}

	@Override
	public void unsetSavedMode() {
		mRoot.removeStyleName(STYLE.saved());
	}
	
	@Override
	public void setErrorMode() {
		mRoot.addStyleName(STYLE.error());
	}

	@Override
	public void unsetErrorMode() {
		mRoot.removeStyleName(STYLE.error());
	}

	@Override
	public void setMessageText(String iText) {
		mMessageContent.setText(iText);
	}
	
	public HasKeyUpHandlers getHasKeyUpHandlers() {
		return mInput;
	}
	
	public HasKeyDownHandlers getHasKeyDownHandler() {
		return mInput;
	}

	public HasKeyPressHandlers getHasKeyPressHandlers() {
		return mInput;
	}
	
	public void setFocus(boolean iFocus) {
		mInput.setFocus(iFocus);
	}
	
}
