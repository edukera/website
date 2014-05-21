package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.ContactUs;
import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.AAPanel;
import com.edukera.website.client.generic.widget.DivPanel;

public class ContactUsView extends ADivView implements ContactUs.Display {

	private final DivPanel mTitle;
	private final DivPanel mWrapper;
	private final AAPanel mEmail;
	
	public ContactUsView() {
		mRoot.addStyleName(STYLE.aboutSection());
		
		mTitle = new DivPanel();
		mRoot.add(mTitle);
		mTitle.addStyleName(STYLE.aboutTitle());

		mWrapper = new DivPanel();
		mRoot.add(mWrapper);
		mWrapper.addStyleName(STYLE.aboutWrapper());

		mEmail = new AAPanel();
		mWrapper.add(mEmail);
		mEmail.addStyleName(STYLE.aboutEmail());
		mEmail.addStyleName(STYLE.transAll());
		mEmail.getElement().setAttribute("target", "_blank");
		mEmail.getElement().setAttribute("href", "mailto:contact@edukera.com");
	}

	@Override
	public void setTextTitle(String iText) {
		mTitle.setText(iText);
	}

	@Override
	public void setEmail(String iText) {
		mEmail.setText(iText);
	}
	
}
