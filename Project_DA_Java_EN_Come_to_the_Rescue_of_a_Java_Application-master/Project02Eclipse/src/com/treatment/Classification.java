package com.treatment;

import java.util.HashMap;

public class Classification{
	/**
	 * where the first leeter of the value of symptomsTxt is memorized
	 */
	private HashMap <Integer, Integer> codeLetterValue;
	// private HashMap <Integer, Integer> codeLetterValue2;
	/**
	 * pointer values ascending
	 */
	private int PointerHashMap;
	Classification(){
		codeLetterValue = new HashMap<Integer,Integer>();
		// codeLetterValue2 = new HashMap<Integer,Integer>();
		
	}
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
			
			// Research of the minimum number of characters between the 2 values to compare
			int iterationMax = Math.min(symptomsTxt.get(PointerHashMap).length(),symptomsTxt.get(PointerHashMap+1).length());
			
			// Compare values, by couple of letters in the same rank 
			for (int pointerLetter=1;pointerLetter<=iterationMax;pointerLetter++) {
				
				// Construction of codeLetterValue where the letter in its following rank is memorized
				searchCodeLetters(symptomsTxt,PointerHashMap,pointerLetter);
				
				if (codeLetterValue.get(pointerLetter)<codeLetterValue.get(pointerLetter+1)){
					break;
				}
				// doClassification has to be memorized (instanciable) => n & n+1
				
				
				else if (codeLetterValue.get(pointerLetter)>codeLetterValue.get(pointerLetter+1)){
				// Exchange between symptomsTxt<key,Value> and symptomsTxt<key+1,Value> (rotation via buffer)
					String buffer = symptomsTxt.get(pointerLetter);
					symptomsTxt.put(pointerLetter,symptomsTxt.get(pointerLetter+1));
					symptomsTxt.put(pointerLetter+1,buffer);
				
					// Comparative descending 
					
					
					
					
					
				}
				//Equals to be treated when end of size of value (equals)
				else {
					
				}
			}
			PointerHashMap++;
		}
	}
	private void searchCodeLetters(HashMap<Integer, String> symptomsTxt, int pointerHashMap2, int pointerLetter) {
		// TODO Auto-generated method stub
		
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
//	void codeLetters(HashMap<Integer, String> symptomsTxt, int pointer , int pointerLetter) {
//		for (pointer=PointerHashMap; pointer <= symptomsTxt.size(); pointer++) {
//			// reserch Unicode of the char choosen (/rank) in the value of HashMap
//			int buffer= (int)((symptomsTxt.get(pointer).charAt(pointerLetter - 1)));
//			// Put the code in a new Hashcode to be compare
//			codeLetterValue.put(pointer, buffer);
//		}
//		System.out.println("CodeLetters value at the " + pointerLetter + " rank are: ");
//		System.out.println(codeLetterValue.values());
//		// System.out.println(codeLetterValue.keySet());
//		System.out.println("Nombre de caractères dans value de symptomsTxt à la valeur "+ PointerHashMap + " :");
//		System.out.println((symptomsTxt.get(PointerHashMap)).length());
//		System.out.println("Valeur minimale entre le nombre de caractères entre pointeur n et pointeur n+1:");
//		System.out.println(Math.min(symptomsTxt.get(PointerHashMap).length(),symptomsTxt.get(PointerHashMap+1).length()));
//	}
	
	HashMap<Integer, String> getClassification(){
		return null;
	}
}
