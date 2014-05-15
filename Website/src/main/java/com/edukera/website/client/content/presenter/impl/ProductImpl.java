package com.edukera.website.client.content.presenter.impl;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.content.presenter.Product;
import com.edukera.website.client.data.DataResources;
import com.edukera.website.client.data.WebsiteKeys;
import com.edukera.website.client.generic.presenter.impl.BasePresenter;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ProductImpl extends BasePresenter<Product.Display> implements Product {

	@Inject
	public ProductImpl(EventBus eventBus, Product.Display display) {
		super(eventBus, display);
	}
	
	@Override
	public void bind() {
		super.bind();
		
		registerHandler(display.getHasClickHandlers().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				doClick();
			}
		}));
	}
	
	public void draw() {
		String lText = DataResources.getInstance().getContent(WebsiteKeys.PRODUCT);
		display.setContentText(lText);
	}
	
	private void doClick() {
		EdukeraWebsite.ginjector.getMain().scrollProduct();
	}
	
}
