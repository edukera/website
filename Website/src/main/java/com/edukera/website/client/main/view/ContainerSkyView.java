package com.edukera.website.client.main.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.edukera.website.client.main.presenter.ContainerSky;
import com.google.gwt.user.client.ui.Widget;

public class ContainerSkyView extends ADivView implements ContainerSky.Display {

	private final DivPanel mWrapper;
	
	public ContainerSkyView() {
		mRoot.addStyleName(STYLE.container());
		
		mWrapper = new DivPanel();
		mRoot.add(mWrapper);
		mWrapper.addStyleName(STYLE.containerWrapper());
	}
	
	public void addWrapper(Widget iWidget) {
		mWrapper.add(iWidget);
	}
}
