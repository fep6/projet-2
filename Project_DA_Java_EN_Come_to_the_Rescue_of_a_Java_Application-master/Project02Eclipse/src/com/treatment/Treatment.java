package com.treatment;

import java.util.HashMap;

public class Treatment {
	
	Classification cl;
	Count co;
	HashMap<Integer, String> result;
	
	public Treatment( HashMap<Integer, String> symptomsTxt) {
		cl= new Classification();
		co= new Count(symptomsTxt);
	}

	public void doTreatment( HashMap<Integer, String> symptomsTxt){
		cl.doClassification(symptomsTxt);
		co.doCount(symptomsTxt);
	}
	
	public HashMap<Integer, String> getTraitment(){
		return result;
	}
	
}
