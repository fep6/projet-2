package com.output;

import java.io.FileWriter;
import java.io.IOException;

public class Display {

	void doDisplay(){
		try {
			FileWriter writer = new FileWriter ("./result.out");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
