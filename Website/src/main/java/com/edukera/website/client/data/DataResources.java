package com.edukera.website.client.data;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.edukera.website.client.data.tools.DataTools;
import com.google.gwt.resources.client.TextResource;

public class DataResources {
	private final Language mDefaultLanguage = Language.fr;
	
	private static DataResources sInstance = null;
	private final Set<Language> mLanguages;
	private Map<String, String> mContent;
	private Map<String, String> mDefaultContent;
	private Map<String, Map<String, String>> mCurrentMap;
	private Map<Language, Map<String, Map<String, String>>> mMap;

	private Language mCurrentLanguage;

	public static DataResources getInstance() {
		if (sInstance == null) {
			sInstance = new DataResources();
		}
		return sInstance;
	}
	
	private DataResources() {
		mMap = new HashMap<Language, Map<String,Map<String,String>>>();
		
		mLanguages = new HashSet<Language>();
		addLanguage(mDefaultLanguage);
		
		Map<String, Map<String, String>> lMap = mMap.get(mDefaultLanguage);
		mDefaultContent = lMap.get("website");
	}
	
	private void addLanguage(Language iLanguage) {
		if (!mLanguages.contains(iLanguage)) {
			mLanguages.add(iLanguage);
			mMap.put(iLanguage, new HashMap<String, Map<String,String>>());
			processDynamic(mMap.get(iLanguage), DynamicListPropertiesResources.MAP.get(iLanguage));
		}
	}

	private void processDynamic(Map<String, Map<String, String>> iMap, Map<String, TextResource> iTextResources) {
		for (Entry<String, TextResource> ll  : iTextResources.entrySet()) {
			String lTInput = ll.getValue().getText();
			Map<String, String> lMap = DataTools.getProperties(lTInput);
			iMap.put(ll.getKey(), lMap);
		}
	}

	public void switchLanguage(Language iLanguage) {
		addLanguage(iLanguage);
		mCurrentLanguage = iLanguage;
		mCurrentMap = mMap.get(iLanguage);
		mContent = mCurrentMap.get("website");
	}
	
	public String getContent(String iId) {
		return getContent(mContent,  mDefaultContent, iId);
	}
	
	private String getContent(Map<String, String> iMap, Map<String, String> iDefaultMap, String iId) {
		String lValue = iMap.get(iId);
		if (lValue == null &&
				iDefaultMap != null) {
			lValue = iDefaultMap.get(iId);
		}
		return lValue;
	}

	public Language getCurrentLanguage() {
		return mCurrentLanguage;
	}

}
