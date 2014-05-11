package com.edukera.website.client.generic.event;

import com.edukera.website.client.generic.event.AAEvent.EEnum;


public abstract class AAHandler<E extends EEnum, A extends AAEvent<E, ?>> extends AHandler<A> {
	
	protected final E mEnum;
	
	public AAHandler(E iEnum) {
		mEnum = iEnum;
	}
	
	public void onProcess(A iEvent) {
		if (mEnum == iEvent.getEnum()) {
			process(iEvent);
		}
	}
	
	public abstract void process(A iEvent);
}
