package com.edukera.website.client.content.presenter.impl;

import java.util.ArrayList;
import java.util.List;

import com.edukera.website.client.content.presenter.Column;
import com.edukera.website.client.content.presenter.ColumnItem;
import com.edukera.website.client.data.DataResources;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ColumnImpl extends BasePresenter<Column.Display> implements Column {

	private String mId;
	private final List<ColumnItem> mColumnItems;
	
	@Inject
	public ColumnImpl(EventBus eventBus, Column.Display display) {
		super(eventBus, display);
		mColumnItems = new ArrayList<ColumnItem>();
	}

	@Override
	public void bind() {
		super.bind();
		for (ColumnItem lColumnItem : mColumnItems) {
			lColumnItem.bind();
		}
	}
	
	public void init(String iId) {
		mId = iId;
	}

	public List<ColumnItem> getColumnItems() {
		return mColumnItems;
	}
	
	public void draw() {
		String lTitle = DataResources.getInstance().getContent(mId);
		display.setTitleText(lTitle);
		for (ColumnItem lColumnItem : mColumnItems) {
			lColumnItem.draw();
		}
	}
	
}
