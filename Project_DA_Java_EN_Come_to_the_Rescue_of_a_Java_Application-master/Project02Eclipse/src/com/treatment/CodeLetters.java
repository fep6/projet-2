package com.treatment;

import java.util.HashMap;

public class CodeLetters {
	private int PointerHashMap;
	private HashMap <Integer, Integer> codeLetterValueSymptomsTxt = new HashMap<Integer,Integer>();

	void searchCodeLetters(HashMap<Integer, String> symptomsTxt, int pointerHashMap , int pointerLetter) {
		for (pointerHashMap=PointerHashMap; pointerHashMap <= symptomsTxt.size(); pointerHashMap++) {
			// reserch Unicode of the char choosen (/rank) in the value of HashMap
			int buffer= (int)((symptomsTxt.get(pointerHashMap).charAt(pointerLetter - 1)));
			// Put the code in a new Hashcode to be compare
			codeLetterValueSymptomsTxt.put(pointerHashMap, buffer);
		}
	}
	
	HashMap<Integer, Integer> getCodeLetters(){
		return codeLetterValueSymptomsTxt;
	}
	
}