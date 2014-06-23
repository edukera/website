package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.ADraw;


public interface Launch extends ADraw<Launch.Display> {

	interface Display extends ADraw.Display {

		void setContentText(String iText);

	}

}
