package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.Presenter;
import com.edukera.website.client.generic.view.ADisplay;


public interface Soon extends Presenter<Soon.Display> {

	interface Display extends ADisplay {
		void setFirstLineText(String iText);
		void setSecondLineText(String iText);
	}
}
