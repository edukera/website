package com.edukera.website.client.generic.view;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.HasDoubleClickHandlers;
import com.google.gwt.event.dom.client.HasKeyDownHandlers;
import com.google.gwt.event.dom.client.HasKeyPressHandlers;
import com.google.gwt.event.dom.client.HasKeyUpHandlers;
import com.google.gwt.event.dom.client.HasMouseOutHandlers;
import com.google.gwt.event.dom.client.HasMouseOverHandlers;
import com.google.gwt.event.dom.client.HasScrollHandlers;
import com.google.gwt.user.client.ui.Widget;


public interface ADisplay {

	void add(Widget iWidget);
	void remove(Widget iWidget);
	void clear();
	
	Widget asWidget();
	void show();
	void hide();
	HasClickHandlers getHasClickHandlers();
	HasMouseOutHandlers getHasMouseOutHandlers();
	HasMouseOverHandlers getHasMouseOverHandlers();
	HasScrollHandlers getHasScrollHandlers();
	HasKeyDownHandlers getHasKeyDownHandler();
	HasKeyPressHandlers getHasKeyPressHandlers();
	HasKeyUpHandlers getHasKeyUpHandlers();
	HasDoubleClickHandlers getHasDoubleClickHandlers();


	void setLeft(double iLeft);
	void setTop(double iTop);
	
	int getHeight();
	void setHeight(double iHeight);
	void clearHeight();
	
	int getWidth();
	void setWidth(double iWidth);
	
	void setZIndex(int iZIndex);
	
	int getOffsetLeft();
	int getOffsetTop();
	int getOffsetWidth();
	int getOffsetHeight();
	double getDoubleOffsetWidth();
	
	Element getElement();
	
	void setScrollDelta(int iValue);
	void setScrollAbsolute(int iValue);
	
	void addStyleName(String iStyle);
	void initializeVisualStyles();
	
	void setFocus(boolean iFocus);
	
	void addTransAll();
	void addTransAll30();
	void addTransAll60();
	void addTransAll100();
	void addTransAll500();
	void addTransAll1000();
	void removeTransAll();
	
}
