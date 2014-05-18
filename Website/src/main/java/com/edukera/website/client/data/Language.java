package com.edukera.website.client.data;
public enum Language {
	de,
	el,
	en,
	es,
	fr,
	it,
	jp,
	hi,
	ko,
	pt,
	ru,
	zh;
	
	public String getDescription() {
		switch (this) {
		case de:
			return "Deutsch";
		case el:
			return "Ελληνικά";
		case en:
			return "English";
		case es:
			return "Español";
		case fr:
			return "Français";
		case it:
			return "Italiano";
		case jp:
			return "日本語";
		case hi:
			return "हिन्दी";
		case ko:
			return "한국어";
		case pt:
			return "Português";
		case ru:
			return "Русский";
		case zh:
			return "中文";
		}
		return null;
	}

	public static Language getLanguage(String iLocale) {
		Language lLanguage = fr;
		if (iLocale != null) {
			if (iLocale.equals("fr")) {
				
			} else if (iLocale.equals("en")) {
				lLanguage = en;
			}
		}
		return lLanguage;
	}
}