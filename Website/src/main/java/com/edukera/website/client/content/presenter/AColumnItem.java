package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.ADraw;


public interface AColumnItem<D extends AColumnItem.Display> extends ADraw<D> {

	interface Display extends ADraw.Display {
		void setContentText(String iText);
	}

	void init(String iId);
}
