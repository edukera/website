package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.content.presenter.Soon;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class SoonImpl extends BasePresenter<Soon.Display> implements Soon {

	@Inject
	public SoonImpl(EventBus eventBus, Soon.Display display) {
		super(eventBus, display);
		display.setFirstLineText("Bientôt disponible pour le programme");
		display.setSecondLineText("français de Terminales S et ES.");
	}
	
	@Override
	public void bind() {
		super.bind();
	}
	
	
}
