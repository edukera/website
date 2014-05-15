package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.ADraw;
import com.google.gwt.event.dom.client.HasClickHandlers;


public interface ButtonLanguage extends ADraw<ButtonLanguage.Display> {

	interface Display extends ADraw.Display {
		void setContent(String iText);
		HasClickHandlers addLanguage(String iLanguage, String iDescription);
		void clearMenu();
		void all();
	}

}
