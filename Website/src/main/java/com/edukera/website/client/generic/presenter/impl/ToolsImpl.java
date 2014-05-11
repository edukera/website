package com.edukera.website.client.generic.presenter.impl;


import java.util.logging.Level;
import java.util.logging.Logger;

import com.edukera.website.client.generic.presenter.Tools;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ToolsImpl implements Tools {

	protected final EventBus eventBus;

	@Inject
	public ToolsImpl(final EventBus eventBus) {
		this.eventBus = eventBus;
	}

	public void sendText(String iString) {
		Logger.getLogger("").log(Level.INFO, iString);
	}


}
