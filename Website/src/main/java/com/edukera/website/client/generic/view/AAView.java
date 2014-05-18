package com.edukera.website.client.generic.view;

import com.edukera.website.client.generic.widget.AAPanel;


public abstract class AAView extends AView<AAPanel> {

	public AAView() {
		mRoot = new AAPanel();
		initWidget(mRoot);
	}
}
