package com.edukera.website.client.main.presenter;

import com.edukera.website.client.data.Language;
import com.edukera.website.client.generic.presenter.ADraw;


public interface Main extends ADraw<Main.Display> {

	interface Display extends ADraw.Display {

	}
	
	Language getLanguage();
	void setLanguage(Language iLanguage);
}
