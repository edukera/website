package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.Columns;
import com.edukera.website.client.generic.view.ADivView;

public class ColumnsView extends ADivView implements Columns.Display {

	public ColumnsView() {
		mRoot.addStyleName(STYLE.columns());
	}
	
}
