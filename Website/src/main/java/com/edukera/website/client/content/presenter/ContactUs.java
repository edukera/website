package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.ADraw;


public interface ContactUs extends ADraw<ContactUs.Display> {

	interface Display extends ADraw.Display {
		void setTextTitle(String iText);
		void setEmail(String iText);
	}
}
