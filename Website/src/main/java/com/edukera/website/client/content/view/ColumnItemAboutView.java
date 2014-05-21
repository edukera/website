package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.ColumnItemAbout;
import com.edukera.website.client.generic.view.ADivView;

public class ColumnItemAboutView extends ADivView implements ColumnItemAbout.Display {

	public ColumnItemAboutView() {
		mRoot.addStyleName(STYLE.columnItem());
	}

	public void setContentText(String iText) {
		mRoot.setText(iText);
	}
}
