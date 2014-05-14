package com.edukera.website.client;

import com.edukera.website.client.data.DataResources;
import com.edukera.website.client.data.Language;
import com.edukera.website.client.gin.Injector;
import com.edukera.website.client.main.presenter.Main;
import com.edukera.website.client.resources.WebsiteResources;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class EdukeraWebsite implements EntryPoint {

	public static final Injector ginjector = GWT.create(Injector.class);
	
	public void onModuleLoad() {
		loadStyles();
		
		DataResources.getInstance().switchLanguage(Language.fr);
		
		Main lMain = ginjector.getMain();
		lMain.bind();
		RootPanel.get().add(lMain.getDisplay().asWidget());
	}
	
	
	private void loadStyles() {
		WebsiteResources.INSTANCE.styleCss().ensureInjected();
	}

}
