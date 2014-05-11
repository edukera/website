package com.edukera.website.client.generic.tools;

public abstract class AReturnWithArgCall<T, A> {
	
	protected T mInstance = null;
	
	public abstract void createInstance(A iArg);
	
	public T getInstance() {
		return mInstance;
	}
}
