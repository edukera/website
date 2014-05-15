package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.About;
import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;

public class AboutView extends ADivView implements About.Display {

	private final DivPanel mContent;
	
	public AboutView() {
		mRoot.addStyleName(STYLE.about());
		
		mContent = new DivPanel();
		mRoot.add(mContent);
		mContent.addStyleName(STYLE.aboutContent());
		mContent.addStyleName(STYLE.transAll());
	}
	
	public void setContentText(String iText) {
		mContent.setText(iText);
	}

}
