package com.input_output;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Input {
 
	private BufferedReader reader;
    private HashMap<Integer,String> symptomsTxt;
	
    public Input() throws IOException{
		symptomsTxt = new HashMap<Integer,String>();
		reader = new BufferedReader (new FileReader("./symptoms.txt"));
    }
    
	public void doInput() throws FileNotFoundException{
		System.out.println("Début doMemorization");
	      try {
	    	  	int keyNumberSymptomsTxt =0;
	    	  	String thisLine;
	            while ((thisLine = reader.readLine()) != null) {
	            	keyNumberSymptomsTxt++;
	            symptomsTxt.put(keyNumberSymptomsTxt , thisLine);
	         }       
	      } catch(Exception e) {
	         e.printStackTrace();
	      }

        System.out.println(symptomsTxt.keySet());
        System.out.println("symptomsTxt()= " + symptomsTxt.values());  
		System.out.println("Fin doMemorization");	
	}
	/**
	 * symptoms.txt memorized
	 * @return
	 */
	public HashMap<Integer, String> getInput() {
		return symptomsTxt;
	}
}
	
