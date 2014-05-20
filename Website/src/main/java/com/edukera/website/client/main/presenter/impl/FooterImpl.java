package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.ButtonLanguage;
import com.edukera.website.client.content.presenter.Column;
import com.edukera.website.client.content.presenter.ColumnItem;
import com.edukera.website.client.content.presenter.Columns;
import com.edukera.website.client.data.DataResources;
import com.edukera.website.client.data.WebsiteKeys;
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
		
		initColumns();
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
		
		String lCopyright = DataResources.getInstance().getContent(WebsiteKeys.COPYRIGHT);
		display.setCopyrightText(lCopyright);
		
		display.setHeight(lHeight);
		mButtonLanguage.draw();
		mColumns.draw();
	}
	
	
	private void initColumns() {
		Column lCol0 = addColumn(mColumns, WebsiteKeys.ABOUT);
		addColumnItem(lCol0, WebsiteKeys.COMPANY, "");
		addColumnItem(lCol0, WebsiteKeys.ABOUT_US, "");
		addColumnItem(lCol0, WebsiteKeys.LEGAL_INFORMATION, "");

		Column lCol1 = addColumn(mColumns, WebsiteKeys.FOLLOW_US);
		addColumnItem(lCol1, WebsiteKeys.CONTACT_US, "");
	}

	private Column addColumn(Columns iColumns, String iId) {
		Column lColumn = EdukeraWebsite.ginjector.getColumn();
		lColumn.init(iId);
		iColumns.getColumns().add(lColumn);
		iColumns.getDisplay().add(lColumn.getDisplay().asWidget());
		return lColumn;
	}
	
	private ColumnItem addColumnItem(Column iColumn, String iId, String iUrl) {
		ColumnItem lColumnItem = EdukeraWebsite.ginjector.getColumnItem();
		lColumnItem.init(iId, iUrl);
		iColumn.getColumnItems().add(lColumnItem);
		iColumn.getDisplay().addItem(lColumnItem.getDisplay().asWidget());
		return lColumnItem;
	}
	
}
