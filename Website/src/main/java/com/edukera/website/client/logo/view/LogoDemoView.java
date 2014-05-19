package com.edukera.website.client.logo.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.main.presenter.Footer;
import com.google.gwt.user.client.ui.Widget;

public class LogoDemoView extends ADivView implements Footer.Display {

	public LogoDemoView() {
		mRoot.addStyleName(STYLE.logoDemo());
	}

	public void addContainer(Widget iWidget) {

	}
	
}
