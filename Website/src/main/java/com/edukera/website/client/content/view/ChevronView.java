package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.Chevron;
import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;

public class ChevronView extends ADivView implements Chevron.Display {

	private final DivPanel mContent;
	
	public ChevronView() {
		mRoot.addStyleName(STYLE.chevron());
		
		mContent = new DivPanel();
		mRoot.add(mContent);
		mContent.addStyleName(STYLE.chevronContent());
		mContent.setText("j");
	}
	
}
