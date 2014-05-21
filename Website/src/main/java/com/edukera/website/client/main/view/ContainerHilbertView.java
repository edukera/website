package com.edukera.website.client.main.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.edukera.website.client.generic.widget.SpanPanel;
import com.edukera.website.client.main.presenter.ContainerHilbert;
import com.google.gwt.user.client.ui.Widget;

public class ContainerHilbertView extends ADivView implements ContainerHilbert.Display {

	private final DivPanel mWrapper;
	private final DivPanel mQuote;
	private final SpanPanel mOpen;
	private final SpanPanel mQuote1;
	private final SpanPanel mQuote2;
	private final SpanPanel mQuote3;
	private final SpanPanel mClose;

	public ContainerHilbertView() {
		mRoot.addStyleName(STYLE.containerHilbert());
		
		mWrapper = new DivPanel();
		mRoot.add(mWrapper);
		mWrapper.addStyleName(STYLE.containerHibertWrapper());

		mQuote = new DivPanel();
		mWrapper.add(mQuote);
		mQuote.addStyleName(STYLE.quote());

		mOpen = new SpanPanel();
		mQuote.add(mOpen);
		mOpen.addStyleName(STYLE.quoteOpen());
		mOpen.setText("b");

		mQuote1 = new SpanPanel();
		mQuote.add(mQuote1);
		mQuote1.addStyleName(STYLE.quote1());
		
		mQuote2 = new SpanPanel();
		mQuote.add(mQuote2);
		mQuote2.addStyleName(STYLE.quote2());

		mQuote3 = new SpanPanel();
		mQuote.add(mQuote3);
		mQuote3.addStyleName(STYLE.quote3());
		
		mClose = new SpanPanel();
		mQuote.add(mClose);
		mClose.addStyleName(STYLE.quoteClose());
		mClose.setText("b");
	}


	@Override
	public void setQuote1Text(String iText) {
		mQuote1.setText(iText);
	}

	@Override
	public void setQuote2Text(String iText) {
		mQuote2.setText(iText);
	}

	@Override
	public void setQuote3Text(String iText) {
		mQuote3.setText(iText);
	}


	@Override
	public void addWrapper(Widget iWidget) {
		mWrapper.add(iWidget);
	}
	
}
