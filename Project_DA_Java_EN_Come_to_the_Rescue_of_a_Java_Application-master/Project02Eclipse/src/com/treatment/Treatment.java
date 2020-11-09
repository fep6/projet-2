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
		// sort the ArrayList in ascending order
		symptomsTxt.sort(Comparator.naturalOrder());
		System.out.println("symptomsTxt= " + symptomsTxt);
		
		for (String a : symptomsTxt) {
				Integer nombre=tMapString.get(a);
			if (nombre==null) {
				nombre =0;
			}
			nombre++;
			tMapString.put(a,nombre);
			
		// Print https://www.developpez.net/forums/d1109312/java/general-java/api-standards-tierces/collection-stream/compter-nombre-repetitions-valeurs-tableau/
			for (String key : tMapString.keySet()) {
				Integer nombre1 = tMapString.get(key);
				System.out.println("[" + key + "] --> " + nombre1);
			}
			
			System.out.println("Fin de treatment");
		}
		
		
		
		
		
		
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
