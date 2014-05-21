package com.edukera.website.client.main.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.main.presenter.Main;

public class MainView extends ADivView implements Main.Display {

	public MainView() {
		mRoot.addStyleName(STYLE.main());
	}

	@Override
	public void setAbout() {
		mRoot.addStyleName(STYLE.about());
	}

	@Override
	public void unsetAbout() {
		mRoot.removeStyleName(STYLE.about());
	}
	
}
