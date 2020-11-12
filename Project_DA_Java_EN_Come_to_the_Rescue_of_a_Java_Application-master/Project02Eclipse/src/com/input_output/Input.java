package com.input_output;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Input {
 
	private BufferedReader reader;
    private ArrayList<String> symptomsTxt;
	
    public Input() throws java.io.FileNotFoundException {
		symptomsTxt = new ArrayList <String>();
		reader = new BufferedReader (new FileReader("./symptoms.txt"));
    }
    
	public void doInput() {
	      try {
	    	  	String thisLine;
	            while ((thisLine = reader.readLine()) != null) {
	            	symptomsTxt.add(thisLine);
	            }       
	      } catch(Exception e) {
	         e.printStackTrace();
	      }

        System.out.println("symptomsTxt()= " + symptomsTxt);  
		System.out.println("______________________________");	
	}
	/**
	 * symptoms.txt memorized
	 * @return
	 */
	public ArrayList<String> getInput() {
		return symptomsTxt;
	}
}
	
