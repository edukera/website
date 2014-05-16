package com.edukera.website.client.main.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.Input.State;
import com.edukera.website.client.data.DataResources;
import com.edukera.website.client.data.Language;
import com.edukera.website.client.generic.presenter.ADraw;
import com.edukera.website.client.generic.presenter.impl.ADrawImpl;
import com.edukera.website.client.generic.tools.Scroller;
import com.edukera.website.client.main.presenter.ContainerFeature;
import com.edukera.website.client.main.presenter.ContainerHilbert;
import com.edukera.website.client.main.presenter.ContainerSky;
import com.edukera.website.client.main.presenter.Footer;
import com.edukera.website.client.main.presenter.Header;
import com.edukera.website.client.main.presenter.Main;
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
	
	private Language mLanguage = Language.fr;
	private final Header mHeader;
	private final ContainerSky mContainerSky;
	private final ContainerFeature mContainerFeature;
	private final ContainerHilbert mContainerHilbert;
	private final Footer mFooter;

	@Inject
	public MainImpl(EventBus eventBus, Main.Display display) {
		super(eventBus, display);
		mHeader = EdukeraWebsite.ginjector.getHeader();
		mContainerSky = EdukeraWebsite.ginjector.getContainerSky();
		mContainerFeature = EdukeraWebsite.ginjector.getContainerFeature();
		mContainerHilbert = EdukeraWebsite.ginjector.getContainerHilbert();
		mFooter = EdukeraWebsite.ginjector.getFooter();

		display.add(mHeader.getDisplay().asWidget());
		display.add(mContainerSky.getDisplay().asWidget());
		display.add(mContainerFeature.getDisplay().asWidget());
		display.add(mContainerHilbert.getDisplay().asWidget());
		display.add(mFooter.getDisplay().asWidget());
	}

	@Override
	public void bind() {
		super.bind();
		mHeader.bind();
		mContainerSky.bind();
		mContainerFeature.bind();
		mContainerHilbert.bind();
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
		int lBegin = display.getElement().getScrollTop();
		int lValue = iComponent.getDisplay().getElement().getAbsoluteTop();
		Scroller lScroller = new Scroller(display, lBegin, lValue);
		lScroller.run(300);
	}

	@Override
	public void saveEmail(String iEmail) {
		sPersistence.saveEmail(iEmail, mLanguage.toString(), new AsyncCallback<Integer>() {
			
			@Override
			public void onSuccess(Integer iResult) {
				if (iResult != null) {
					if (iResult == 0) {
						fwdInput(State.saved);
					} else if (iResult == 1) {
						fwdInput(State.duplicate);
					} else {
						fwdInput(State.error);
					}
				} else {
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

}
