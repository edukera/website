package com.edukera.website.client.generic.tools;

import java.util.List;

public class JSToJavaTools {

	public static String createArgs1(List<String> iArray) {
		return createArgs(iArray, '\1');
	}
	
	public static String createArgs2(List<String> iArray) {
		return createArgs(iArray, '\2');
	}
	
	private static String createArgs(List<String> iArray, char iSep) {
		StringBuilder lStringBuilder = new StringBuilder();
		
		for (int i = 0; i < iArray.size(); ++i) {
			String lVal = iArray.get(i);
			if (i > 0) {
				lStringBuilder.append(Character.valueOf(iSep));
			}
			lStringBuilder.append(lVal);
		}
		return lStringBuilder.toString();
	}

}
