package com.edukera.website.client.main.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.edukera.website.client.generic.widget.ImgPanel;
import com.edukera.website.client.main.presenter.Container;
import com.google.gwt.user.client.ui.Widget;

public class ContainerView extends ADivView implements Container.Display {

	private ImgPanel mImg;
	private final DivPanel mWrapper;
	
	public ContainerView() {
		mRoot.addStyleName(STYLE.container());
		
		mImg = new ImgPanel();
		mRoot.add(mImg);
		mImg.addStyleName(STYLE.containerImg());
		mImg.getElement().setAttribute("src", "../style/img/sky.jpg");
		
		mWrapper = new DivPanel();
		mRoot.add(mWrapper);
		mWrapper.addStyleName(STYLE.containerWrapper());
	}
	
	public void addWrapper(Widget iWidget) {
		mWrapper.add(iWidget);
	}
}
