package com.treatment;


import java.util.HashMap;
import java.util.TreeSet;

public class Treatment {

	HashMap<Integer,String> treated;

    TreeSet<String> tsetString = new TreeSet();
	
	public Treatment(){

	}
	
	public void doTreatment(HashMap<Integer,String> symptomsTxt ){
		// System.out.println("input en Treatment: "+ ((Map<Integer, String>) i));
		tsetString .addAll( symptomsTxt.values());
		System.out.println("tsetString= "+ tsetString);
		
	}
	public HashMap<Integer, String> getTreatment (){
		return treated;
	}
	
}
