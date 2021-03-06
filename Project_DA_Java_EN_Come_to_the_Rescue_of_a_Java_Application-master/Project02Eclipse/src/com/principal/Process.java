package com.principal;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.treatment.Treatment;
import com.input_output.Input;
import com.input_output.Output;

public class Process {
	/**
	 * entry and memorization of getSymptoms.txt 
	 */
	private Input i;
	/**
	 * classification in alphabetical order and counting of each symptom
	 */
	private Treatment t;
	/**
	 * output management in result.out
	 */
	private Output o;
	
	Process() throws IOException{
		i = new Input();
	}
	void doProcess() throws FileNotFoundException{
		i.doInput();
		t = new Treatment(i.getInput());	
		t.doTreatment(i.getInput());
		o = new Output(t.getTraitment());
		o.doOutput(t.getTraitment());
	}
}
