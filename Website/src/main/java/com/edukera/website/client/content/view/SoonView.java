package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.Soon;
import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;

public class SoonView extends ADivView implements Soon.Display {

	private final DivPanel mFirstLine;
	private final DivPanel mSecondLine;
	
	public SoonView() {
		mRoot.addStyleName(STYLE.soon());
		
		mFirstLine = new DivPanel();
		mRoot.add(mFirstLine);
		mFirstLine.addStyleName(STYLE.soonFirstline());
		
		mSecondLine = new DivPanel();
		mRoot.add(mSecondLine);
		mSecondLine.addStyleName(STYLE.soonSecondline());
	}

	@Override
	public void setFirstLineText(String iText) {
		mFirstLine.setText(iText);
	}

	@Override
	public void setSecondLineText(String iText) {
		mSecondLine.setText(iText);
	}

}
