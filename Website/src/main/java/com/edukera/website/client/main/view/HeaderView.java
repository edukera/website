package com.edukera.website.client.main.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.main.presenter.Header;

public class HeaderView extends ADivView implements Header.Display {
	
	public HeaderView() {
		mRoot.addStyleName(STYLE.header());
	}

}
