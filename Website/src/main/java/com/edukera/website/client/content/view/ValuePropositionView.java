package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.ValueProposition;
import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;

public class ValuePropositionView extends ADivView implements ValueProposition.Display {

	private final DivPanel mTitle;
	private final DivPanel mContainer;
	private final DivPanel mFirstLine;
	private final DivPanel mSecondLine;
	
	public ValuePropositionView() {
		mRoot.addStyleName(STYLE.valueProposition());
		
		mTitle = new DivPanel();
		mRoot.add(mTitle);
		mTitle.addStyleName(STYLE.valuePropositionTitle());
		
		mContainer = new DivPanel();
		mRoot.add(mContainer);
		mContainer.addStyleName(STYLE.valuePropositionContainer());
		
		mFirstLine = new DivPanel();
		mContainer.add(mFirstLine);
		mFirstLine.addStyleName(STYLE.valuePropositionFirstline());
		
		mSecondLine = new DivPanel();
		mContainer.add(mSecondLine);
		mSecondLine.addStyleName(STYLE.valuePropositionSecondline());
	}

	@Override
	public void setTitleText(String iText) {
		mTitle.setText(iText);
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
