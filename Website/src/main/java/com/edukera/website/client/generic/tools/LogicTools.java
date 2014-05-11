package com.edukera.website.client.generic.tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class LogicTools {

	public static void checkIsNotNull(Object iObject, String iMessage) {
		if (iObject == null) {
			throw new RuntimeException(iMessage + " is null.");
		}
	}

	public static void checkMinSizeOfList(List<?> iList, int iMinSize, String iMessage) {
		if (iList != null) {
			int lSize = iList.size();
			if (lSize < iMinSize){
				throw new RuntimeException(iMessage + " is contains " + lSize + " object(s) instead of" + iMinSize);
			}
		}
	}

	public static <T> boolean itemEquals(T iObject1, T iObject2) {
		if (iObject1 != null && 
				iObject2 != null) {
			return iObject1.equals(iObject2);
		}
		return iObject1 == null && iObject2== null;
	}

	public static void parseArgText(String iData,
			ASyncCall<String> iCharASyncCall,
			ASyncCall<String> iArgASyncCall) {
		if (iData != null) {
			for (int i = 0; i < iData.length(); ++i) {
				char lChar = iData.charAt(i);
				if (lChar == '{') {
					String lArg = "";
					for (++i; i < iData.length(); ++i) {
						char lNewChar = iData.charAt(i);
						if (lNewChar == '}') {
							break;
						} else {
							lArg += String.valueOf(lNewChar);
						}
					}
					if (iArgASyncCall != null) {
						iArgASyncCall.onSuccess(lArg);
					}
				} else {
					String lContent = String.valueOf(lChar);
					if (iCharASyncCall != null) {
						iCharASyncCall.onSuccess(lContent);
					}
				}
			}
		}
	}

	public static Integer parseInt(String iString) {
		try {
			return Integer.parseInt(iString);
		} catch (Exception e) {

		}
		return null;
	}

	public static <T> List<T> toList(T[] iObjects) {
		List<T> lObjects = new ArrayList<T>();
		if (iObjects != null) {
			for (T lT : iObjects) {
				lObjects.add(lT);
			}			
		}
		return lObjects;
	}

	public static <T> Map<T, Set<T>> createReverseMap(
			Map<T, Set<T>> iMap) {
		Map<T, Set<T>> lMap = new HashMap<T, Set<T>>();
		for (Entry<T, Set<T>> lEntry : iMap.entrySet()) {
			T lValue = lEntry.getKey();
			for (T lKey : lEntry.getValue()) {
				if (!lMap.containsKey(lKey)) {
					lMap.put(lKey, new HashSet<T>());
				}
				lMap.get(lKey).add(lValue);
			}
		}
		return lMap;
	}
}
