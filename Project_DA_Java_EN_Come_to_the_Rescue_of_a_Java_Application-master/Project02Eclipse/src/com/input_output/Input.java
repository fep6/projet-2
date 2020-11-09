package com.input_output;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Input {
 
	private BufferedReader reader;
    private ArrayList symptomsTxt;
	
    public Input() throws IOException{
		symptomsTxt = new ArrayList <String>();
		reader = new BufferedReader (new FileReader("./symptoms.txt"));
    }
    
	public void doInput() throws FileNotFoundException{
		System.out.println("Début doMemorization");
	      try {
	    	  	int keyNumberSymptomsTxt =0;
	    	  	String thisLine;
	            while ((thisLine = reader.readLine()) != null) {
	            	keyNumberSymptomsTxt++;
	            symptomsTxt.add(thisLine);
	         }       
	      } catch(Exception e) {
	         e.printStackTrace();
	      }

        System.out.println(symptomsTxt);
        System.out.println("symptomsTxt()= " + symptomsTxt);  
		System.out.println("Fin doMemorization");	
	}
	/**
	 * symptoms.txt memorized
	 * @return
	 */
	public ArrayList<String> getInput() {
		return symptomsTxt;
	}
}
	
