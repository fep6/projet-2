package com.treatment;


import java.io.IOException;
import java.util.HashMap;

import com.input_output.Input;

public class Treatment {
	
	private Input i;
	HashMap<Integer, String> treated;
	
	public Treatment(){
		try {
			i=new Input();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doTreatment(){
		
	}
	
	public HashMap<Integer, String> getTreatment (){
		return treated;
	}
	
}
