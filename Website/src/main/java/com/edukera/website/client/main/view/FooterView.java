package com.edukera.website.client.main.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.edukera.website.client.main.presenter.Footer;
import com.google.gwt.user.client.ui.Widget;

public class FooterView extends ADivView implements Footer.Display {

	private final DivPanel mContainer;
	private final DivPanel mW;
	private final DivPanel mCopyright;
	
	public FooterView() {
		mRoot.addStyleName(STYLE.footer());
		
		mContainer = new DivPanel();
		mRoot.add(mContainer);
		mContainer.addStyleName(STYLE.footerContainer());
		
		mW = new DivPanel();
		mContainer.add(mW);
		
		mCopyright = new DivPanel();
		mContainer.add(mCopyright);
		mCopyright.addStyleName(STYLE.copyright());
	}

	public void addContainer(Widget iWidget) {
		mW.add(iWidget);
	}

	@Override
	public void setCopyrightText(String iText) {
		mCopyright.setText(iText);
	}
	
}
