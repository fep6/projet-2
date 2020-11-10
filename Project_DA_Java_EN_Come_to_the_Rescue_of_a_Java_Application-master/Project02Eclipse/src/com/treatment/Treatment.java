package com.treatment;


import java.util.ArrayList;
import java.util.Comparator;
// import java.util.HashMap;
import java.util.TreeMap;

public class Treatment {

	// HashMap<Integer,String> treated;

    private TreeMap<String,Integer> tMapString;

    
	public Treatment(){
		tMapString = new TreeMap<String,Integer>();
	}
	
	public void doTreatment(ArrayList<String> symptomsTxt ){
		// sort the ArrayList in ascending order
		symptomsTxt.sort(Comparator.naturalOrder());
		System.out.println("Fichier classé= " + symptomsTxt);  
		System.out.println("______________________________");
		
		
		// Integration of symptomTxt in a TreeMap
		for (String value : symptomsTxt) {
			// key recovery
			Integer key = tMapString.get(value);
			// If an empty key is found then let it intepreted by 0
			if (key==null) {
				key =0;
			}
			// The index has to begin at 1
			key++;
			// Writing in the value TreeMap at the good key
			tMapString.put(value,key);
		}
	}
	
	public TreeMap<String, Integer> getTreatment() {
		return tMapString;
	}
	
	
}
