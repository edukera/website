package com.edukera.website.client.gin;

import com.edukera.website.client.content.presenter.ButtonLanguage;
import com.edukera.website.client.content.presenter.Connection;
import com.edukera.website.client.content.presenter.Feature;
import com.edukera.website.client.content.presenter.Input;
import com.edukera.website.client.content.presenter.Logo;
import com.edukera.website.client.content.presenter.Soon;
import com.edukera.website.client.content.presenter.ValueProposition;
import com.edukera.website.client.content.presenter.impl.ButtonLanguageImpl;
import com.edukera.website.client.content.presenter.impl.ConnectionImpl;
import com.edukera.website.client.content.presenter.impl.FeatureImpl;
import com.edukera.website.client.content.presenter.impl.InputImpl;
import com.edukera.website.client.content.presenter.impl.LogoImpl;
import com.edukera.website.client.content.presenter.impl.SoonImpl;
import com.edukera.website.client.content.presenter.impl.ValuePropositionImpl;
import com.edukera.website.client.content.view.ButtonLanguageView;
import com.edukera.website.client.content.view.ConnectionView;
import com.edukera.website.client.content.view.FeatureView;
import com.edukera.website.client.content.view.InputView;
import com.edukera.website.client.content.view.LogoView;
import com.edukera.website.client.content.view.SoonView;
import com.edukera.website.client.content.view.ValuePropositionView;
import com.edukera.website.client.generic.presenter.Tools;
import com.edukera.website.client.generic.presenter.impl.ToolsImpl;
import com.edukera.website.client.main.presenter.ContainerFeature;
import com.edukera.website.client.main.presenter.ContainerHilbert;
import com.edukera.website.client.main.presenter.ContainerSky;
import com.edukera.website.client.main.presenter.Footer;
import com.edukera.website.client.main.presenter.Header;
import com.edukera.website.client.main.presenter.Main;
import com.edukera.website.client.main.presenter.impl.ContainerFeatureImpl;
import com.edukera.website.client.main.presenter.impl.ContainerHilbertImpl;
import com.edukera.website.client.main.presenter.impl.ContainerSkyImpl;
import com.edukera.website.client.main.presenter.impl.FooterImpl;
import com.edukera.website.client.main.presenter.impl.HeaderImpl;
import com.edukera.website.client.main.presenter.impl.MainImpl;
import com.edukera.website.client.main.view.ContainerFeatureView;
import com.edukera.website.client.main.view.ContainerHilbertView;
import com.edukera.website.client.main.view.ContainerSkyView;
import com.edukera.website.client.main.view.FooterView;
import com.edukera.website.client.main.view.HeaderView;
import com.edukera.website.client.main.view.MainView;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
//github.com/edukera/ui.git

public class Module extends AbstractGinModule {

	@Override
	protected void configure() {


		/* Generic */

		bind(EventBus.class).to(SimpleEventBus.class);
		bind(Tools.class).to(ToolsImpl.class).in(Singleton.class);

		/* Main */

		bind(Main.class).to(MainImpl.class).in(Singleton.class);
		bind(Main.Display.class).to(MainView.class).in(Singleton.class);

		bind(Header.class).to(HeaderImpl.class);
		bind(Header.Display.class).to(HeaderView.class);

		bind(Footer.class).to(FooterImpl.class);
		bind(Footer.Display.class).to(FooterView.class);

		bind(ContainerSky.class).to(ContainerSkyImpl.class);
		bind(ContainerSky.Display.class).to(ContainerSkyView.class);
		
		bind(ContainerFeature.class).to(ContainerFeatureImpl.class);
		bind(ContainerFeature.Display.class).to(ContainerFeatureView.class);
		
		bind(ContainerHilbert.class).to(ContainerHilbertImpl.class);
		bind(ContainerHilbert.Display.class).to(ContainerHilbertView.class);
		
		/* Content */
		
		bind(Logo.class).to(LogoImpl.class);
		bind(Logo.Display.class).to(LogoView.class);

		bind(Input.class).to(InputImpl.class);
		bind(Input.Display.class).to(InputView.class);

		bind(Connection.class).to(ConnectionImpl.class);
		bind(Connection.Display.class).to(ConnectionView.class);

		bind(ValueProposition.class).to(ValuePropositionImpl.class);
		bind(ValueProposition.Display.class).to(ValuePropositionView.class);
		
		bind(Soon.class).to(SoonImpl.class);
		bind(Soon.Display.class).to(SoonView.class);
		
		bind(Feature.class).to(FeatureImpl.class);
		bind(Feature.Display.class).to(FeatureView.class);
		
		bind(ButtonLanguage.class).to(ButtonLanguageImpl.class);
		bind(ButtonLanguage.Display.class).to(ButtonLanguageView.class);
	}
}
