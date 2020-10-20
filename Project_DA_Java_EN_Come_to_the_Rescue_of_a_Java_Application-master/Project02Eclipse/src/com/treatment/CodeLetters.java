package com.treatment;

import java.util.HashMap;

public class CodeLetters {
	int iterationFor;
	
	// private int PointerHashMap;
	HashMap <Integer, Integer> codeLetterValueSymptomsTxt;

	CodeLetters(){
		codeLetterValueSymptomsTxt = new HashMap<Integer,Integer>();
	}
	
	void searchCodeLetters(HashMap<Integer, String> symptomsTxt, int pointerSymptom, int pointerLetter) {

		System.out.println("===============");
		System.out.println("SEARCHCODELETTER");

		for (pointerSymptom=1; pointerSymptom < symptomsTxt.size(); pointerSymptom++) {
				
				// reserch Unicode of the char choosen (/rank) in the value of HashMap
				int bufferInt= (int)((symptomsTxt.get(pointerSymptom).charAt(pointerLetter)));
				char bufferChar = symptomsTxt.get(pointerSymptom).charAt(pointerLetter);
				codeLetterValueSymptomsTxt.put(pointerSymptom, bufferInt);
				System.out.println("_________________________");
				System.out.println("pointerSymptom= " + pointerSymptom);
				System.out.println("pointerLetter= " + pointerLetter);
				System.out.println("ValueSymptomsTxt=" + bufferChar);
				System.out.println("codeLetterValueSymptomsTxt= "+ bufferInt);

		}
		
	}
	
	HashMap<Integer, Integer> getCodeLetters(){
		return codeLetterValueSymptomsTxt;
	}
	
}