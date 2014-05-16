package com.edukera.website.client.resources;

public class GAnalyticsTools {

	public native static void start() /*-{

		 var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-39196841-3']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();
	}-*/;

	public static void clickButton() {
		trackEvent("email", "email_input", "clickButton");
	}

	public static void validEmail() {
		trackEvent("email", "email_input", "valid");
	}

	public static void malformedEmail() {
		trackEvent("email", "email_input", "malformed");
	}

	public static void duplicatedEmail() {
		trackEvent("email", "email_store", "duplicated");
	}

	public static void registeredValidEmail() {
		trackEvent("email", "email_store", "registered");
	}

	public static void errorEmail() {
		trackEvent("email", "email_store", "error");
	}

	public static native void trackEvent(String category, String action, String label) /*-{
    $wnd._gaq.push(['_trackEvent', category, action, label]);
}-*/;

	public static native void trackEvent(String category, String action, String label, int intArg) /*-{
    $wnd._gaq.push(['_trackEvent', category, action, label, intArg]);
}-*/;

	public static native void trackPageview(String url) /*-{
    $wnd._gaq.push(['_trackPageview', url]);
}-*/;
}
