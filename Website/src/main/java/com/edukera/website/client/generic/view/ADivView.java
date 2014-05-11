package com.edukera.website.client.generic.view;

import com.edukera.website.client.generic.widget.DivPanel;


public abstract class ADivView extends AView<DivPanel> {

	public ADivView() {
		mRoot = new DivPanel();
		initWidget(mRoot);
		this.getElement().setAttribute("classe", this.getClass().getName());
	}
}
