package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.ButtonLanguage;
import com.edukera.website.client.content.presenter.Column;
import com.edukera.website.client.content.presenter.ColumnItem;
import com.edukera.website.client.content.presenter.Columns;
import com.edukera.website.client.generic.presenter.impl.ADrawImpl;
import com.edukera.website.client.main.presenter.Footer;
import com.google.gwt.user.client.Window;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class FooterImpl extends ADrawImpl<Footer.Display> implements Footer {

	private final ButtonLanguage mButtonLanguage;
	private final Columns mColumns;
	
	@Inject
	public FooterImpl(EventBus eventBus, Footer.Display display) {
		super(eventBus, display);
		
		mButtonLanguage = EdukeraWebsite.ginjector.getButtonLanguage();
		display.add(mButtonLanguage.getDisplay().asWidget());
		
		mColumns = EdukeraWebsite.ginjector.getColumns();
		display.addContainer(mColumns.getDisplay().asWidget());
		
//		initColumns();
	}

	@Override
	public void bind() {
		super.bind();
		mButtonLanguage.bind();
		mColumns.bind();
	}

	@Override
	public void draw() {
		int lHeight = Window.getClientHeight() - 425;
		if (lHeight < 200) {
			lHeight = 200;
		}
		display.setHeight(lHeight);
		mButtonLanguage.draw();
	}
	
	
	private void initColumns() {
		Column lCol0 = addColumn(mColumns, "id");
		addColumnItem(lCol0, "id", "");
		addColumnItem(lCol0, "id", "");
		addColumnItem(lCol0, "id", "");

		Column lCol1 = addColumn(mColumns, "id");
		addColumnItem(lCol1, "id", "");
	}

	private Column addColumn(Columns iColumns, String iId) {
		Column lColumn = EdukeraWebsite.ginjector.getColumn();
		lColumn.init(iId);
		iColumns.getColumns().add(lColumn);
		return lColumn;
	}
	
	private ColumnItem addColumnItem(Column iColumn, String iId, String iUrl) {
		ColumnItem lColumnItem = EdukeraWebsite.ginjector.getColumnItem();
		lColumnItem.init(iId, iUrl);
		iColumn.getColumnItems().add(lColumnItem);
		return lColumnItem;
	}
	
}
