package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.ADraw;


public interface ValueProposition extends ADraw<ValueProposition.Display> {

	interface Display extends ADraw.Display {
		void setTitleText(String iText);
		void setFirstLineText(String iText);
		void setSecondLineText(String iText);
	}
	
	void draw();
}
