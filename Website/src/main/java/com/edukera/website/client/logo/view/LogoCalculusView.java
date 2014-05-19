package com.edukera.website.client.logo.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.logo.presenter.LogoCalculus;
import com.google.gwt.user.client.ui.Widget;

public class LogoCalculusView extends ADivView implements LogoCalculus.Display {

	public LogoCalculusView() {
		mRoot.addStyleName(STYLE.logoCalculus());
	}

	public void addContainer(Widget iWidget) {

	}
	
}
