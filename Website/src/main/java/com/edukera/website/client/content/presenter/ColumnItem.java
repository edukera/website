package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.ADraw;


public interface ColumnItem extends ADraw<ColumnItem.Display> {

	interface Display extends ADraw.Display {
		void setContentText(String iText);
		void setUrl(String iUrl);
	}

	void init(String iId, String iUrl);
}
