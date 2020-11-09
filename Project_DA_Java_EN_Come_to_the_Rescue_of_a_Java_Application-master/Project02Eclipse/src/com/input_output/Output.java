package com.input_output;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeMap;

public class Output {

	public Output (TreeMap treeMap){
		
	}
	
	public void doOutput(TreeMap treeMap){
		try {
			FileWriter writer = new FileWriter ("./result.out");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
