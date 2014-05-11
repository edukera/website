package com.edukera.website.client.gin;

import com.edukera.website.client.content.presenter.Input;
import com.edukera.website.client.content.presenter.Logo;
import com.edukera.website.client.content.presenter.TagPhrase;
import com.edukera.website.client.content.presenter.impl.InputImpl;
import com.edukera.website.client.content.presenter.impl.LogoImpl;
import com.edukera.website.client.content.presenter.impl.TagPhraseImpl;
import com.edukera.website.client.content.view.InputView;
import com.edukera.website.client.content.view.LogoView;
import com.edukera.website.client.content.view.TagPhraseView;
import com.edukera.website.client.generic.presenter.Tools;
import com.edukera.website.client.generic.presenter.impl.ToolsImpl;
import com.edukera.website.client.main.presenter.Footer;
import com.edukera.website.client.main.presenter.Header;
import com.edukera.website.client.main.presenter.Main;
import com.edukera.website.client.main.presenter.impl.FooterImpl;
import com.edukera.website.client.main.presenter.impl.HeaderImpl;
import com.edukera.website.client.main.presenter.impl.MainImpl;
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

		bind(Main.class).to(MainImpl.class);
		bind(Main.Display.class).to(MainView.class);

		bind(Header.class).to(HeaderImpl.class);
		bind(Header.Display.class).to(HeaderView.class);

		bind(Footer.class).to(FooterImpl.class);
		bind(Footer.Display.class).to(FooterView.class);

		/* Content */
		
		bind(Logo.class).to(LogoImpl.class);
		bind(Logo.Display.class).to(LogoView.class);

		bind(TagPhrase.class).to(TagPhraseImpl.class);
		bind(TagPhrase.Display.class).to(TagPhraseView.class);

		bind(Input.class).to(InputImpl.class);
		bind(Input.Display.class).to(InputView.class);

	}
}
