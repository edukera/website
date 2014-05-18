package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.ADraw;


public interface Hilbert extends ADraw<Hilbert.Display> {

	interface Display extends ADraw.Display {
		void setPhotoUrl(String iText);
		void setName(String iText);
	}
}
