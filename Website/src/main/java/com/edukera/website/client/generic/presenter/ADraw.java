package com.edukera.website.client.generic.presenter;

import com.edukera.website.client.generic.view.ADisplay;


public interface ADraw<D extends ADisplay> extends Presenter<D> {
	
	interface Display extends ADisplay {

	}
	
	void draw();
}
