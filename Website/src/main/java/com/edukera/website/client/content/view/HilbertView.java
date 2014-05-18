package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.Hilbert;
import com.edukera.website.client.generic.view.AAView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.edukera.website.client.generic.widget.ImgPanel;

public class HilbertView extends AAView implements Hilbert.Display {

	private final ImgPanel mPhoto;
	private final DivPanel mName;
	
	public HilbertView() {
		mRoot.addStyleName(STYLE.hibertWrapper());
		mRoot.addStyleName(STYLE.transAll());
		mRoot.getElement().setAttribute("target", "_blank");
		
		mPhoto = new ImgPanel();
		mRoot.add(mPhoto);
		mPhoto.addStyleName(STYLE.hibertPhoto());
		mPhoto.getElement().setAttribute("src", "./style/img/hilbert.jpg");
		
		mName = new DivPanel();
		mRoot.add(mName);
		mName.addStyleName(STYLE.hibertName());
		mName.addStyleName(STYLE.transAll());
	}

	@Override
	public void setUrl(String iText) {
		mRoot.getElement().setAttribute("href", iText);
	}

	@Override
	public void setName(String iText) {
		mName.setText(iText);
	}
	
}
