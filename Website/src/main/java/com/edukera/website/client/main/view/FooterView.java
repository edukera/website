package com.edukera.website.client.main.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.edukera.website.client.main.presenter.Footer;
import com.google.gwt.user.client.ui.Widget;

public class FooterView extends ADivView implements Footer.Display {

	private final DivPanel mContainer;
	
	public FooterView() {
		mRoot.addStyleName(STYLE.footer());
		
		mContainer = new DivPanel();
		mRoot.add(mContainer);
		mContainer.addStyleName(STYLE.footerContainer());
	}

	public void addContainer(Widget iWidget) {
		mContainer.add(iWidget);
	}
	
}
