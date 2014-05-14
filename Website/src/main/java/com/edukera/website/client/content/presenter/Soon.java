package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.ADraw;


public interface Soon extends ADraw<Soon.Display> {

	interface Display extends ADraw.Display {
		void setFirstLineText(String iText);
		void setSecondLineText(String iText);
	}
}
