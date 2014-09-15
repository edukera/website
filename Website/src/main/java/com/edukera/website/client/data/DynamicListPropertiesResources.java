// DO NOT EDIT: Powered by Edukera
package com.edukera.website.client.data;

import java.util.HashMap;
import java.util.Map;

import com.edukera.website.client.resources.ListPropertiesResources;
import com.google.gwt.resources.client.TextResource;

public class DynamicListPropertiesResources {

	public final static Map<Language, Map<String, TextResource>> MAP;
	static {
		MAP = new HashMap<Language, Map<String,TextResource>>();

//putMap(Language.de, "website", ListPropertiesResources.INSTANCE.websitedeProperties());
//putMap(Language.el, "website", ListPropertiesResources.INSTANCE.websiteelProperties());
//putMap(Language.en, "website", ListPropertiesResources.INSTANCE.websiteenProperties());
//putMap(Language.es, "website", ListPropertiesResources.INSTANCE.websiteesProperties());
putMap(Language.fr, "website", ListPropertiesResources.INSTANCE.websitefrProperties());
//putMap(Language.it, "website", ListPropertiesResources.INSTANCE.websiteitProperties());
//putMap(Language.jp, "website", ListPropertiesResources.INSTANCE.websitejpProperties());
//putMap(Language.hi, "website", ListPropertiesResources.INSTANCE.websitehiProperties());
//putMap(Language.ko, "website", ListPropertiesResources.INSTANCE.websitekoProperties());
//putMap(Language.pt, "website", ListPropertiesResources.INSTANCE.websiteptProperties());
//putMap(Language.ru, "website", ListPropertiesResources.INSTANCE.websiteruProperties());
//putMap(Language.zh, "website", ListPropertiesResources.INSTANCE.websitezhProperties());

		
}

	private static void putMap(Language iLanguage, String iId, TextResource iTextResource) {
		if (!MAP.containsKey(iLanguage)) {
			MAP.put(iLanguage, new HashMap<String, TextResource>());
		}
		MAP.get(iLanguage).put(iId, iTextResource);
	}
	
	public static String getTextResourceString(String iId) {
		if (iId != null) {
			Map<String, TextResource> lMap = MAP.get(DataResources.getInstance().getCurrentLanguage());
			if (lMap !=  null) { 
				TextResource lTextResource = lMap.get(iId);
				if (lTextResource != null) {
					return lTextResource.getText();
				}
			}
		}
		return null;
	}
}
		