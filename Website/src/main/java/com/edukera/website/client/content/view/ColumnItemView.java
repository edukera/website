package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.ColumnItem;
import com.edukera.website.client.generic.view.AAView;

public class ColumnItemView extends AAView implements ColumnItem.Display {

	public ColumnItemView() {
		mRoot.addStyleName(STYLE.columnItem());
	}
	
	public void setContentText(String iText) {
		mRoot.setText(iText);
	}

	@Override
	public void setUrl(String iUrl) {
		mRoot.getElement().setAttribute("href", iUrl);
	}
	
}
