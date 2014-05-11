package com.edukera.website.client.generic.event;

import com.edukera.website.client.generic.tools.ASyncCall;
import com.google.gwt.event.shared.GwtEvent;

public abstract class AEvent<H extends AHandler<?>> extends GwtEvent<H> {
		
	private ASyncCall<String> mASyncCall;
	private boolean mSpreading;
	
	public AEvent() {
		mSpreading = true;
	}

	public ASyncCall<String> getASyncCall() {
		return mASyncCall;
	}

	public void setASyncCall(ASyncCall<String> iASyncFunction) {
		this.mASyncCall = iASyncFunction;
	}

	public boolean isSpreading() {
		return mSpreading;
	}
	
	public void setSpreading(boolean iSpreading) {
		mSpreading = iSpreading;
	}
	
}
