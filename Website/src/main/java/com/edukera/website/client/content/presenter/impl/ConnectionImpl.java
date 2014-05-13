package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.content.presenter.Connection;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ConnectionImpl extends BasePresenter<Connection.Display> implements Connection {

	@Inject
	public ConnectionImpl(EventBus eventBus, Connection.Display display) {
		super(eventBus, display);
		display.setConnectionText("Connexion");
	}
	
	@Override
	public void bind() {
		super.bind();
	}
	
	
}
