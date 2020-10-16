package com.input_output;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Input {

	/** 
	 * N° de ligne dans le fichier (pointeur)
	 */
	private int lineSymptomsTxt;
	/**
	 * contenu de la ligne
	 */
	private String thisLine;
	private BufferedReader reader;
	private int lineNumberSymptomsTxt;
    private HashMap<Integer,String> symptomsTxt;
	
    public Input() throws IOException{
		symptomsTxt = new HashMap<Integer,String>();
		lineNumberSymptomsTxt =0;
		reader = new BufferedReader (new FileReader("./symptoms.txt"));
		thisLine = null;
    }
    
	public void doInput() throws FileNotFoundException{
		System.out.println("Début doMemorization");
	      try {
	            while ((thisLine = reader.readLine()) != null) {
	            lineNumberSymptomsTxt++;
	            symptomsTxt.put(lineSymptomsTxt , thisLine);
	            System.out.println(symptomsTxt.values()); 
	         }       
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
		System.out.println("Fin doMemorization");	
	}
	/**
	 * number of line of symptoms.txt
	 * @return
	 */
	public int getLineNumberSymptomsTxt() {
		return lineNumberSymptomsTxt;
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
	
