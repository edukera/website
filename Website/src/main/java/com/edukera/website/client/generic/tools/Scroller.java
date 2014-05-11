package com.edukera.website.client.generic.tools;

import com.edukera.website.client.generic.view.ADisplay;
import com.google.gwt.animation.client.Animation;

public class Scroller extends Animation {

	private int mBegin;
	private int mValue;
	private final ADisplay display;
	
	public Scroller(ADisplay iDisplay, int iBegin, int iValue) {
		display = iDisplay;
		mBegin = iBegin;
		mValue = iValue;
	}
	
	@Override
	protected void onUpdate(double progress) {
		if (display != null) {
			display.setScrollAbsolute((int) (mBegin + progress * mValue));
		}
	}

}