package com.treatment;

import java.util.HashMap;

public class Classification{
	/**
	 * where the first leeter of the value of symptomsTxt is memorized
	 */
	private HashMap <Integer, Integer> codeLetterValueSymptomsTxt = new HashMap<Integer,Integer>();
	
	
	
	
	Classification(HashMap<Integer, String> symptomsTxt){
		
	}
	
	void doClassification(HashMap<Integer, String> symptomsTxt) {
		int PointerOfHashMap =1;
		// look for the unicode of the first letter in the value of the Hashmap
		researchCodeLettersValueSymptomsTxt(symptomsTxt,2);
		// While the pointer is under the size of the HashMap
		while (PointerOfHashMap<=symptomsTxt.size()) {
			
			PointerOfHashMap++;
			if (PointerOfHashMap<PointerOfHashMap-1) {
				// Echange
				
				//Comparative descending
				for (int newPointerOfHashMap=PointerOfHashMap;newPointerOfHashMap<=0;newPointerOfHashMap--) {
					if (newPointerOfHashMap>newPointerOfHashMap-1) {
						newPointerOfHashMap=0;
					}
					// If the rank letters between   
					else if ((newPointerOfHashMap==newPointerOfHashMap-1)){
						
					}
					else {
					// Echange						
					}			
				}
			}
			
//			if (valeurs(pointer<pointer-1)) {
//			// Echange
//			for (int newPointer=pointer;newPointer<=0;newPointer--) {
//				if (// valeur de
//						newPointer>=newPointer-1) {
//					newPointer=0;
//				}
//				else if (( // value Hashmap in key: 
//						newPointer>newPointer-1)){
//					
//				}
//				else {
//				// Echange						
//				}
		}
	}
	/**
	 * retranscription in unicode of symptomsTxt in letter value in firstCodeLetterValueSymptomsTxt
	 * @param symptomsTxt
	 * source file
	 * @param rank
	 * rank of the letter targeted in the value of the hashMap
	 * (-1 because HashMap key begin at 1)
	 */
	void researchCodeLettersValueSymptomsTxt(HashMap<Integer, String> symptomsTxt, int rank) {
		for (int pointer=1; pointer <= symptomsTxt.size(); pointer++) {
			// reserch Unicode of the char choosen (/rank) in the value of HashMap
			Integer buffer= (int) ((symptomsTxt.get(pointer).charAt(rank - 1)));
			// Put the code in a new Hashcode to be compare
			codeLetterValueSymptomsTxt.put(pointer, buffer);
		}
		System.out.println("researchCodeLettersValueSymptomsTxt() at the " + rank + " rank is: " + codeLetterValueSymptomsTxt.values());
	}
	
	
	
	HashMap<Integer, String> getClassification(){
		return null;
	}
}
