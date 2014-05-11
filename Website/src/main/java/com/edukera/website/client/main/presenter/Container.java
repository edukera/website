package com.edukera.website.client.main.presenter;

import com.edukera.website.client.generic.presenter.Presenter;
import com.edukera.website.client.generic.view.ADisplay;


public interface Container extends Presenter<Container.Display> {

	interface Display extends ADisplay {

	}
}
