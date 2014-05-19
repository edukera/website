package com.edukera.website.client.logo.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.edukera.website.client.logo.presenter.LogoReasoning;

public class LogoReasoningView extends ADivView implements LogoReasoning.Display {

	private final DivPanel m0;
	private final DivPanel m1;
	private final DivPanel m2;
	
	public LogoReasoningView() {
		mRoot.addStyleName(STYLE.logoReasoning());
		
		m0 = new DivPanel();
		mRoot.add(m0);
		m0.addStyleName(STYLE.logoReasoningM0());
		m0.setText("à");
		
		m1 = new DivPanel();
		mRoot.add(m1);
		m1.addStyleName(STYLE.logoReasoningM1());
		m1.setText("à");
		
		m2 = new DivPanel();
		mRoot.add(m2);
		m2.addStyleName(STYLE.logoReasoningM2());
		m2.setText("à");	
	}		
	
}
