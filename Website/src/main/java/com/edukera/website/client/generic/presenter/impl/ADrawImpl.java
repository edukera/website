package com.edukera.website.client.generic.presenter.impl;
import com.edukera.website.client.generic.presenter.ADraw;
import com.google.web.bindery.event.shared.EventBus;

public abstract class ADrawImpl<D extends ADraw.Display> extends BasePresenter<D> implements ADraw<D> {

	public ADrawImpl(final EventBus eventBus, final D display) {
		super(eventBus, display);
	}

}
