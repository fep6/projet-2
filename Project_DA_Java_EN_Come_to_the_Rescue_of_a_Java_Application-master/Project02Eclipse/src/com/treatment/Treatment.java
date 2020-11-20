package com.treatment;


import java.util.ArrayList;
import java.util.Comparator;
// import java.util.HashMap;
import java.util.TreeMap;

public class Treatment {


    private TreeMap<String,Integer> tMapString;

    
	public Treatment(){
		tMapString = new TreeMap<String,Integer>();
	}
	
	public void doTreatment(ArrayList<String> symptomsTxt ){
	
		
		// Integration of symptomTxt in a TreeMap, the sysptom is becoming a key, an ID)
		for (String key : symptomsTxt) {
			// value recovery from tMapString at he key
			Integer value = tMapString.get(key);
			// If an empty value (no count done yet)  is found, then let it intepreted by 0 (initilisation) => First time that symptom found in symptomsTxt
			if (value==null) {
				value =0;
			}
			// The value has to begin at 1, incrementing the count
			value++;
			// Writing in the value TreeMap (the count) at the good key (unic symptom)
			tMapString.put(key,value);
		}
	}
	
	public TreeMap<String, Integer> getTreatment() {
		return tMapString;
	}
	
	
}
