package com.treatment;

import java.util.HashMap;

public class Classification{
	/**
	 * where the first leeter of the value of symptomsTxt is memorized
	 */
	private HashMap <Integer, Integer> codeLetterValueSymptomsTxt = new HashMap<Integer,Integer>();
	/**
	 * pointer values ascending
	 */
	private int PointerHashMap;
	/**
	 *  pointer values descending
	 */
	private int newPointerHashMap;
	/**
	 * pointer of the letter
	 */
	// private int letterPointer;
	/**
	 * Comparative first letter between value n and n+1 and if equal, the following letters
	 * @param symptomsTxt
	 * Coming from Input
	 */
	void doClassification(HashMap<Integer, String> symptomsTxt) {
		PointerHashMap =1;
		
		// look for the unicode of the first (1) letter in the value of the Hashmap
		// codeLetters(symptomsTxt,PointerOfHashMap,1);
		
		// Pointing each following couple <key,value> in the HashMap
		while (PointerHashMap<symptomsTxt.size()) {
			//newPointerHashMap=2;
			
			// Research of the minimum number of character between the 2 values to compare
			int iterationMax = Math.min(symptomsTxt.get(PointerHashMap).length(),symptomsTxt.get(PointerHashMap+1).length());
			
			// Compare values, by couple of letters in the same rank 
			for (int pointerLetter=1;pointerLetter<=iterationMax;pointerLetter++) {
				
				// Construction of codeLetterValueSymptomsTxt where the letter in its following rank is memorized
				codeLetters(symptomsTxt,PointerHashMap,pointerLetter);
				
				if (codeLetterValueSymptomsTxt.get(pointerLetter)<codeLetterValueSymptomsTxt.get(pointerLetter+1)){
					break;
				}
				//Equals to be treated when end of size of value
				else {
				// Exchange
					String buffer;
					buffer = symptomsTxt.get(pointerLetter);
					symptomsTxt.put(pointerLetter,symptomsTxt.get(pointerLetter+1));
					symptomsTxt.put(pointerLetter+1,buffer);
				// Comparative descending  
				}			
			}
			PointerHashMap++;
		}
	}
	/**
	 * retranscription in unicode of symptomsTxt in letter value in CodeLetterValueSymptomsTxt
	 * @param symptomsTxt
	 * source file
	 * @param pointer
	 * pointer of the value of HashMap
	 * @param rankLetter
	 * rank of the letter targeted in the value of the hashMap<key,value>
	 * (-1 because HashMap key begin at 1)
	 */
	void codeLetters(HashMap<Integer, String> symptomsTxt, int pointer , int pointerLetter) {
		for (pointer=PointerHashMap; pointer <= symptomsTxt.size(); pointer++) {
			// reserch Unicode of the char choosen (/rank) in the value of HashMap
			int buffer= (int)((symptomsTxt.get(pointer).charAt(pointerLetter - 1)));
			// Put the code in a new Hashcode to be compare
			codeLetterValueSymptomsTxt.put(pointer, buffer);
		}
		System.out.println("CodeLetters value at the " + pointerLetter + " rank are: ");
		System.out.println(codeLetterValueSymptomsTxt.values());
		// System.out.println(codeLetterValueSymptomsTxt.keySet());
		System.out.println("Nombre de caractères dans value de symptomsTxt à la valeur "+ PointerHashMap + " :");
		System.out.println((symptomsTxt.get(PointerHashMap)).length());
		System.out.println("Valeur minimale entre le nombre de caractères entre pointeur n et pointeur n+1:");
		System.out.println(Math.min(symptomsTxt.get(PointerHashMap).length(),symptomsTxt.get(PointerHashMap+1).length()));
	}
	
	HashMap<Integer, String> getClassification(){
		return null;
	}
}
