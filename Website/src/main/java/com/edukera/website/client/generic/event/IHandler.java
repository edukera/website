package com.edukera.website.client.generic.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

public interface IHandler<A extends GwtEvent<?>> extends EventHandler {
	void onProcess(A iEvent);
}
