package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.Presenter;
import com.edukera.website.client.generic.view.ADisplay;
import com.google.gwt.user.client.ui.Widget;


public interface Logo extends Presenter<Logo.Display> {

	interface Display extends ADisplay {
		void setQeduText(String iText);
		void setMathText(String iText);
		void addProposition(Widget iWidget);
	}
}
