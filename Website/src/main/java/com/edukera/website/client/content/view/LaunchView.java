package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.Launch;
import com.edukera.website.client.generic.view.ADivView;

public class LaunchView extends ADivView implements Launch.Display {

	
	public LaunchView() {
		mRoot.addStyleName(STYLE.launch());
	}

	@Override
	public void setContentText(String iText) {
		mRoot.setText(iText);
	}
	
}
