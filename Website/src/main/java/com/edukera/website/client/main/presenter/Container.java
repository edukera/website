package com.edukera.website.client.main.presenter;

import com.edukera.website.client.generic.presenter.ADraw;
import com.google.gwt.user.client.ui.Widget;


public interface Container extends ADraw<Container.Display> {

	interface Display extends ADraw.Display {
		void addWrapper(Widget iWidget);
	}
}
