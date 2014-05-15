package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.ADraw;


public interface Feature extends ADraw<Feature.Display> {

	interface Display extends ADraw.Display {
		void setReasoningText(String iText);
		void setCalculusText(String iText);
		void setWrittingText(String iText);
	}
}
