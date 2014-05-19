package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.Column;
import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.google.gwt.user.client.ui.Widget;

public class ColumnView extends ADivView implements Column.Display {

	private final DivPanel mTitle;
	private final DivPanel mWrapper;
	
	public ColumnView() {
		mRoot.addStyleName(STYLE.column());
		
		mTitle = new DivPanel();
		mRoot.add(mTitle);
		mTitle.addStyleName(STYLE.columnTitle());
		mTitle.addStyleName(STYLE.transAll());

		mWrapper = new DivPanel();
		mRoot.add(mWrapper);
		mWrapper.addStyleName(STYLE.columnWrapper());
	}
	
	public void setTitleText(String iText) {
		mTitle.setText(iText);
	}
	
	public void addItem(Widget iWidget) {
		mWrapper.add(iWidget);
	}

}
