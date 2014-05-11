package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.TagPhrase;
import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;

public class TagPhraseView extends ADivView implements TagPhrase.Display {

	private final DivPanel mFirst;
	private final DivPanel mSecond;
	
	public TagPhraseView() {
		mRoot.addStyleName(STYLE.tagphrase());
		
		mFirst = new DivPanel();
		mRoot.add(mFirst);
		mFirst.addStyleName(STYLE.tagphraseFirst());
		
		mSecond = new DivPanel();
		mRoot.add(mSecond);
		mSecond.addStyleName(STYLE.tagphraseSecond());
	}
	
	public void setFirstText(String iText) {
		mFirst.setText(iText);
	}
	
	public void setSecondText(String iText) {
		mSecond.setText(iText);
	}
}
