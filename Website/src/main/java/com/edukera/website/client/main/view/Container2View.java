package com.edukera.website.client.main.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.edukera.website.client.main.presenter.Container2;
import com.google.gwt.user.client.ui.Widget;

public class Container2View extends ADivView implements Container2.Display {

	private final DivPanel mWrapper;
	
	public Container2View() {
		mRoot.addStyleName(STYLE.container2());
		
		mWrapper = new DivPanel();
		mRoot.add(mWrapper);
		mWrapper.addStyleName(STYLE.container2Wrapper());
	}
	
	public void addWrapper(Widget iWidget) {
		mWrapper.add(iWidget);
	}
}
