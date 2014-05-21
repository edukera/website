package com.edukera.website.client.main.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.edukera.website.client.main.presenter.ContainerAbout;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Widget;

public class ContainerAboutView extends ADivView implements ContainerAbout.Display {

	private final DivPanel mWrapper;
	private final DivPanel mContent;
	
	public ContainerAboutView() {
		mRoot.addStyleName(STYLE.containerAbout());
		
		mWrapper = new DivPanel();
		mRoot.add(mWrapper);
		mWrapper.addStyleName(STYLE.containerAboutWrapper());
		
		mContent = new DivPanel();
		mWrapper.add(mContent);
		mContent.addStyleName(STYLE.aboutContent());
	}
	
	public void addContent(Widget iWidget) {
		mContent.add(iWidget);
	}
	
	public void setHeight(double iHeight) {
		super.setHeight(iHeight);
		mWrapper.getElement().getStyle().setHeight(iHeight, Unit.PX);
	}
}
