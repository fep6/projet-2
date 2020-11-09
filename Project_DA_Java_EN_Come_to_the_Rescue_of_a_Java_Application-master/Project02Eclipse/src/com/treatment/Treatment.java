package com.treatment;


import java.util.ArrayList;
import java.util.Comparator;
// import java.util.HashMap;
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
		System.out.println("Fichier classé= " + symptomsTxt);  
		System.out.println("______________________________");
		
		for (String a : symptomsTxt) {
			Integer nombre=tMapString.get(a);
			if (nombre==null) {
				nombre =0;
			}
			nombre++;
			tMapString.put(a,nombre);
		}
		
		// Print ( https://www.developpez.net/forums/d1109312/java/general-java/api-standards-tierces/collection-stream/compter-nombre-repetitions-valeurs-tableau/ )
		for (String key : tMapString.keySet()) {
			int nombre1 = tMapString.get(key);
			System.out.println("[" + key + "] --> " + nombre1);
		}

		  
		System.out.println("______________________________");
		
	}
	
	public TreeMap<String, Integer> getTreatment() {
		return tMapString;
		
	}
	
	
}
