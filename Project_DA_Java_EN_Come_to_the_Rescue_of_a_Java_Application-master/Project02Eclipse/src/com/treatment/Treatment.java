package com.treatment;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class Treatment {

	// HashMap<Integer,String> treated;

    TreeMap<String,Integer> tMapString;
	
	public Treatment(){
		tMapString = new TreeMap<String,Integer>();
	}
	
	public void doTreatment(ArrayList<String> symptomsTxt ){
		symptomsTxt.sort(Comparator.naturalOrder());
		System.out.println("symptomsTxt= " + symptomsTxt);

		
		
		
		
		
		
//		for (String a : symptomsTxt) {
//			if (tMapString.containsKey(a)){
//				int i = tMapString.get(a);
//				tMapString.replace(a,i,i+1);
//			}
//		}
		
		
		
	}
	
	
	public HashMap<Integer, String> getTreatment (){
		return null;
	}
	
}
