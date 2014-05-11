package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.Logo;
import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.edukera.website.client.generic.widget.SpanPanel;
import com.google.gwt.user.client.ui.Widget;

public class LogoView extends ADivView implements Logo.Display {

	private final DivPanel mWrapper;
	private final SpanPanel mQedu;
	private final SpanPanel mMath;
	private final SpanPanel mLogoWrapper;
	private final SpanPanel mLogoContent;
	private final DivPanel mProposition;
	
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
		mLogoContent.getElement().setAttribute("data-icon", "j");
		
		mProposition = new DivPanel();
		mRoot.add(mProposition);
		mProposition.addStyleName(STYLE.logoProposition());
		
	}
	
	public void setQeduText(String iText) {
		mQedu.setText(iText);
	}
	
	public void setMathText(String iText) {
		mMath.setText(iText);
	}
	
	public void addProposition(Widget iWidget) {
		mProposition.add(iWidget);
	}
	
}
