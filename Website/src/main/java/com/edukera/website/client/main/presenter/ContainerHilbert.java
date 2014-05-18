package com.edukera.website.client.main.presenter;

import com.edukera.website.client.generic.presenter.ADraw;
import com.google.gwt.user.client.ui.Widget;


public interface ContainerHilbert extends ADraw<ContainerHilbert.Display> {

	interface Display extends ADraw.Display {
		void setQuote1Text(String iText);
		void setQuote2Text(String iText);
		void setQuote3Text(String iText);
		void addWrapper(Widget iWidget);
	}
}
