package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.Presenter;
import com.edukera.website.client.generic.view.ADisplay;


public interface Connection extends Presenter<Connection.Display> {

	interface Display extends ADisplay {
		void setConnectionText(String iText);
	}
}
