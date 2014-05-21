package com.edukera.website.client.content.presenter;



public interface ColumnItemAbout extends AColumnItem<ColumnItemAbout.Display> {

	interface Display extends AColumnItem.Display {
		
	}

	void init(String iId);
}
