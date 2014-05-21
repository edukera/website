package com.edukera.website.client.main.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.edukera.website.client.main.presenter.ContainerFeature;
import com.google.gwt.user.client.ui.Widget;

public class ContainerFeatureView extends ADivView implements ContainerFeature.Display {

	private final DivPanel mWrapper;
	
	public ContainerFeatureView() {
		mRoot.addStyleName(STYLE.containerFeature());
		mRoot.addStyleName(STYLE.transAll());
		
		mWrapper = new DivPanel();
		mRoot.add(mWrapper);
		mWrapper.addStyleName(STYLE.containerFeatureWrapper());
	}
	
	public void addWrapper(Widget iWidget) {
		mWrapper.add(iWidget);
	}
}
