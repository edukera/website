package com.edukera.website.client.main.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.edukera.website.client.main.presenter.ContainerHilbert;

public class ContainerHilbertView extends ADivView implements ContainerHilbert.Display {

	private final DivPanel mWrapper;
	private final DivPanel mQuote;
	
	public ContainerHilbertView() {
		mRoot.addStyleName(STYLE.containerHilbert());
		
		mWrapper = new DivPanel();
		mRoot.add(mWrapper);
		mWrapper.addStyleName(STYLE.containerHibertWrapper());
		
		mQuote = new DivPanel();
		mWrapper.add(mQuote);
		mQuote.addStyleName(STYLE.quote());
	}
	
	@Override
	public void setQuoteText(String iText) {
		mQuote.setText(iText);
	}
}
