package com.edukera.website.client.generic.event;



public abstract class AHandler<A extends AEvent<?>> implements IHandler<A> {
	

	public void onProcess(A iEvent) {
		process(iEvent);
	}
	
	public abstract void process(A iEvent);
}
