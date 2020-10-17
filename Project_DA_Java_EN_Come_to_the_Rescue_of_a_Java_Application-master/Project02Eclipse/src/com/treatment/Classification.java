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
	private int PointerOfHashMap;
	/**
	 *  pointer values descending
	 */
	private int newPointerOfHashMap;
	/**
	 * pointer of the letter
	 */
	private int letterPointer;
	/**
	 * Comparative first letter between value n and n+1 and if equal, the following letters
	 * @param symptomsTxt
	 * Coming from Input
	 */
	void doClassification(HashMap<Integer, String> symptomsTxt) {
		PointerOfHashMap =1;
		// look for the unicode of the first (1) letter in the value of the Hashmap
		codeLetters(symptomsTxt,PointerOfHashMap,1);
		// While the pointer is under the size of the HashMap
		while (PointerOfHashMap<=symptomsTxt.size()) {
			for (newPointerOfHashMap=PointerOfHashMap;newPointerOfHashMap>=0;newPointerOfHashMap--) {
				if (newPointerOfHashMap>newPointerOfHashMap-1) {
					break;
				}
				// At the same rank, if the same rank letters between values are the same, 
				// then compare other couple letters at the next same rank: 
				else if ((newPointerOfHashMap==newPointerOfHashMap-1)){
					letterPointer = newPointerOfHashMap;
					// as long as all couple letters at the same rank are the same and not all of them are each compared for each
					// while ()
				}
				else {
				// Exchange
				// Comparative descending  
				}
				PointerOfHashMap++;			
			}
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
	void codeLetters(HashMap<Integer, String> symptomsTxt, int pointer , int rankLetter) {
		for (pointer=PointerOfHashMap; pointer <= symptomsTxt.size(); pointer++) {
			// reserch Unicode of the char choosen (/rank) in the value of HashMap
			int buffer= (int)((symptomsTxt.get(pointer).charAt(rankLetter - 1)));
			// Put the code in a new Hashcode to be compare
			codeLetterValueSymptomsTxt.put(pointer, buffer);
		}
		System.out.println("CodeLetters value at the " + rankLetter + " rank are: ");
		System.out.println(codeLetterValueSymptomsTxt.values());
		// System.out.println(codeLetterValueSymptomsTxt.keySet());
		System.out.println("Nombre de caractères dans value de symptomsTxt à la valeur "+ PointerOfHashMap + " :");
		System.out.println((symptomsTxt.get(PointerOfHashMap)).length());
		System.out.println("Valeur minimale entre le nombre de caractères entre pointeur n et pointeur n+1:");
		System.out.println(Math.min(symptomsTxt.get(PointerOfHashMap).length(),symptomsTxt.get(PointerOfHashMap+1).length()));
	}
	
	HashMap<Integer, String> getClassification(){
		return null;
	}
}
