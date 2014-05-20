package com.edukera.website.client.main.presenter;

import com.edukera.website.client.generic.presenter.ADraw;
import com.google.gwt.user.client.ui.Widget;


public interface Footer extends ADraw<Footer.Display> {

	interface Display extends ADraw.Display {
		void addContainer(Widget iWidget);

		void setCopyrightText(String iText);
	}
}
