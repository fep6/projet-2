package com.treatment;
import java.util.HashMap;

public class Classification{
	/**
	 * pointer values ascending
	 */
//	private int pointerSymptom;
	private int pointerLetter;	
	/**
	 * where the first leeter of the value of symptomsTxt is memorized
	 */
	private CodeLetters cL;
	
	
	Classification(){
		cL = new CodeLetters() ;
	}
	/**
	 * Comparative first letter between value n and n+1 and if equal, the following letters
	 * @param symptomsTxt
	 * Coming from Input
	 */
	void doClassification(HashMap<Integer, String> symptomsTxt) {


//  		Pointing each following couple <key,value> in the HashMap		
 		for (int pointerSymptom=1; pointerSymptom<symptomsTxt.size(); pointerSymptom++) {
			pointerLetter=1;
			// look for the unicode of the first (1) letter in the value of the Hashmap
			cL.searchCodeLetters(symptomsTxt,pointerLetter);
			
//			System.out.println("symptomsTxt.size() = "+ symptomsTxt.size());
			
			this.comparisonLetters (symptomsTxt , pointerSymptom , pointerLetter);

		}
	System.out.println("symptomsTxt(2)= " + symptomsTxt.values());
	}
	
	/**
	 * Compare values, by couple of letters between v and pointerSymptom+1 at the same rank (same pointerLetter)
	 * @param symptomsTxt
	 * @param pointerSymptom
	 * @param pointerLetter
	 */
	void comparisonLetters (HashMap <Integer, String> symptomsTxt , int pointerSymptom , int pointerLetter )	{
		
		System.out.println("______________________");
		System.out.println("Comparaison de lettre, pointerSymptom = " + pointerSymptom + " pointerLetter=" + pointerLetter);
		
		
		// Research of the minimum number of characters between the 2 values to compare
		int iterationMax = Math.min(symptomsTxt.get(pointerSymptom).length(),symptomsTxt.get(pointerSymptom+1).length());
		// System.out.println("iterationMax= "+ iterationMax );
		
		for (pointerLetter=1;pointerLetter<iterationMax;pointerLetter++) {
			cL.searchCodeLetters(symptomsTxt,pointerLetter);
			
			System.out.println("CodeL+0: " + cL.getCodeLetters().get(pointerLetter) + " CodeL+1: " + cL.getCodeLetters().get(pointerLetter+1));
			
			if (cL.getCodeLetters().get(pointerLetter+1)==cL.getCodeLetters().get(pointerLetter)) {
				continue;
			}
			else if (cL.getCodeLetters().get(pointerLetter+1)<cL.getCodeLetters().get(pointerLetter)) {				
				this.exchangeValues (symptomsTxt , pointerSymptom);
				break;
			} else if (cL.getCodeLetters().get(pointerLetter+1)>cL.getCodeLetters().get(pointerLetter)) {
				break;
			} 
				// => (cL1.getCodeLetters().get(pointerLetter)==cL1.getCodeLetters().get(pointerLetter+1))
		}
	}
	
	void exchangeValues (HashMap <Integer, String> symptomsTxt , int pointerSymptom ) {
		//exchange of value (via rotation with a buffer)
		String bufferString=symptomsTxt.get(pointerSymptom+1);
		symptomsTxt.replace(pointerSymptom+1,symptomsTxt.get(pointerSymptom));
		symptomsTxt.replace(pointerSymptom,bufferString);
	}
	
	HashMap<Integer, String> getClassification(){
		return null;
	}
}
