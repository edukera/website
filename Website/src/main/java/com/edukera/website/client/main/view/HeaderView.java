package com.edukera.website.client.main.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.edukera.website.client.main.presenter.Header;
import com.google.gwt.user.client.ui.Widget;

public class HeaderView extends ADivView implements Header.Display {
	
	private final DivPanel mContainer;
	
	public HeaderView() {
		mRoot.addStyleName(STYLE.header());
		mRoot.addStyleName(STYLE.transAll());
		
		mContainer = new DivPanel();
		mRoot.add(mContainer);
		mContainer.addStyleName(STYLE.headerContainer());
	}

	public void addContainer(Widget iWidget) {
		mContainer.add(iWidget);
	}
}
