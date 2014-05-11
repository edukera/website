package com.edukera.website.client.main.view;

import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.main.presenter.Footer;

public class FooterView extends ADivView implements Footer.Display {

	public FooterView() {
		mRoot.addStyleName(STYLE.footer());
	}
	
}
