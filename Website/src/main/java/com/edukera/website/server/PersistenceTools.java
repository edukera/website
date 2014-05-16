package com.edukera.website.server;

import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

public class PersistenceTools {

	public static void saveEmail(Email iEmail) {
		if (iEmail != null) {
			EntityManager lEntityManager = null;
			try {
				lEntityManager = EMF.get().createEntityManager();
				lEntityManager.persist(iEmail);
			} finally {
				lEntityManager.close();
			}
		}
	}

	public static Email createEmail(String iEmail, String iLanguage) {
		Email lEmail = new Email();
		lEmail.setEmail(iEmail);
		lEmail.setLanguage(iLanguage);
		lEmail.setSubscription(GregorianCalendar.getInstance().getTime());
		lEmail.setActive(true);
		return lEmail;
	}
}
