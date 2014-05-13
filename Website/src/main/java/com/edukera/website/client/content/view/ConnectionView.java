package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.Connection;
import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;

public class ConnectionView extends ADivView implements Connection.Display {

	private final DivPanel mButton;
	private final DivPanel mButtonContent;
	
	public ConnectionView() {
		mRoot.addStyleName(STYLE.connection());
		
		mButton = new DivPanel();
		mRoot.add(mButton);
		mButton.addStyleName(STYLE.connectionButton());
		mButton.addStyleName(STYLE.transAll());
		
		mButtonContent = new DivPanel();
		mButton.add(mButtonContent);
		mButtonContent.addStyleName(STYLE.connectionButtonContent());
	}
	
	public void setConnectionText(String iText) {
		mButtonContent.setText(iText);
	}
	
}
