package com.edukera.website.client.data.tools;

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import com.edukera.website.client.EdukeraWebsite;
import com.edukera.website.client.data.parser.PropertiesLexer;
import com.edukera.website.client.data.parser.PropertiesParser;

public class DataTools {

	public static Map<String, String> getProperties(String iInput) {
		CharStream lCharStream = new ANTLRStringStream(iInput);
        PropertiesLexer lPropertiesLexer = new PropertiesLexer(lCharStream);
        CommonTokenStream lCommonTokenStream = new CommonTokenStream(lPropertiesLexer);
        PropertiesParser lPropertiesParser = new PropertiesParser(lCommonTokenStream);
        Map<String, String> lMap = new HashMap<String, String>();
        try {
        	lPropertiesParser.properties();
        	lMap.putAll(lPropertiesParser.mMap);
		} catch (RecognitionException e) {
			EdukeraWebsite.ginjector.getTools().sendText("parse properties e: " + e);
		}
        return lMap;
	}
}
