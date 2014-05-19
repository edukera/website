package com.edukera.website.client.logo.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.logo.presenter.LogoReasoning;
import com.google.gwt.user.client.ui.Widget;

public class LogoReasoningView extends ADivView implements LogoReasoning.Display {

	public LogoReasoningView() {
		mRoot.addStyleName(STYLE.logoReasoning());
	}

	public void addContainer(Widget iWidget) {

	}
	
}
