package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.content.presenter.TagPhrase;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class TagPhraseImpl extends BasePresenter<TagPhrase.Display> implements TagPhrase {

	@Inject
	public TagPhraseImpl(EventBus eventBus, TagPhrase.Display display) {
		super(eventBus, display);
		display.setFirstText("Entraînement au raisonnement");
		display.setSecondText("mathématique par la pratique.");
	}
	
	@Override
	public void bind() {
		super.bind();
	}
	
	
}
