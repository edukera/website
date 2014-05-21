package com.edukera.website.client.main.presenter;

import com.edukera.website.client.generic.presenter.ADraw;
import com.google.gwt.user.client.ui.Widget;


public interface ContainerAbout extends ADraw<ContainerAbout.Display> {

	interface Display extends ADraw.Display {
		void addWrapper(Widget iWidget);
	}
}
