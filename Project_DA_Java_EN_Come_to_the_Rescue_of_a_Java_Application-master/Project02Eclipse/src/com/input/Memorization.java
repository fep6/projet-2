package com.input;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Memorization {

	/**
	 * Nombre de lignes dans le fichier
	 */
	private int linesNumberSymptomsTxt;
	/** 
	 * N° de ligne dans le fichier (pointeur)
	 */
	private int lineSymptomsTxt=0;
	/**
	 * contenu de la ligne
	 */
	private String thisLine;
	private BufferedReader reader;
	private int lineNumberSymptomsTxt;
    private HashMap<Integer,String> symptomsTxt;
	
    public Memorization() throws IOException{
		symptomsTxt = new HashMap<Integer,String>();
		lineNumberSymptomsTxt =0;
		reader = new BufferedReader (new FileReader("./symptoms.txt"));
		thisLine = null;
    }
    
	public void doMemorization() throws FileNotFoundException{
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
	 * symptoms.txt memorized
	 * @return
	 */
	HashMap<Integer,String> getSymptomsTxt(){
		return symptomsTxt;
	}
	/**
	 * number of line of symptoms.txt
	 * @return
	 */
	int getLineNumberSymptomsTxt() {
		return lineNumberSymptomsTxt;
	}
}
	
