package com.principal;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.HashMap;
import com.input.Input;

public class Process {
	private Input m;
	private HashMap <Integer,String> getLineNumberSymptomsTxt;
	
	Process() throws IOException{
		m = new Input();
	}
	
	void doProcess() throws FileNotFoundException{
		m.doMemorization();
	}
	
}
