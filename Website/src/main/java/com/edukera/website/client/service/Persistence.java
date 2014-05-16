package com.edukera.website.client.service;
import com.google.gwt.user.client.rpc.RemoteService;

public interface Persistence extends RemoteService {
	public Integer saveEmail(String iEmail, String iLanguage);
}
