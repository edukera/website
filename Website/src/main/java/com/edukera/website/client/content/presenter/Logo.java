package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.Presenter;
import com.edukera.website.client.generic.view.ADisplay;


public interface Logo extends Presenter<Logo.Display> {

	interface Display extends ADisplay {
		void setQeduText(String iText);
		void setMathText(String iText);
	}
}
