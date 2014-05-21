package com.edukera.website.client.main.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.edukera.website.client.main.presenter.ContainerAbout;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Widget;

public class ContainerAboutView extends ADivView implements ContainerAbout.Display {

	private final DivPanel mWrapper;
	
	public ContainerAboutView() {
		mRoot.addStyleName(STYLE.containerAbout());
		
		mWrapper = new DivPanel();
		mRoot.add(mWrapper);
		mWrapper.addStyleName(STYLE.containerAboutWrapper());
	}
	
	public void addWrapper(Widget iWidget) {
		mWrapper.add(iWidget);
	}
	
	public void setHeight(double iHeight) {
		super.setHeight(iHeight);
		mWrapper.getElement().getStyle().setHeight(iHeight, Unit.PX);
	}
}
