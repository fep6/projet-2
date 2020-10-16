package com.input_output;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Output {

	public Output (HashMap<Integer, String> symptomsTxt){
		
	}
	
	public void doOutput(HashMap<Integer, String> symptomsTxt){
		try {
			FileWriter writer = new FileWriter ("./result.out");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
