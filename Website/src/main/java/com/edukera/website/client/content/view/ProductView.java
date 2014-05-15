package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.Product;
import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;

public class ProductView extends ADivView implements Product.Display {

	private final DivPanel mContent;
	
	public ProductView() {
		mRoot.addStyleName(STYLE.product());
		
		mContent = new DivPanel();
		mRoot.add(mContent);
		mContent.addStyleName(STYLE.productContent());
		mContent.addStyleName(STYLE.transAll());
	}
	
	public void setContentText(String iText) {
		mContent.setText(iText);
	}

}
