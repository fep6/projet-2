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
	private String line;
	private BufferedReader reader;
	private int lineNumberSymptomsTxt =0;
    private HashMap<Integer,String> symptomsTxt;
	
    public Memorization() throws IOException{
		symptomsTxt = new HashMap<Integer,String>();
		// first get input
//		BufferedReader reader = new BufferedReader (new FileReader("./symptoms.txt"));
//		line = reader.readLine();
//		System.out.println("line= " + line);
		// first get input
//		try {
//			reader = new BufferedReader (new FileReader("./symptoms.txt"));
//		} catch (FileNotFoundException e1) {
//			e1.printStackTrace(); 
//		}
//		try {
//			line = reader.readLine();
//			System.out.println("line= " + line);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
    }
    
	public void doMemorization() throws FileNotFoundException{
		System.out.println("Début doMemorization");
		String thisLine = null;
		BufferedReader reader = new BufferedReader (new FileReader("./symptoms.txt"));
	      try {
	            while ((thisLine = reader.readLine()) != null) {
	            lineNumberSymptomsTxt++;
	            symptomsTxt.put(lineSymptomsTxt , thisLine);
	            System.out.println(symptomsTxt.values()); 
	         }       
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
		
		
		
		
		
		
//		while (line != null) {
//			lineNumberSymptomsTxt++;
//			
//		}
		
		
		
		
		
		
//			for (Map.Entry<Integer,String> e3 : symptomsTxt.entrySet()) {
//				lineSymptomsTxt++;
//				symptomsTxt.put(lineSymptomsTxt , e3.getValue());
//				System.out.println(e3.getKey() + " " + e3.getValue());
//		}
		System.out.println("Fin doMemorization");	
	}
}
	
