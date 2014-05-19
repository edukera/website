package com.edukera.website.client.logo.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.logo.presenter.LogoDemo;
import com.google.gwt.user.client.ui.Widget;

public class LogoDemoView extends ADivView implements LogoDemo.Display {

	public LogoDemoView() {
		mRoot.addStyleName(STYLE.logoDemo());
	}

	public void addContainer(Widget iWidget) {

	}
	
}
