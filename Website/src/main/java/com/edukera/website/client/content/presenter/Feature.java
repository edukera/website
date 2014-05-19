package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.ADraw;
import com.google.gwt.user.client.ui.Widget;


public interface Feature extends ADraw<Feature.Display> {

	interface Display extends ADraw.Display {
		void setTitleText(String iText);
		void setDescText(String iText);
		void setLogo(Widget iWidget);
	}

	void init(ADraw<?> iLogo, String iTitle, String iDesc);
}
