package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.Feature;
import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;

public class FeatureView extends ADivView implements Feature.Display {

	private final DivPanel mReasonning;
	private final DivPanel mCalculus;
	private final DivPanel mWriting;
	
	public FeatureView() {
		mRoot.addStyleName(STYLE.feature());
		
		mReasonning = new DivPanel();
		mRoot.add(mReasonning);
		mReasonning.addStyleName(STYLE.featureReasoning());
		mReasonning.getElement().setAttribute("data-icon", "à");
		
		mCalculus = new DivPanel();
		mRoot.add(mCalculus);
		mCalculus.addStyleName(STYLE.featureCalculus());
		mCalculus.getElement().setAttribute("data-icon", "^");
		
		mWriting = new DivPanel();
		mRoot.add(mWriting);
		mWriting.addStyleName(STYLE.featureWriting());
		mWriting.getElement().setAttribute("data-icon", "I");
	}

}
