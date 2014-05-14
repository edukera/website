package com.edukera.website.client.main.presenter;

import com.edukera.website.client.generic.presenter.Presenter;
import com.edukera.website.client.generic.view.ADisplay;
import com.google.gwt.user.client.ui.Widget;


public interface Container2 extends Presenter<Container2.Display> {

	interface Display extends ADisplay {
		void addWrapper(Widget iWidget);
	}
}
