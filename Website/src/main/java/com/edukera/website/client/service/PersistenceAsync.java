package com.edukera.website.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface PersistenceAsync {

	void saveEmail(String iEmail, String iLanguage,
			AsyncCallback<Integer> callback);

}
