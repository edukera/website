package com.edukera.website.client.resources;
/*
import org.helios.gwt.fonts.client.FontName;
import org.helios.gwt.fonts.client.FontResource;
*/
import org.helios.gwt.fonts.client.FontName;
import org.helios.gwt.fonts.client.FontResource;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;

public interface WebsiteResources extends ClientBundle {
	
	public static final WebsiteResources INSTANCE =  GWT.create(WebsiteResources.class);

	@Source("css/style.css")
	public StyleCssResource styleCss();
	
	@Source({"fonts/icons-edukera-webfont.eot",
		"fonts/icons-edukera-webfont.svg",
		"fonts/icons-edukera-webfont.ttf",
		"fonts/icons-edukera-webfont.woff"})
	@FontName("icons-edukera")
	public FontResource iconsEdukeraWebfont();
	
	@Source({"fonts/droidsans-webfont.eot",
		"fonts/droidsans-webfont.svg",
		"fonts/droidsans-webfont.ttf",
		"fonts/droidsans-webfont.woff"})
	@FontName("droidsans")
	public FontResource droidsansWebfont();
	
	@Source({"fonts/droidsans-bold-webfont.eot",
		"fonts/droidsans-bold-webfont.svg",
		"fonts/droidsans-bold-webfont.ttf",
		"fonts/droidsans-bold-webfont.woff"})
	@FontName("droidsans-bold")
	public FontResource droidsansBoldWebfont();
	
	@Source({"fonts/geometricslabserif-medium-italic-webfont-webfont.eot",
		"fonts/geometricslabserif-medium-italic-webfont-webfont.svg",
		"fonts/geometricslabserif-medium-italic-webfont-webfont.ttf",
		"fonts/geometricslabserif-medium-italic-webfont-webfont.woff"})
	@FontName("geoslb712_md_btmedium_italic")
	public FontResource geometricslabserifMediumItalicWebfontWebfont();
	
	@Source({"fonts/geometricslabserif-medium-webfont-webfont.eot",
		"fonts/geometricslabserif-medium-webfont-webfont.svg",
		"fonts/geometricslabserif-medium-webfont-webfont.ttf",
		"fonts/geometricslabserif-medium-webfont-webfont.woff"})
	@FontName("geoslb712_md_btmedium")
	public FontResource geometricslabserifMediumWebfontWebfont();
	
	@Source({"fonts/geometric_slabserif_703_bold_bt.eot",
		"fonts/geometric_slabserif_703_bold_bt.svg",
		"fonts/geometric_slabserif_703_bold_bt.ttf",
		"fonts/geometric_slabserif_703_bold_bt.woff"})
	@FontName("geoslab703_md_btbold")
	public FontResource geometricSlabserif703BoldBt();
	
	@Source({"fonts/23991A_0_0.eot",
		"fonts/23991A_0_0.ttf",
		"fonts/23991A_0_0.woff"})
	@FontName("logo")
	public FontResource logo();
	
}
