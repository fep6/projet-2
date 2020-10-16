package com.treatment;

import java.util.HashMap;

public class Classification{
	/**
	 * where the first leeter of the value of symptomsTxt is memorized
	 */
	private HashMap <Integer, Integer> codeLetterValueSymptomsTxt = new HashMap<Integer,Integer>();
	/**
	 * Comparative first letter between value n and n+1 and if equal, the following letters
	 * @param symptomsTxt
	 * Coming from Input
	 */
	void doClassification(HashMap<Integer, String> symptomsTxt) {
		int PointerOfHashMap =1;
		// look for the unicode of the first (1) letter in the value of the Hashmap
		codeLettersValueSymptomsTxt(symptomsTxt,1);
		// While the pointer is under the size of the HashMap
		while (PointerOfHashMap<=symptomsTxt.size()) {
			PointerOfHashMap++;
			for (int newPointerOfHashMap=PointerOfHashMap;newPointerOfHashMap<=0;newPointerOfHashMap--) {
				if (newPointerOfHashMap>newPointerOfHashMap-1) {
					break;
				}
				// At the same rank, if the same rank letters between values are the same, 
				// then compare other couple letters at the next same rank: 
				else if ((newPointerOfHashMap==newPointerOfHashMap-1)){
					int letterPointer = newPointerOfHashMap;
					// as long as all couple letters at the same rank are the same and not all of them are each compared for each
					// while ()
				}
				else {
				// Exchange
				// Comparative descending  
				}			
			}
		}
	}
	/**
	 * retranscription in unicode of symptomsTxt in letter value in firstCodeLetterValueSymptomsTxt
	 * @param symptomsTxt
	 * source file
	 * @param rank
	 * rank of the letter targeted in the value of the hashMap<key,value>
	 * (-1 because HashMap key begin at 1)
	 */
	void codeLettersValueSymptomsTxt(HashMap<Integer, String> symptomsTxt, int rankLetter) {
		for (int pointer=1; pointer <= symptomsTxt.size(); pointer++) {
			// reserch Unicode of the char choosen (/rank) in the value of HashMap
			Integer buffer= (int)((symptomsTxt.get(pointer).charAt(rankLetter - 1)));
			// Put the code in a new Hashcode to be compare
			codeLetterValueSymptomsTxt.put(pointer, buffer);
		}
		System.out.println("researchCodeLettersValueSymptomsTxt() at the " + rankLetter + " rank is: ");
		System.out.println(codeLetterValueSymptomsTxt.values());
	}
	
	
	
	HashMap<Integer, String> getClassification(){
		return null;
	}
}
