package com.edukera.website.client.generic.view;

import com.edukera.website.client.generic.widget.IEWidget;
import com.edukera.website.client.resources.StyleCssResource;
import com.edukera.website.client.resources.WebsiteResources;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.HasDoubleClickHandlers;
import com.google.gwt.event.dom.client.HasKeyDownHandlers;
import com.google.gwt.event.dom.client.HasKeyPressHandlers;
import com.google.gwt.event.dom.client.HasKeyUpHandlers;
import com.google.gwt.event.dom.client.HasMouseOutHandlers;
import com.google.gwt.event.dom.client.HasMouseOverHandlers;
import com.google.gwt.event.dom.client.HasScrollHandlers;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public abstract class AView<T extends IEWidget> extends Composite implements com.edukera.website.client.generic.view.ADisplay {

	protected static final StyleCssResource STYLE = WebsiteResources.INSTANCE.styleCss();

	protected T mRoot;

	public AView() {
	}

	public void show() {
		mRoot.getElement().getStyle().clearDisplay();
	}

	public void hide() {
		mRoot.getElement().getStyle().setDisplay(com.google.gwt.dom.client.Style.Display.NONE);
	}

	public void add(Widget iWidget) {
		mRoot.add(iWidget);
	}

	public void remove(Widget iWidget) {
		mRoot.remove(iWidget);
	}
	
	public void addTransAll() {
		mRoot.addStyleName(STYLE.transAll());
	}
	
	public void addTransAll30() {
		mRoot.addStyleName(STYLE.transAll30());
	}
	
	public void addTransAll60() {
		mRoot.addStyleName(STYLE.transAll60());
	}

	public void addTransAll100() {
		mRoot.addStyleName(STYLE.transAll100());
	}

	public void addTransAll500() {
		mRoot.addStyleName(STYLE.transAll500());
	}

	public void addTransAll1000() {
		mRoot.addStyleName(STYLE.transAll1000());
	}

	public void removeTransAll() {
		mRoot.removeStyleName(STYLE.transAll());
		mRoot.removeStyleName(STYLE.transAll30());
		mRoot.removeStyleName(STYLE.transAll60());
		mRoot.removeStyleName(STYLE.transAll100());
		mRoot.removeStyleName(STYLE.transAll500());
		mRoot.removeStyleName(STYLE.transAll1000());
	}
	
	public void clear() {
		mRoot.clear();
	}

	public HasClickHandlers getHasClickHandlers() {
		return mRoot;
	}

	public HasMouseOutHandlers getHasMouseOutHandlers() {
		return mRoot;
	}

	public HasMouseOverHandlers getHasMouseOverHandlers() {
		return mRoot;
	}

	public HasScrollHandlers getHasScrollHandlers() {
		return mRoot;
	}
	
	public HasKeyUpHandlers getHasKeyUpHandlers() {
		return mRoot;
	}
	
	public HasKeyDownHandlers getHasKeyDownHandler() {
		return mRoot;
	}

	public HasKeyPressHandlers getHasKeyPressHandlers() {
		return mRoot;
	}
	
	public HasDoubleClickHandlers getHasDoubleClickHandlers() {
		return mRoot;
	}

	public int getHeight() {
		return mRoot.getElement().getClientHeight();
	}

	public void setHeight(double iHeight) {
		mRoot.getElement().getStyle().setHeight(iHeight, Unit.PX);
	}

	public void clearHeight() {
		mRoot.getElement().getStyle().clearHeight();
	}

	public int getWidth() {
		return mRoot.getElement().getClientWidth();
	}

	public void setWidth(double iWidth) {
		mRoot.getElement().getStyle().setWidth(iWidth, Unit.PX);
	}

	public void setLeft(double iLeft) {
		mRoot.getElement().getStyle().setLeft(iLeft, Unit.PX);
	}

	public void setTop(double iTop) {
		mRoot.getElement().getStyle().setTop(iTop, Unit.PX);
	}

	public void setZIndex(int iZIndex) {
		mRoot.getElement().getStyle().setZIndex(iZIndex);
	}

	public int getOffsetLeft() {
		return mRoot.getElement().getOffsetLeft();
	}

	public int getOffsetTop() {
		return mRoot.getElement().getOffsetTop();
	}

	public int getOffsetWidth() {
		return mRoot.getElement().getOffsetWidth();
	}

	public double getDoubleOffsetWidth() {
		return  mRoot.getElement().getPropertyDouble("offsetWidth");
	}

//	public final native double getDoubleOffsetWidth(com.google.gwt.user.client.Element iElement) /*-{
//	     return this.offsetWidth || 0;
//	   }-*/;

	public int getOffsetHeight() {
		return mRoot.getElement().getOffsetHeight();
	}

	public void initializeVisualStyles() {
	}

	public T getRootPanel() {
		return mRoot;
	}
	
	public void setScrollDelta(int iValue) {
		int lValue = this.getElement().getScrollTop() + iValue;
		setScrollAbsolute(lValue);
	}
	
	public void setScrollAbsolute(int iValue) {
		this.getElement().setScrollTop(iValue);
	}
	
	public void setFocus(boolean iFocus) {
		mRoot.setFocus(true);
	}

}
