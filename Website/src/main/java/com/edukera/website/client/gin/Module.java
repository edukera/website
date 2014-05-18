package com.edukera.website.client.gin;

import com.edukera.website.client.content.presenter.About;
import com.edukera.website.client.content.presenter.ButtonLanguage;
import com.edukera.website.client.content.presenter.Connection;
import com.edukera.website.client.content.presenter.Feature;
import com.edukera.website.client.content.presenter.Hilbert;
import com.edukera.website.client.content.presenter.Input;
import com.edukera.website.client.content.presenter.Logo;
import com.edukera.website.client.content.presenter.Product;
import com.edukera.website.client.content.presenter.Soon;
import com.edukera.website.client.content.presenter.ValueProposition;
import com.edukera.website.client.content.presenter.impl.AboutImpl;
import com.edukera.website.client.content.presenter.impl.ButtonLanguageImpl;
import com.edukera.website.client.content.presenter.impl.ConnectionImpl;
import com.edukera.website.client.content.presenter.impl.FeatureImpl;
import com.edukera.website.client.content.presenter.impl.HilbertImpl;
import com.edukera.website.client.content.presenter.impl.InputImpl;
import com.edukera.website.client.content.presenter.impl.LogoImpl;
import com.edukera.website.client.content.presenter.impl.ProductImpl;
import com.edukera.website.client.content.presenter.impl.SoonImpl;
import com.edukera.website.client.content.presenter.impl.ValuePropositionImpl;
import com.edukera.website.client.content.view.AboutView;
import com.edukera.website.client.content.view.ButtonLanguageView;
import com.edukera.website.client.content.view.ConnectionView;
import com.edukera.website.client.content.view.FeatureView;
import com.edukera.website.client.content.view.HilbertView;
import com.edukera.website.client.content.view.InputView;
import com.edukera.website.client.content.view.LogoView;
import com.edukera.website.client.content.view.ProductView;
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

		bind(Header.class).to(HeaderImpl.class).in(Singleton.class);
		bind(Header.Display.class).to(HeaderView.class).in(Singleton.class);

		bind(Footer.class).to(FooterImpl.class).in(Singleton.class);
		bind(Footer.Display.class).to(FooterView.class).in(Singleton.class);

		bind(ContainerSky.class).to(ContainerSkyImpl.class).in(Singleton.class);
		bind(ContainerSky.Display.class).to(ContainerSkyView.class).in(Singleton.class);
		
		bind(ContainerFeature.class).to(ContainerFeatureImpl.class).in(Singleton.class);
		bind(ContainerFeature.Display.class).to(ContainerFeatureView.class).in(Singleton.class);
		
		bind(ContainerHilbert.class).to(ContainerHilbertImpl.class).in(Singleton.class);
		bind(ContainerHilbert.Display.class).to(ContainerHilbertView.class).in(Singleton.class);
		
		/* Content */
		
		bind(Logo.class).to(LogoImpl.class).in(Singleton.class);
		bind(Logo.Display.class).to(LogoView.class).in(Singleton.class);

		bind(Input.class).to(InputImpl.class).in(Singleton.class);
		bind(Input.Display.class).to(InputView.class).in(Singleton.class);

		bind(Connection.class).to(ConnectionImpl.class).in(Singleton.class);
		bind(Connection.Display.class).to(ConnectionView.class).in(Singleton.class);

		bind(ValueProposition.class).to(ValuePropositionImpl.class).in(Singleton.class);
		bind(ValueProposition.Display.class).to(ValuePropositionView.class).in(Singleton.class);
		
		bind(Soon.class).to(SoonImpl.class).in(Singleton.class);
		bind(Soon.Display.class).to(SoonView.class).in(Singleton.class);
		
		bind(Feature.class).to(FeatureImpl.class).in(Singleton.class);
		bind(Feature.Display.class).to(FeatureView.class).in(Singleton.class);
		
		bind(ButtonLanguage.class).to(ButtonLanguageImpl.class).in(Singleton.class);
		bind(ButtonLanguage.Display.class).to(ButtonLanguageView.class).in(Singleton.class);
		
		bind(About.class).to(AboutImpl.class).in(Singleton.class);
		bind(About.Display.class).to(AboutView.class).in(Singleton.class);
		
		bind(Product.class).to(ProductImpl.class).in(Singleton.class);
		bind(Product.Display.class).to(ProductView.class).in(Singleton.class);
		
		bind(Hilbert.class).to(HilbertImpl.class).in(Singleton.class);
		bind(Hilbert.Display.class).to(HilbertView.class).in(Singleton.class);
	}
}
