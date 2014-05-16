package com.edukera.website.server;

import com.edukera.website.client.service.Persistence;
import com.edukera.website.server.entity.Email;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class PersistenceImpl extends RemoteServiceServlet implements Persistence {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Integer saveEmail(String iEmail, String iLanguage) {
		boolean lExist = PersistenceTools.existEmail(iEmail);
		if (lExist) {
			return 1;
		}
		Email lEmail = PersistenceTools.createEmail(iEmail, iLanguage);
		PersistenceTools.saveEmail(lEmail);
		return 0;
	}

}
