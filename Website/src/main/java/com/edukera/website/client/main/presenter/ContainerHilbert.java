package com.edukera.website.client.main.presenter;

import com.edukera.website.client.generic.presenter.ADraw;


public interface ContainerHilbert extends ADraw<ContainerHilbert.Display> {

	interface Display extends ADraw.Display {
		void setQuoteText(String iText);
	}
}
