package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.ADraw;


public interface Connection extends ADraw<Connection.Display> {

	interface Display extends ADraw.Display {
		void setConnectionText(String iText);
	}
}
