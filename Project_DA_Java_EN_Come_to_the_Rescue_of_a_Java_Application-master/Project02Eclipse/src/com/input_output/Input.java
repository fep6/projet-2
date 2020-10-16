package com.input_output;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Input {

	/**
	 * contenu de la ligne
	 */
	private String thisLine;
	private BufferedReader reader;
    private HashMap<Integer,String> symptomsTxt;
	
    public Input() throws IOException{
		symptomsTxt = new HashMap<Integer,String>();
		reader = new BufferedReader (new FileReader("./symptoms.txt"));
		thisLine = null;
    }
    
	public void doInput() throws FileNotFoundException{
		System.out.println("Début doMemorization");
	      try {
	    	  	int lineNumberSymptomsTxt =0;
	            while ((thisLine = reader.readLine()) != null) {
	            lineNumberSymptomsTxt++;
	            symptomsTxt.put(lineNumberSymptomsTxt , thisLine);
	         }       
	      } catch(Exception e) {
	         e.printStackTrace();
	      }

        System.out.println(symptomsTxt.keySet()); 
		System.out.println("Fin doMemorization");	
	}
	/**
	 * symptoms.txt memorized
	 * @return
	 */
	public HashMap<Integer, String> getInput() {
		// TODO Auto-generated method stub
		return symptomsTxt;
	}
}
	
