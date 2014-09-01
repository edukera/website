package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.ADraw;


public interface Logo extends ADraw<Logo.Display> {

	interface Display extends ADraw.Display {
		void setEdukText(String iText);
		void setEraText(String iText);
	}
}
