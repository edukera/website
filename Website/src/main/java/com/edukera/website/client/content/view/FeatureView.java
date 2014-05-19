package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.Feature;
import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.google.gwt.user.client.ui.Widget;

public class FeatureView extends ADivView implements Feature.Display {

	private final DivPanel mLogo;
	private final DivPanel mWrapper;
	private final DivPanel mTitle;
	private final DivPanel mDesc;

	public FeatureView() {
		mRoot.addStyleName(STYLE.feature());

		mLogo = new DivPanel();
		mRoot.add(mLogo);
		mLogo.addStyleName(STYLE.featureLogo());

		mWrapper = new DivPanel();
		mRoot.add(mWrapper);
		mWrapper.addStyleName(STYLE.featureWrapper());

		mTitle = new DivPanel();
		mWrapper.add(mTitle);
		mTitle.addStyleName(STYLE.featureTitle());

		mDesc = new DivPanel();
		mWrapper.add(mDesc);
		mDesc.addStyleName(STYLE.featureDesc());
	}

	@Override
	public void setTitleText(String iText) {
		mTitle.setText(iText);
	}

	@Override
	public void setDescText(String iText) {
		mDesc.setText(iText);
	}

	@Override
	public void setLogo(Widget iWidget) {
		mLogo.add(iWidget);
	}

}
