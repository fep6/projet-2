package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AnalyticsCounter {
	private static int headacheCount = 0;	// initialize to 0
	private static int rashCount = 0;		// initialize to 0
	private static int pupilCount = 0;		// initialize to 0
	
	public AnalyticsCounter() throws IOException  {
		// first get input
		BufferedReader reader = new BufferedReader (new FileReader("./symptoms.txt"));
		String line = reader.readLine();

		int lineNumberSymptomsTxt = 0;	// set i to 0 (lineNumber of symptoms.txt?)
		int headCount = 0;	// counts headaches
		while (line != null) {
			lineNumberSymptomsTxt++;	// increment i (lineNumber?)
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headCount++;
				System.out.println("number of headaches: " + headCount);
			}
			else if (line.equals("rash")) {
				rashCount++;
			}
			else if (line.contains("pupils")) {
				pupilCount++;
			}

			line = reader.readLine();	// get another symptom
		}
		
		// next generate output
		FileWriter writer = new FileWriter ("./result.out");
		writer.write("headache: " + headCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
	}
}
