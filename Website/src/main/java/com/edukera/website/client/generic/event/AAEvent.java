package com.edukera.website.client.generic.event;

import com.edukera.website.client.generic.event.AAEvent.EEnum;

public abstract class AAEvent<E extends EEnum, H extends AAHandler<E, ?>> extends AEvent<H> {
		
	public static interface EEnum {
		
	}
	
	private E mEnum;
	
	public E getEnum() {
		return mEnum;
	}
	
	public AAEvent(E iEnum) {
		super();
		mEnum = iEnum;
	}
	
	public void setEEnum(E iEnum) {
		mEnum = iEnum;
	}

}
