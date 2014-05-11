package com.edukera.website.client.generic.widget;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.DoubleClickEvent;
import com.google.gwt.event.dom.client.DoubleClickHandler;
import com.google.gwt.event.dom.client.DragEndEvent;
import com.google.gwt.event.dom.client.DragEndHandler;
import com.google.gwt.event.dom.client.DragEnterEvent;
import com.google.gwt.event.dom.client.DragEnterHandler;
import com.google.gwt.event.dom.client.DragEvent;
import com.google.gwt.event.dom.client.DragHandler;
import com.google.gwt.event.dom.client.DragLeaveEvent;
import com.google.gwt.event.dom.client.DragLeaveHandler;
import com.google.gwt.event.dom.client.DragOverEvent;
import com.google.gwt.event.dom.client.DragOverHandler;
import com.google.gwt.event.dom.client.DragStartEvent;
import com.google.gwt.event.dom.client.DragStartHandler;
import com.google.gwt.event.dom.client.DropEvent;
import com.google.gwt.event.dom.client.DropHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.GestureChangeEvent;
import com.google.gwt.event.dom.client.GestureChangeHandler;
import com.google.gwt.event.dom.client.GestureEndEvent;
import com.google.gwt.event.dom.client.GestureEndHandler;
import com.google.gwt.event.dom.client.GestureStartEvent;
import com.google.gwt.event.dom.client.GestureStartHandler;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.event.dom.client.MouseWheelEvent;
import com.google.gwt.event.dom.client.MouseWheelHandler;
import com.google.gwt.event.dom.client.ScrollEvent;
import com.google.gwt.event.dom.client.ScrollHandler;
import com.google.gwt.event.dom.client.TouchCancelEvent;
import com.google.gwt.event.dom.client.TouchCancelHandler;
import com.google.gwt.event.dom.client.TouchEndEvent;
import com.google.gwt.event.dom.client.TouchEndHandler;
import com.google.gwt.event.dom.client.TouchMoveEvent;
import com.google.gwt.event.dom.client.TouchMoveHandler;
import com.google.gwt.event.dom.client.TouchStartEvent;
import com.google.gwt.event.dom.client.TouchStartHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HTMLPanel;

public class APanel extends HTMLPanel implements IEWidget {

	public APanel(String tag, String html) {
		super(tag, html);
	}

	@Override
	public HandlerRegistration addClickHandler(ClickHandler iHandler) {
		return addDomHandler(iHandler, ClickEvent.getType());
	}

	@Override
	public HandlerRegistration addDoubleClickHandler(DoubleClickHandler iHandler) {
		return addDomHandler(iHandler, DoubleClickEvent.getType());
	}

	@Override
	public HandlerRegistration addScrollHandler(ScrollHandler iHandler) {
		return addDomHandler(iHandler, ScrollEvent.getType());
	}

	@Override
	public HandlerRegistration addDragEndHandler(DragEndHandler iHandler) {
		return addDomHandler(iHandler, DragEndEvent.getType());
	}

	@Override
	public HandlerRegistration addDragEnterHandler(DragEnterHandler iHandler) {
		return addDomHandler(iHandler, DragEnterEvent.getType());
	}

	@Override
	public HandlerRegistration addDragLeaveHandler(DragLeaveHandler iHandler) {
		return addDomHandler(iHandler, DragLeaveEvent.getType());
	}

	@Override
	public HandlerRegistration addDragHandler(DragHandler iHandler) {
		return addDomHandler(iHandler, DragEvent.getType());
	}

	@Override
	public HandlerRegistration addDragOverHandler(DragOverHandler iHandler) {
		return addDomHandler(iHandler, DragOverEvent.getType());
	}

	@Override
	public HandlerRegistration addDragStartHandler(DragStartHandler iHandler) {
		return addDomHandler(iHandler, DragStartEvent.getType());
	}

	@Override
	public HandlerRegistration addDropHandler(DropHandler iHandler) {
		return addDomHandler(iHandler, DropEvent.getType());
	}

	@Override
	public HandlerRegistration addFocusHandler(FocusHandler iHandler) {
		return addDomHandler(iHandler, FocusEvent.getType());
	}

	@Override
	public HandlerRegistration addBlurHandler(BlurHandler iHandler) {
		return addDomHandler(iHandler, BlurEvent.getType());
	}

	@Override
	public HandlerRegistration addGestureStartHandler(
			GestureStartHandler iHandler) {
		return addDomHandler(iHandler, GestureStartEvent.getType());
	}

	@Override
	public HandlerRegistration addGestureChangeHandler(
			GestureChangeHandler iHandler) {
		return addDomHandler(iHandler, GestureChangeEvent.getType());
	}

	@Override
	public HandlerRegistration addGestureEndHandler(GestureEndHandler iHandler) {
		return addDomHandler(iHandler, GestureEndEvent.getType());
	}

	@Override
	public HandlerRegistration addKeyUpHandler(KeyUpHandler iHandler) {
		return addDomHandler(iHandler, KeyUpEvent.getType());
	}

	@Override
	public HandlerRegistration addKeyDownHandler(KeyDownHandler iHandler) {
		return addDomHandler(iHandler, KeyDownEvent.getType());
	}

	@Override
	public HandlerRegistration addKeyPressHandler(KeyPressHandler iHandler) {
		return addDomHandler(iHandler, KeyPressEvent.getType());
	}

	@Override
	public HandlerRegistration addMouseDownHandler(MouseDownHandler iHandler) {
		return addDomHandler(iHandler, MouseDownEvent.getType());
	}

	@Override
	public HandlerRegistration addMouseUpHandler(MouseUpHandler iHandler) {
		return addDomHandler(iHandler, MouseUpEvent.getType());
	}

	@Override
	public HandlerRegistration addMouseOutHandler(MouseOutHandler iHandler) {
		return addDomHandler(iHandler, MouseOutEvent.getType());
	}

	@Override
	public HandlerRegistration addMouseOverHandler(MouseOverHandler iHandler) {
		return addDomHandler(iHandler, MouseOverEvent.getType());
	}

	@Override
	public HandlerRegistration addMouseMoveHandler(MouseMoveHandler iHandler) {
		return addDomHandler(iHandler, MouseMoveEvent.getType());
	}

	@Override
	public HandlerRegistration addMouseWheelHandler(MouseWheelHandler iHandler) {
		return addDomHandler(iHandler, MouseWheelEvent.getType());
	}

	@Override
	public HandlerRegistration addTouchStartHandler(TouchStartHandler iHandler) {
		return addDomHandler(iHandler, TouchStartEvent.getType());
	}

	@Override
	public HandlerRegistration addTouchMoveHandler(TouchMoveHandler iHandler) {
		return addDomHandler(iHandler, TouchMoveEvent.getType());
	}

	@Override
	public HandlerRegistration addTouchEndHandler(TouchEndHandler iHandler) {
		return addDomHandler(iHandler, TouchEndEvent.getType());
	}

	@Override
	public HandlerRegistration addTouchCancelHandler(TouchCancelHandler iHandler) {
		return addDomHandler(iHandler, TouchCancelEvent.getType());
	}
	
	public String getText() {
		return getElement().getInnerText();
	}

	public void setText(String iText) {
		getElement().setInnerText(iText);
	}

	public void show() {
		getElement().getStyle().clearDisplay();
	}

	public void hide() {
		getElement().getStyle().setDisplay(com.google.gwt.dom.client.Style.Display.NONE);
	}
	
	public void setFocus(boolean iFocus) {
		
	}


}
