package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.Presenter;
import com.edukera.website.client.generic.view.ADisplay;


public interface Input extends Presenter<Input.Display> {

	interface Display extends ADisplay {
		void setInputText(String iText);
		void setButtonText(String iText);
	}
}
