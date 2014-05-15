package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.Feature;
import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;

public class FeatureView extends ADivView implements Feature.Display {

	private final DivPanel mReasonning;
	private final DivPanel mReasonningLogo;
	private final DivPanel mReasonningDesc;
	private final DivPanel mCalculus;
	private final DivPanel mCalculusLogo;
	private final DivPanel mCalculusDesc;
	private final DivPanel mWriting;
	private final DivPanel mWritingLogo;
	private final DivPanel mWritingDesc;
	
	public FeatureView() {
		mRoot.addStyleName(STYLE.feature());
		
		mReasonning = new DivPanel();
		mRoot.add(mReasonning);
		mReasonning.addStyleName(STYLE.featureReasoning());
		
		mReasonningLogo = new DivPanel();
		mReasonning.add(mReasonningLogo);
		mReasonningLogo.addStyleName(STYLE.featureReasoningLogo());
		mReasonningLogo.setText("à");
		
		mReasonningDesc = new DivPanel();
		mReasonning.add(mReasonningDesc);
		mReasonningDesc.addStyleName(STYLE.featureReasoningDesc());

		
		mCalculus = new DivPanel();
		mRoot.add(mCalculus);
		mCalculus.addStyleName(STYLE.featureCalculus());
		
		mCalculusLogo = new DivPanel();
		mCalculus.add(mCalculusLogo);
		mCalculusLogo.addStyleName(STYLE.featureCalculusLogo());
		mCalculusLogo.setText("^");
		
		mCalculusDesc = new DivPanel();
		mCalculus.add(mCalculusDesc);
		mCalculusDesc.addStyleName(STYLE.featureCalculusDesc());
		
		
		mWriting = new DivPanel();
		mRoot.add(mWriting);
		mWriting.addStyleName(STYLE.featureWriting());
		
		mWritingLogo = new DivPanel();
		mWriting.add(mWritingLogo);
		mWritingLogo.addStyleName(STYLE.featureWritingLogo());
		mWritingLogo.setText("I");
		
		mWritingDesc = new DivPanel();
		mWriting.add(mWritingDesc);
		mWritingDesc.addStyleName(STYLE.featureWritingDesc());
		
	}

	public void setReasoningText(String iText) {
		mReasonningDesc.setText(iText);
	}

	public void setCalculusText(String iText) {
		mCalculusDesc.setText(iText);
	}

	public void setWrittingText(String iText) {
		mWritingDesc.setText(iText);
	}
}
