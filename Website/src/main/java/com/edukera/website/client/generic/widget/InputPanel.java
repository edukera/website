package com.edukera.website.client.generic.widget;

import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.DoubleClickHandler;
import com.google.gwt.event.dom.client.DragEndHandler;
import com.google.gwt.event.dom.client.DragEnterHandler;
import com.google.gwt.event.dom.client.DragHandler;
import com.google.gwt.event.dom.client.DragLeaveHandler;
import com.google.gwt.event.dom.client.DragOverHandler;
import com.google.gwt.event.dom.client.DragStartHandler;
import com.google.gwt.event.dom.client.DropHandler;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.GestureChangeHandler;
import com.google.gwt.event.dom.client.GestureEndHandler;
import com.google.gwt.event.dom.client.GestureStartHandler;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.event.dom.client.MouseWheelHandler;
import com.google.gwt.event.dom.client.ScrollHandler;
import com.google.gwt.event.dom.client.TouchCancelHandler;
import com.google.gwt.event.dom.client.TouchEndHandler;
import com.google.gwt.event.dom.client.TouchMoveHandler;
import com.google.gwt.event.dom.client.TouchStartHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;



public class InputPanel extends FocusPanel implements IEWidget {

	private final DivPanel mDivPanel;

	public InputPanel() {
		mDivPanel = new DivPanel();
		super.add(mDivPanel);
	}

	//	@SuppressWarnings("deprecation")
	//	public com.google.gwt.user.client.Element getElement() {
	//		return mDivPanel.getElement();
	//	}

	@Override
	public HandlerRegistration addClickHandler(ClickHandler handler) {
		return mDivPanel.addClickHandler(handler);
	}

	@Override
	public HandlerRegistration addDoubleClickHandler(DoubleClickHandler handler) {
		return mDivPanel.addDoubleClickHandler(handler);
	}

	@Override
	public HandlerRegistration addScrollHandler(ScrollHandler handler) {
		return mDivPanel.addScrollHandler(handler);
	}

	@Override
	public HandlerRegistration addDragEndHandler(DragEndHandler handler) {
		return mDivPanel.addDragEndHandler(handler);
	}

	@Override
	public HandlerRegistration addDragEnterHandler(DragEnterHandler handler) {
		return mDivPanel.addDragEnterHandler(handler);
	}

	@Override
	public HandlerRegistration addDragLeaveHandler(DragLeaveHandler handler) {
		return mDivPanel.addDragLeaveHandler(handler);
	}

	@Override
	public HandlerRegistration addDragHandler(DragHandler handler) {
		return mDivPanel.addDragHandler(handler);
	}

	@Override
	public HandlerRegistration addDragOverHandler(DragOverHandler handler) {
		return mDivPanel.addDragOverHandler(handler);
	}

	@Override
	public HandlerRegistration addDragStartHandler(DragStartHandler handler) {
		return mDivPanel.addDragStartHandler(handler);
	}

	@Override
	public HandlerRegistration addDropHandler(DropHandler handler) {
		return mDivPanel.addDropHandler(handler);
	}

	@Override
	public HandlerRegistration addFocusHandler(FocusHandler handler) {
		return super.addFocusHandler(handler);
	}

	@Override
	public HandlerRegistration addBlurHandler(BlurHandler handler) {
		return super.addBlurHandler(handler);
	}

	@Override
	public HandlerRegistration addGestureStartHandler(
			GestureStartHandler handler) {
		return mDivPanel.addGestureStartHandler(handler);
	}

	@Override
	public HandlerRegistration addGestureChangeHandler(
			GestureChangeHandler handler) {
		return mDivPanel.addGestureChangeHandler(handler);
	}

	@Override
	public HandlerRegistration addGestureEndHandler(GestureEndHandler handler) {
		return mDivPanel.addGestureEndHandler(handler);
	}

	@Override
	public HandlerRegistration addKeyUpHandler(KeyUpHandler handler) {
		return super.addKeyUpHandler(handler);
	}

	@Override
	public HandlerRegistration addKeyDownHandler(KeyDownHandler handler) {
		return super.addKeyDownHandler(handler);
	}

	@Override
	public HandlerRegistration addKeyPressHandler(KeyPressHandler handler) {
		return super.addKeyPressHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseDownHandler(MouseDownHandler handler) {
		return mDivPanel.addMouseDownHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseUpHandler(MouseUpHandler handler) {
		return mDivPanel.addMouseUpHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
		return mDivPanel.addMouseOutHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
		return mDivPanel.addMouseOverHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseMoveHandler(MouseMoveHandler handler) {
		return mDivPanel.addMouseMoveHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseWheelHandler(MouseWheelHandler handler) {
		return mDivPanel.addMouseWheelHandler(handler);
	}

	@Override
	public HandlerRegistration addTouchStartHandler(TouchStartHandler handler) {
		return super.addTouchStartHandler(handler);
	}

	@Override
	public HandlerRegistration addTouchMoveHandler(TouchMoveHandler handler) {
		return super.addTouchMoveHandler(handler);
	}

	@Override
	public HandlerRegistration addTouchEndHandler(TouchEndHandler handler) {
		return super.addTouchEndHandler(handler);
	}

	@Override
	public HandlerRegistration addTouchCancelHandler(TouchCancelHandler handler) {
		return super.addTouchCancelHandler(handler);
	}

	public String getText() {
		return getElement().getInnerText();
	}

	public void setText(String iText) {
		mDivPanel.getElement().setInnerText(iText);
	}

	public void show() {
		mDivPanel.getElement().getStyle().clearDisplay();
	}

	public void hide() {
		mDivPanel.getElement().getStyle().setDisplay(com.google.gwt.dom.client.Style.Display.NONE);
	}

	@Override
	public int getWidgetIndex(IsWidget child) {
		return mDivPanel.getWidgetIndex(child);
	}

	@Override
	public Widget getWidget(int index) {
		return mDivPanel.getWidget(index);
	}

	@Override
	public int getWidgetCount() {
		return mDivPanel.getWidgetCount();
	}

	@Override
	public int getWidgetIndex(Widget child) {
		return mDivPanel.getWidgetIndex(child);
	}

	@Override
	public boolean remove(int index) {
		return mDivPanel.remove(index);
	}

	public void add(Widget iWidget) {
		mDivPanel.add(iWidget);
	}
	
	public boolean remove(Widget iWidget) {
		return mDivPanel.remove(iWidget);
	}
	
}
