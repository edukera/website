package com.edukera.website.client.gin;


import com.edukera.website.client.content.presenter.ButtonLanguage;
import com.edukera.website.client.content.presenter.Chevron;
import com.edukera.website.client.content.presenter.Column;
import com.edukera.website.client.content.presenter.ColumnItemAbout;
import com.edukera.website.client.content.presenter.ColumnItemUrl;
import com.edukera.website.client.content.presenter.Columns;
import com.edukera.website.client.content.presenter.ComingSoon;
import com.edukera.website.client.content.presenter.Connection;
import com.edukera.website.client.content.presenter.ContactUs;
import com.edukera.website.client.content.presenter.Feature;
import com.edukera.website.client.content.presenter.Hilbert;
import com.edukera.website.client.content.presenter.Input;
import com.edukera.website.client.content.presenter.Launch;
import com.edukera.website.client.content.presenter.LegalInformation;
import com.edukera.website.client.content.presenter.Logo;
import com.edukera.website.client.content.presenter.Product;
import com.edukera.website.client.content.presenter.Soon;
import com.edukera.website.client.content.presenter.ValueProposition;
import com.edukera.website.client.generic.presenter.Tools;
import com.edukera.website.client.logo.presenter.LogoCalculus;
import com.edukera.website.client.logo.presenter.LogoDemo;
import com.edukera.website.client.logo.presenter.LogoReasoning;
import com.edukera.website.client.main.presenter.ContainerAbout;
import com.edukera.website.client.main.presenter.ContainerFeature;
import com.edukera.website.client.main.presenter.ContainerHilbert;
import com.edukera.website.client.main.presenter.ContainerSky;
import com.edukera.website.client.main.presenter.Footer;
import com.edukera.website.client.main.presenter.Header;
import com.edukera.website.client.main.presenter.Main;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.web.bindery.event.shared.EventBus;


@GinModules(Module.class)
public interface Injector extends Ginjector {

	/* Generic */
	EventBus getEventBus();	
	Tools getTools();
	
	/* Main */
	Main getMain();
	Header getHeader();
	Footer getFooter();
	ContainerSky getContainerSky();
	ContainerFeature getContainerFeature();
	ContainerHilbert getContainerHilbert();
	ContainerAbout getContainerAbout();
	
	/* Content */
	Logo getLogo();
	Input getInput();
	Connection getConnection();
	ValueProposition getValueProposition();
	Soon getSoon();
	Feature getFeature();
	ButtonLanguage getButtonLanguage();
	Product getProduct();
	Hilbert getHilbert();
	ComingSoon getComingSoon();
	Columns getColumns();
	Column getColumn();
	ColumnItemUrl getColumnItem();
	ColumnItemAbout getColumnItemAbout();
	Chevron getChevron();
	ContactUs getContactUs();
	LegalInformation getLegalInformation();
	Launch getLaunch();
	
	/* Logo */
	LogoCalculus getLogoCalculus();
	LogoDemo getLogoDemo();
	LogoReasoning getLogoReasoning();
}
