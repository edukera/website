package com.edukera.website.client.content.presenter;



public interface ColumnItemUrl extends AColumnItem<ColumnItemUrl.Display> {

	interface Display extends AColumnItem.Display {
		void setUrl(String iUrl);
	}

	void init(String iId, String iUrl);
}
