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
	private int pointerSymptom;
	private int pointerLetter;
	CodeLetters cL1;
	CodeLetters cL2;
	
	
	Classification(){
		codeLetterValue = new HashMap<Integer,Integer>();
		// codeLetterValue2 = new HashMap<Integer,Integer>();
		cL1 = new CodeLetters();
		// cL2 = new CodeLetters();
		pointerSymptom =1;
		pointerLetter=0;
	}
	/**
	 * Comparative first letter between value n and n+1 and if equal, the following letters
	 * @param symptomsTxt
	 * Coming from Input
	 */
	void doClassification(HashMap<Integer, String> symptomsTxt) {

		cL1.searchCodeLetters(symptomsTxt,pointerSymptom,pointerLetter);
		// cL2.searchCodeLetters(symptomsTxt,pointerSymptom+1,pointerLetter);
		System.out.println("symptomsTxt= " + symptomsTxt.values());
		System.out.println("cL1.getCodeLetters() = "+ cL1.getCodeLetters());
		
		
		// look for the unicode of the first (1) letter in the value of the Hashmap
		// codeLetters(symptomsTxt,PointerOfHashMap,1);
		
		// Pointing each following couple <key,value> in the HashMap
//		while (pointerSymptom<symptomsTxt.size()) {
//			//newPointerHashMap=2;
//			
//			System.out.println("symptomsTxt.size() = "+ symptomsTxt.size());
//			
//			// Research of the minimum number of characters between the 2 values to compare
//			int iterationMax = Math.min(symptomsTxt.get(pointerSymptom).length(),symptomsTxt.get(pointerSymptom+1).length());
//			
////			System.out.println("symptomsTxt.get(pointerHashMap+1).length())=" + symptomsTxt.get(pointerSymptom+1).length());	
////			System.out.println("iterationMax= "+ iterationMax );
//			
//			
//			// Compare values, by couple of letters in the same rank 
//			for (pointerLetter=1;pointerLetter<iterationMax;pointerLetter++) {
//				
//
//			pointerSymptom++;
//			}
//		}
	}
//	private void searchCodeLetters(HashMap<Integer, String> symptomsTxt, int pointerHashMap2, int pointerLetter) {
//		// TODO Auto-generated method stub
//		
//	}
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

//	}
	
	HashMap<Integer, String> getClassification(){
		return null;
	}
}
