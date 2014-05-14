package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.content.presenter.ValueProposition;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ValuePropositionImpl extends BasePresenter<ValueProposition.Display> implements ValueProposition {

	@Inject
	public ValuePropositionImpl(EventBus eventBus, ValueProposition.Display display) {
		super(eventBus, display);
		display.setTitleText("Redécouvrez les maths");
		display.setFirstLineText("grâce à la première application simple et ludique");
		display.setSecondLineText("de conception de démonstration");
	}
	
	@Override
	public void bind() {
		super.bind();
	}
	
	
}
