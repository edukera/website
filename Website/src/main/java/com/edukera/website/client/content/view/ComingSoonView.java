package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.ComingSoon;
import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;

public class ComingSoonView extends ADivView implements ComingSoon.Display {

	private final DivPanel mContent;
	
	public ComingSoonView() {
		mRoot.addStyleName(STYLE.comingSoon());
		
		mContent = new DivPanel();
		mRoot.add(mContent);
		mContent.addStyleName(STYLE.comingSoonContent());
	}
	
	public void setContentText(String iText) {
		mContent.setText(iText);
	}

}
