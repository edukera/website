package com.edukera.website.client.content.presenter;

import java.util.List;

import com.edukera.website.client.generic.presenter.ADraw;


public interface Columns extends ADraw<Columns.Display> {

	interface Display extends ADraw.Display {

	}
	List<Column> getColumns();
}
