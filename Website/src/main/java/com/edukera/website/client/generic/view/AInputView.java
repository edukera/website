package com.edukera.website.client.generic.view;

import com.edukera.website.client.generic.widget.InputPanel;


public abstract class AInputView extends AView<InputPanel> {

	public AInputView() {
		mRoot = new InputPanel();
		initWidget(mRoot);
	}

}
