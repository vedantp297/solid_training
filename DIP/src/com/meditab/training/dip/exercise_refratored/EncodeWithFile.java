package com.meditab.training.dip.exercise_refratored;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Base64;

public class EncodeWithFile implements read,write
{
	
	String aLine;
	@Override
	public void writetofile() {
		
		try {
			BufferedWriter writer = null;
			writer = new BufferedWriter(new FileWriter("DIP/src/com/meditab/training/dip/exercise/afterEncryption.txt"));
		}
		
		catch(Exception e)
		{
			
		}
	}

	@Override
	public void readfromfile(){		
		try {
			BufferedReader reader = null;
			reader = new BufferedReader(new FileReader("DIP/src/com/meditab/training/dip/exercise/beforeEncryption.txt"));
		} 
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}	
	}

	
	
	 while ((aLine = reader.readLine()) != null) 
     {
         String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
         writer.append(encodedLine);
     }
 } 
 
 finally {
     if (writer != null) {
         writer.close();
     }
     if (reader != null) {
         reader.close();
     }
 }
}
