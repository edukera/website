package com.edukera.website.client.generic.widget;

import com.google.gwt.event.dom.client.HasAllDragAndDropHandlers;
import com.google.gwt.event.dom.client.HasAllFocusHandlers;
import com.google.gwt.event.dom.client.HasAllGestureHandlers;
import com.google.gwt.event.dom.client.HasAllKeyHandlers;
import com.google.gwt.event.dom.client.HasAllMouseHandlers;
import com.google.gwt.event.dom.client.HasAllTouchHandlers;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.HasDoubleClickHandlers;
import com.google.gwt.event.dom.client.HasMouseWheelHandlers;
import com.google.gwt.event.dom.client.HasScrollHandlers;

public interface IAllHandlers extends HasClickHandlers, HasDoubleClickHandlers,
HasScrollHandlers, HasAllDragAndDropHandlers, HasAllFocusHandlers, HasAllGestureHandlers, HasAllKeyHandlers,
HasAllMouseHandlers, HasAllTouchHandlers, HasMouseWheelHandlers {

}
