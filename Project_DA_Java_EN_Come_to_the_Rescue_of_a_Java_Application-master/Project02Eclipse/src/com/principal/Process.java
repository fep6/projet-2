package com.principal;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.input.Memorization;

public class Process {
	private Memorization m;
	
	Process() throws IOException{
		m = new Memorization();
	}
	
	void doProcess() throws FileNotFoundException{
		m.doMemorization();
	}
	
}
