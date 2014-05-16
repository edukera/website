package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.ADraw;
import com.google.gwt.event.dom.client.HasBlurHandlers;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.HasFocusHandlers;


public interface Input extends ADraw<Input.Display> {

	public static enum State {
		blank,
		fill,
		saved,
		malformed,
		duplicate,
		error
	}
	
	interface Display extends ADraw.Display {
		HasClickHandlers getButtonHasClickHandlers();
		HasFocusHandlers getHasFocusHandlers();
		HasBlurHandlers getHasBlurHandlers();
		String getInputText();
		void setInputText(String iText);
		void setButtonText(String iText);
		void setFocus();
		void unsetFocus();
		void clearInput();
		void setMessageText(String iText);
		void setSavedMode();
		void unsetSavedMode();
		void setErrorMode();
		void unsetErrorMode();
	}

	void setState(State iState);
}
