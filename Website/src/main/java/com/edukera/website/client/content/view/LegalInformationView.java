package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.LegalInformation;
import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;

public class LegalInformationView extends ADivView implements LegalInformation.Display {

	private final DivPanel mTitle;
	private final DivPanel mWrapper;
	private final DivPanel mLegal1;
	private final DivPanel mLegal2;
	private final DivPanel mLegal3;
	
	public LegalInformationView() {
		mRoot.addStyleName(STYLE.aboutSection());
		
		mTitle = new DivPanel();
		mRoot.add(mTitle);
		mTitle.addStyleName(STYLE.aboutTitle());

		mWrapper = new DivPanel();
		mRoot.add(mWrapper);
		mWrapper.addStyleName(STYLE.aboutWrapper());

		mLegal1 = new DivPanel();
		mWrapper.add(mLegal1);
		mLegal1.addStyleName(STYLE.aboutLegal1());
		
		mLegal2 = new DivPanel();
		mWrapper.add(mLegal2);
		mLegal2.addStyleName(STYLE.aboutLegal2());
		
		mLegal3 = new DivPanel();
		mWrapper.add(mLegal3);
		mLegal3.addStyleName(STYLE.aboutLegal3());
	}

	@Override
	public void setTextTitle(String iText) {
		mTitle.setText(iText);
	}

	@Override
	public void setLegal1(String iText) {
		mLegal1.setText(iText);
	}

	@Override
	public void setLegal2(String iText) {
		mLegal2.setText(iText);
	}

	@Override
	public void setLegal3(String iText) {
		mLegal3.setText(iText);
	}

	
}
