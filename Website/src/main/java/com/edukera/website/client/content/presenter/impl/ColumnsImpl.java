package com.edukera.website.client.content.presenter.impl;

import java.util.ArrayList;
import java.util.List;

import com.edukera.website.client.content.presenter.Column;
import com.edukera.website.client.content.presenter.Columns;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ColumnsImpl extends BasePresenter<Columns.Display> implements Columns {

	private final List<Column> mColumns;
	
	@Inject
	public ColumnsImpl(EventBus eventBus, Columns.Display display) {
		super(eventBus, display);
		mColumns = new ArrayList<Column>();
	}

	@Override
	public void bind() {
		super.bind();
		for (Column lColumn : mColumns) {
			lColumn.bind();
		}
	}

	public void draw() {
		for (Column lColumn : mColumns) {
			lColumn.draw();
		}
	}
	
	public List<Column> getColumns() {
		return mColumns;
	}
}
