package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.ButtonLanguage;
import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.google.gwt.event.dom.client.HasClickHandlers;

public class ButtonLanguageView extends ADivView implements ButtonLanguage.Display {

	private final DivPanel mContent;
	private final DivPanel mMenu;

	public ButtonLanguageView() {
		mRoot.addStyleName(STYLE.buttonLanguage());
		mRoot.addStyleName(STYLE.transAll());

		mContent = new DivPanel();
		mRoot.add(mContent);
		mContent.addStyleName(STYLE.buttonLanguageContent());
		mContent.addStyleName(STYLE.transAll());
		
		mMenu = new DivPanel();
		mRoot.add(mMenu);
		mMenu.addStyleName(STYLE.buttonLanguageMenu());

	}

	@Override
	public void setContent(String iText) {
		mContent.setText(iText);
	}
	
	public HasClickHandlers addLanguage(String iLanguage, String iDescription) {
		DivPanel lLanguage = new DivPanel();
		mMenu.add(lLanguage);
		lLanguage.addStyleName(STYLE.buttonLanguageItem());
		lLanguage.addStyleName(STYLE.transAll());
		
		DivPanel lDescription = new DivPanel();
		lLanguage.add(lDescription);
		lDescription.addStyleName(STYLE.buttonLanguageItemDescription());
		lDescription.setText(iDescription);
		
		DivPanel lLang = new DivPanel();
		lLanguage.add(lLang);
		lLang.addStyleName(STYLE.buttonLanguageItemLang());
		lLang.setText(iLanguage);
		
		return lLanguage;
	}

	@Override
	public void clearMenu() {
		mRoot.remove(mMenu);
	}
	
	@Override
	public void all() {
		mRoot.add(mMenu);
	}

}
