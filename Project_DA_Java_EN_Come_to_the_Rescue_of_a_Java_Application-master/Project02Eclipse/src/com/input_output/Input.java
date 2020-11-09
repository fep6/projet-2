package com.input_output;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Input {
 
	private BufferedReader reader;
    private ArrayList<String> symptomsTxt;
	
    public Input() throws IOException{
		symptomsTxt = new ArrayList <String>();
		reader = new BufferedReader (new FileReader("./symptoms.txt"));
    }
    
	public void doInput() throws FileNotFoundException{
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
	
