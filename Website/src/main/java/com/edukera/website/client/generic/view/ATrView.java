package com.edukera.website.client.generic.view;

import com.edukera.website.client.generic.widget.TrPanel;


public abstract class ATrView extends AView<TrPanel> {

	public ATrView() {
		mRoot = new TrPanel();
		initWidget(mRoot);
	}
}
