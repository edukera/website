package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.ADraw;


public interface Feature extends ADraw<Feature.Display> {

	interface Display extends ADraw.Display {
		void setTitleText(String iText);
		void setDescText(String iText);
	}

	void init(String iId, String iTitle, String iDesc);
}
