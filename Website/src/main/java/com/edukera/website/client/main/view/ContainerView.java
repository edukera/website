package com.edukera.website.client.main.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.main.presenter.Container;

public class ContainerView extends ADivView implements Container.Display {

	public ContainerView() {
		mRoot.addStyleName(STYLE.container());
	}
	
}
