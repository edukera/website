package com.edukera.website.client.content.presenter;

import com.edukera.website.client.generic.presenter.ADraw;


public interface LegalInformation extends ADraw<LegalInformation.Display> {

	interface Display extends ADraw.Display {
		void setTextTitle(String iText);
		void setLegal1(String iText);
		void setLegal2(String iText);
		void setLegal3(String iText);
	}
}
