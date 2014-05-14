package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.ADraw;
import com.google.gwt.event.dom.client.HasBlurHandlers;
import com.google.gwt.event.dom.client.HasFocusHandlers;


public interface Input extends ADraw<Input.Display> {

	interface Display extends ADraw.Display {
		HasFocusHandlers getHasFocusHandlers();
		HasBlurHandlers getHasBlurHandlers();
		void setInputText(String iText);
		void setButtonText(String iText);
		void setFocus();
		void unsetFocus();
		void clearInput();
	}
}
