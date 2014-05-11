package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.edukera.website.client.main.presenter.Footer;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class FooterImpl extends BasePresenter<Footer.Display> implements Footer {

	@Inject
	public FooterImpl(EventBus eventBus, Footer.Display display) {
		super(eventBus, display);
	}
	
	@Override
	public void bind() {
		super.bind();
	}
	
	
}
