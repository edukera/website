package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.Logo;
import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.edukera.website.client.generic.widget.SpanPanel;

public class LogoView extends ADivView implements Logo.Display {

	private final DivPanel mWrapper;
	private final SpanPanel mQedu;
	private final SpanPanel mMath;
	private final SpanPanel mLogoWrapper;
	private final SpanPanel mLogoContent;
	
	public LogoView() {
		mRoot.addStyleName(STYLE.logo());
		
		mWrapper = new DivPanel();
		mRoot.add(mWrapper);
		mWrapper.addStyleName(STYLE.logoWrapper());
		
		mQedu = new SpanPanel();
		mWrapper.add(mQedu);
		mQedu.addStyleName(STYLE.logoQedu());
		
		mMath = new SpanPanel();
		mWrapper.add(mMath);
		mMath.addStyleName(STYLE.logoMath());
		
		mLogoWrapper = new SpanPanel();
		mWrapper.add(mLogoWrapper);
		mLogoWrapper.addStyleName(STYLE.logoLogoWrapper());

		mLogoContent = new SpanPanel();
		mLogoWrapper.add(mLogoContent);
		mLogoContent.addStyleName(STYLE.logoLogoContent());
		mLogoContent.setText("j");
	}
	
	public void setEdukText(String iText) {
		mQedu.setText(iText);
	}
	
	public void setEraText(String iText) {
		mMath.setText(iText);
	}
	
}
