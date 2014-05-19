package com.edukera.website.client.content.presenter;

import java.util.List;

import com.edukera.website.client.generic.presenter.ADraw;
import com.google.gwt.user.client.ui.Widget;


public interface Column extends ADraw<Column.Display> {

	interface Display extends ADraw.Display {
		void addItem(Widget iWidget);
		void setTitleText(String iText);
	}
	
	void init(String iId);
	List<ColumnItem> getColumnItems();
}
