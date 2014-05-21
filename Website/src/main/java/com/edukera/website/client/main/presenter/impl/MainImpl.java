package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.Input.State;
import com.edukera.website.client.data.DataResources;
import com.edukera.website.client.data.Language;
import com.edukera.website.client.generic.presenter.ADraw;
import com.edukera.website.client.generic.presenter.impl.ADrawImpl;
import com.edukera.website.client.generic.tools.Scroller;
import com.edukera.website.client.main.presenter.ContainerAbout;
import com.edukera.website.client.main.presenter.ContainerFeature;
import com.edukera.website.client.main.presenter.ContainerHilbert;
import com.edukera.website.client.main.presenter.ContainerSky;
import com.edukera.website.client.main.presenter.Footer;
import com.edukera.website.client.main.presenter.Header;
import com.edukera.website.client.main.presenter.Main;
import com.edukera.website.client.resources.GAnalyticsTools;
import com.edukera.website.client.service.Persistence;
import com.edukera.website.client.service.PersistenceAsync;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class MainImpl extends ADrawImpl<Main.Display> implements Main {

	PersistenceAsync sPersistence = (PersistenceAsync) GWT.create(Persistence.class);
	
	private boolean mAboutMode;
	private Language mLanguage = Language.fr;
	private final Header mHeader;
	private final ContainerSky mContainerSky;
	private final ContainerFeature mContainerFeature;
	private final ContainerHilbert mContainerHilbert;
	private final ContainerAbout mContainerAbout;
	private final Footer mFooter;

	@Inject
	public MainImpl(EventBus eventBus, Main.Display display) {
		super(eventBus, display);
		mHeader = EdukeraWebsite.ginjector.getHeader();
		mContainerSky = EdukeraWebsite.ginjector.getContainerSky();
		mContainerFeature = EdukeraWebsite.ginjector.getContainerFeature();
		mContainerHilbert = EdukeraWebsite.ginjector.getContainerHilbert();
		mContainerAbout = EdukeraWebsite.ginjector.getContainerAbout();
		mFooter = EdukeraWebsite.ginjector.getFooter();

		display.add(mHeader.getDisplay().asWidget());
		display.add(mContainerSky.getDisplay().asWidget());
		display.add(mContainerFeature.getDisplay().asWidget());
		display.add(mContainerHilbert.getDisplay().asWidget());
		display.add(mContainerAbout.getDisplay().asWidget());
		display.add(mFooter.getDisplay().asWidget());
		updateAboutMode(false);
		fillLanguage();
	}

	@Override
	public void bind() {
		super.bind();
		mHeader.bind();
		mContainerSky.bind();
		mContainerFeature.bind();
		mContainerHilbert.bind();
		mContainerAbout.bind();
		mFooter.bind();

		registerHandler(Window.addResizeHandler(new ResizeHandler() {

			@Override
			public void onResize(ResizeEvent event) {
				draw();
			}
		}));
		
	}

	@Override
	public void draw() {
		int lHeight = Window.getClientHeight();
		display.setHeight(lHeight);

		DataResources.getInstance().switchLanguage(mLanguage);

		mHeader.draw();
		mContainerSky.draw();
		mContainerFeature.draw();
		mContainerHilbert.draw();
		mContainerAbout.draw();
		mFooter.draw();
	}

	public Language getLanguage() {
		return mLanguage;
	}

	public void setLanguage(Language iLanguage) {
		this.mLanguage = iLanguage;
	}

	@Override
	public void scrollProduct() {
		scroll(mContainerFeature);
	}

	@Override
	public void scrollAbout() {
		scroll(mContainerHilbert);
	}

	private void scroll(ADraw<?> iComponent) {
		int lValue = iComponent.getDisplay().getElement().getAbsoluteTop();
		scroll(lValue);
	}
	
	private void scroll(int iValue) {
		int lBegin = display.getElement().getScrollTop();
		Scroller lScroller = new Scroller(display, lBegin, iValue);
		lScroller.run(300);
	}

	@Override
	public void saveEmail(String iEmail) {
		sPersistence.saveEmail(iEmail, mLanguage.toString(), new AsyncCallback<Integer>() {
			
			@Override
			public void onSuccess(Integer iResult) {
				if (iResult != null) {
					if (iResult == 0) {
						GAnalyticsTools.validEmail();
						fwdInput(State.saved);
					} else if (iResult == 1) {
						GAnalyticsTools.duplicatedEmail();
						fwdInput(State.duplicate);
					} else {
						GAnalyticsTools.errorEmail();
						fwdInput(State.error);
					}
				} else {
					GAnalyticsTools.errorEmail();
					fwdInput(State.error);
				}
			}


			@Override
			public void onFailure(Throwable caught) {
				fwdInput(State.error);
			}
		});
		
	}
	
	
	private void fwdInput(State iState) {
		EdukeraWebsite.ginjector.getInput().setState(iState);
		EdukeraWebsite.ginjector.getInput().draw();
	}
	
	private native String getInternalLocale() /*-{
	return navigator.language;
}-*/;

	private String getLocale() {
		String lLocale = getInternalLocale();
		if (lLocale != null) {
			String lLanguage = lLocale.substring(0, 2);
			return lLanguage;
		}
		return null;
	}

	private void fillLanguage() {
		String lLocale = getLocale();
		mLanguage = Language.getLanguage(lLocale);
	}
	
	public void updateAboutMode(boolean iAboutMode) {
		mAboutMode = iAboutMode;
		if (mAboutMode) {
			display.setAbout();
			mContainerSky.getDisplay().hide();
			mContainerFeature.getDisplay().hide();
			mContainerHilbert.getDisplay().hide();
			
			mContainerAbout.getDisplay().show();
			
			int lHeight = Window.getClientHeight() - (mHeader.getDisplay().getHeight() + mFooter.getDisplay().getHeight());
			if (lHeight < 350) {
				lHeight = 350;
			}
			mContainerAbout.getDisplay().setHeight(lHeight);
			scroll(0);
		} else {
			display.unsetAbout();
			mContainerSky.getDisplay().show();
			mContainerFeature.getDisplay().show();
			mContainerHilbert.getDisplay().show();
			
			mContainerAbout.getDisplay().hide();
			mContainerAbout.getDisplay().setHeight(0);
		}
	}

	public void clickLogo() {
		if (mAboutMode) {
			updateAboutMode(false);
		}
	}
}
