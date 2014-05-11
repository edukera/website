package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.Input;
import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.google.gwt.event.dom.client.HasBlurHandlers;
import com.google.gwt.event.dom.client.HasFocusHandlers;
import com.google.gwt.user.client.ui.TextBox;

public class InputView extends ADivView implements Input.Display {

	private final TextBox mInput;
	private final DivPanel mButton;
	
	public InputView() {
		mRoot.addStyleName(STYLE.input());
		
		mInput = new TextBox();
		mRoot.add(mInput);
		mInput.addStyleName(STYLE.inputInput());

		mButton = new DivPanel();
		mRoot.add(mButton);
		mButton.addStyleName(STYLE.inputButton());
		mButton.addStyleName(STYLE.transAll());
	}
	
	public HasFocusHandlers getHasFocusHandlers() {
		return mInput;
	}
	
	public HasBlurHandlers getHasBlurHandlers() {
		return mInput;
	}

	public void setInputText(String iText) {
		mInput.setText(iText);
	}

	public void setButtonText(String iText) {
		mButton.setText(iText);
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

}
