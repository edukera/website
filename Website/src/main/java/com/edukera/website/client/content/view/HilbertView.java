package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.Hilbert;
import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.edukera.website.client.generic.widget.ImgPanel;

public class HilbertView extends ADivView implements Hilbert.Display {

	private final DivPanel mWrapper;
	private final ImgPanel mPhoto;
	private final DivPanel mName;
	
	public HilbertView() {
		mRoot.addStyleName(STYLE.logo());
		
		mWrapper = new DivPanel();
		mRoot.add(mWrapper);
		mWrapper.addStyleName(STYLE.logoWrapper());
		
		mPhoto = new ImgPanel();
		mRoot.add(mPhoto);
		mPhoto.addStyleName(STYLE.hibertPhoto());
		
		mName = new DivPanel();
		mRoot.add(mName);
		mName.addStyleName(STYLE.hibertName());
	}

	@Override
	public void setPhotoUrl(String iText) {
		mPhoto.getElement().setAttribute("src", iText);
	}

	@Override
	public void setName(String iText) {
		mName.setText(iText);
	}
	
}
