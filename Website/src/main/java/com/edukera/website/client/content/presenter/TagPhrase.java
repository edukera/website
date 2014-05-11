package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.Presenter;
import com.edukera.website.client.generic.view.ADisplay;


public interface TagPhrase extends Presenter<TagPhrase.Display> {

	interface Display extends ADisplay {
		void setFirstText(String iText);
		void setSecondText(String iText);
	}
}
