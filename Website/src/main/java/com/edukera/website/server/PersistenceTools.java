package com.edukera.website.server;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.edukera.website.server.entity.Email;

public class PersistenceTools {

	private static String FIND_EMAIL_QUERY = "select e from Email e where e.email=:email";
	
	
	public static void saveEmail(Email iEmail) {
		if (iEmail != null) {
			EntityManager lEntityManager = EMF.get().createEntityManager();
			if (lEntityManager != null) {
				try {
					lEntityManager.persist(iEmail);
				} finally {
					lEntityManager.close();
				}
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

	public static boolean existEmail(String iEmail) {
		boolean lRes = false;
		if (iEmail != null) {
			EntityManager lEntityManager = EMF.get().createEntityManager();
			if (lEntityManager != null) {
				try {
					Query query = lEntityManager.createQuery(FIND_EMAIL_QUERY);
					query.setParameter("email", iEmail);
					@SuppressWarnings("unchecked") List<Email> lList = query.getResultList();
					lRes =  lList.size() > 0;
				} finally {
					lEntityManager.close();
				}
			}
		}
		return lRes;
	}
}
