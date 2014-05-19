package com.edukera.website.client.logo.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.edukera.website.client.logo.presenter.LogoCalculus;

public class LogoCalculusView extends ADivView implements LogoCalculus.Display {

	private final DivPanel mLogo;
	private final DivPanel mOperators;
	
	public LogoCalculusView() {
		mRoot.addStyleName(STYLE.logoCalculus());
		
		mLogo = new DivPanel();
		mRoot.add(mLogo);
		mLogo.addStyleName(STYLE.logoCalculusLogo());
		mLogo.setText("(");

		mOperators = new DivPanel();
		mRoot.add(mOperators);
		mOperators.addStyleName(STYLE.logoCalculusOperator());
		mOperators.setText("^");
	}

}
