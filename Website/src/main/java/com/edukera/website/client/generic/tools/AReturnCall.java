package com.edukera.website.client.generic.tools;

public abstract class AReturnCall<T, I> extends AReturnWithArgCall<T, I>{
	
	public void createInstance(I iArg) {
		createInstance();
	}
	
	public abstract void createInstance();
	
}
