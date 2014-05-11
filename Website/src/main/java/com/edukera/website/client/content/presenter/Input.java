package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.Presenter;
import com.edukera.website.client.generic.view.ADisplay;
import com.google.gwt.event.dom.client.HasBlurHandlers;
import com.google.gwt.event.dom.client.HasFocusHandlers;


public interface Input extends Presenter<Input.Display> {

	interface Display extends ADisplay {
		HasFocusHandlers getHasFocusHandlers();
		HasBlurHandlers getHasBlurHandlers();
		void setInputText(String iText);
		void setButtonText(String iText);
		void setFocus();
		void unsetFocus();
		void clearInput();
	}
}
