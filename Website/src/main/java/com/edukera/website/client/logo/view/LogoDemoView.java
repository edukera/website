package com.edukera.website.client.logo.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.edukera.website.client.logo.presenter.LogoDemo;

public class LogoDemoView extends ADivView implements LogoDemo.Display {

	private final DivPanel m0;
	private final DivPanel m1;
	private final DivPanel m2;
	private final DivPanel m3;
	
	public LogoDemoView() {
		mRoot.addStyleName(STYLE.logoDemo());
		
		m0 = new DivPanel();
		mRoot.add(m0);
		m0.addStyleName(STYLE.logoDemoM0());
		m0.setText("à");
		
		m1 = new DivPanel();
		mRoot.add(m1);
		m1.addStyleName(STYLE.logoDemoM1());
		m1.setText("à");
		
		m2 = new DivPanel();
		mRoot.add(m2);
		m2.addStyleName(STYLE.logoDemoM2());
		m2.setText("à");
		
		m3 = new DivPanel();
		mRoot.add(m3);
		m3.addStyleName(STYLE.logoDemoM3());
		m3.setText("à");
	}

}
