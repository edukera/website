package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.ColumnItemUrl;
import com.edukera.website.client.generic.view.AAView;

public class ColumnItemUrlView extends AAView implements ColumnItemUrl.Display {

	public ColumnItemUrlView() {
		mRoot.addStyleName(STYLE.columnItem());
		mRoot.getElement().setAttribute("target", "_blank");
	}
	
	public void setContentText(String iText) {
		mRoot.setText(iText);
	}
	
	@Override
	public void setUrl(String iUrl) {
		mRoot.getElement().setAttribute("href", iUrl);
	}
	
}
