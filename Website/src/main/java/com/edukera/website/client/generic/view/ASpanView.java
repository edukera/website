package com.edukera.website.client.generic.view;

import com.edukera.website.client.generic.widget.SpanPanel;


public abstract class ASpanView extends AView<SpanPanel> {

	public ASpanView() {
		mRoot = new SpanPanel();
		initWidget(mRoot);
	}

}
