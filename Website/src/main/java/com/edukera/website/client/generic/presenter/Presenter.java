package com.edukera.website.client.generic.presenter;

import com.edukera.website.client.generic.view.ADisplay;


public interface Presenter<D extends ADisplay> {

	void bind();

	void unbind();

	D getDisplay();
	
	boolean isInitialized();
}