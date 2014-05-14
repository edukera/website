package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.Presenter;
import com.edukera.website.client.generic.view.ADisplay;


public interface ValueProposition extends Presenter<ValueProposition.Display> {

	interface Display extends ADisplay {
		void setTitleText(String iText);
		void setFirstLineText(String iText);
		void setSecondLineText(String iText);
	}
}
