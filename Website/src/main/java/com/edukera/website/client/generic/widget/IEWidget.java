package com.edukera.website.client.generic.widget;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IndexedPanel;

public interface IEWidget extends HasWidgets.ForIsWidget, IndexedPanel.ForIsWidget, IAllHandlers {
	@SuppressWarnings("deprecation")
	com.google.gwt.user.client.Element getElement();
	String getText();
	void setText(String iText);
	void show();
	void hide();
	void setFocus(boolean iFocus);
	void addStyleName(String iStyle);
	void removeStyleName(String iStyle);
}
