package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.ADraw;


public interface ComingSoon extends ADraw<ComingSoon.Display> {

	interface Display extends ADraw.Display {
		void setContentText(String iText);
	}
}
