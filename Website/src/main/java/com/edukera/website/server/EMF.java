package com.edukera.website.server;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 * Factory for creating EntityManager.
 */
public final class EMF {
	private static EntityManagerFactory mEmfInstance = null;

	public static EntityManagerFactory get() {
		if (mEmfInstance == null) {
			try {
				mEmfInstance = Persistence.createEntityManagerFactory("transactions-optional");
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return mEmfInstance;
	}
	private EMF() {
	}
}
