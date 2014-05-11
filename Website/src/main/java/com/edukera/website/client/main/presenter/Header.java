package com.edukera.website.client.main.presenter;

import com.edukera.website.client.generic.presenter.Presenter;
import com.edukera.website.client.generic.view.ADisplay;
import com.google.gwt.user.client.ui.Widget;


public interface Header extends Presenter<Header.Display> {

	interface Display extends ADisplay {
		void addContainer(Widget iWidget);
	}
}
