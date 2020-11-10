package com.input_output;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class Output {

	public Output (TreeMap <String,Integer> tMapString){
		
	}
	
	public void doOutput(TreeMap <String,Integer> tMapString){
		try {
			
			// Print ( https://www.developpez.net/forums/d1109312/java/general-java/api-standards-tierces/collection-stream/compter-nombre-repetitions-valeurs-tableau/ )
			// Recover all the keys
			for (String value : tMapString.keySet()) {
				//Recover one key
				int nombre1 = tMapString.get(value);
				// Print
				System.out.println("[" + value + "] --> " + nombre1);
			}
			// End of print
			System.out.println("______________________________");
			
			
			FileWriter writer = new FileWriter ("./result.out");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
