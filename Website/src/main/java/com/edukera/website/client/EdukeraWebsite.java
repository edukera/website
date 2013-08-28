package com.edukera.website.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.LocaleInfo;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class EdukeraWebsite implements EntryPoint {
	private Translation constants = GWT.create(Translation.class);

	public void onModuleLoad() {
		String lLocale = LocaleInfo.getCurrentLocale().getLocaleName();
		sendText(lLocale);
		translate(lLocale);
	}

	public void sendText(String iText) {
		Logger.getLogger("").log(Level.INFO, iText);
	}
	
	public void translate(String iLocale) {
		Map<String, String> lMap = new HashMap<String, String>();
		lMap.put("roadmap", constants.roadmap());
		lMap.put("connect-header", constants.connectHeader());
		lMap.put("connectFacebook", constants.connectFacebook());
		lMap.put("connectGoogle", constants.connectGoogle());
		lMap.put("quoteHilberta", constants.quoteHilberta());
		lMap.put("quoteHilbertb", constants.quoteHilbertb());
		lMap.put("quoteHilbertc", constants.quoteHilbertc());
		lMap.put("hilbert", constants.hilbert());
		lMap.put("learnMorea", constants.learnMorea());
		lMap.put("mathEverywherea", constants.mathEverywherea());
		lMap.put("cosinus", constants.cosinus());
		lMap.put("learnMoreb", constants.learnMoreb());
		lMap.put("mathEverywhereb", constants.mathEverywhereb());
		lMap.put("fibo", constants.fibo());
		lMap.put("learnMorec", constants.learnMorec());
		lMap.put("about", constants.about());
		lMap.put("termPrivacy", constants.termPrivacy());
		lMap.put("contacts", constants.contacts());
		lMap.put("copyright", constants.copyright());
		
		for (Entry<String, String> lEntry : lMap.entrySet()) {
			String lKey = lEntry.getKey();
			String lValue = lEntry.getValue();
			Element lElement = DOM.getElementById(lKey);
			if (lElement != null) {
				lElement.setInnerText(lValue);
			} else {
				sendText("null: " + lKey);
			}
		}
		
		Map<String, String> lLinkMap = new HashMap<String, String>();
		lLinkMap.put("hilbertLink", constants.hilbertLink());
		lLinkMap.put("cosineLink", constants.cosineLink());
		lLinkMap.put("fiboLink", constants.fiboLink());
		for (Entry<String, String> lEntry : lLinkMap.entrySet()) {
			String lKey = lEntry.getKey();
			String lValue = lEntry.getValue();
			Element lElement = DOM.getElementById(lKey);
			if (lElement != null) {
				lElement.setAttribute("href", lValue);
				lElement.setAttribute("target", "_blank");
			} else {
				sendText("null link: " + lKey);
			}
		}
		
		if (iLocale != null &&
				iLocale.equals("fr")) {
			Element lElement = DOM.getElementById("slider");
			if (lElement != null) {
				lElement.addClassName("lang-fr");
			} else {
				sendText("null class: slider");
			}
		}
	}

}
