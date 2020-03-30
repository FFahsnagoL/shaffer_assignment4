package shaffer_problem2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Application 
{

public static void main(String[] args) 
{
	try 
	{
		
		
		File inputFile = new File("problem2.txt");
		File outputFile = new File("unique_word_counts.txt");
		
		
		
	DuplicateCounter duplicateCounter = new DuplicateCounter();

	      Scanner myReader = new Scanner(inputFile);
	      while (myReader.hasNextLine()) 
	      {
	        String dataFile = myReader.nextLine();
	    
	      
	        
	         duplicateCounter.count(dataFile);
	        
	      }
	      myReader.close();
	      System.out.println("the Input file has been read.");
	      
				if (outputFile.createNewFile()) 
				{
					System.out.println("File created: " + outputFile.getName());
				} 
					
				else 
				{
					System.out.println("File (unique_word_counts.txt) already exists.");
					
					PrintWriter pw = new PrintWriter("unique_word_counts.txt");
					pw.close();
					
					System.out.println("File (unique_word_counts.txt) erased.");
				}
			
	      
	      duplicateCounter.write(outputFile); 
	}
	
	catch (IOException e)
	{
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	}
	
	
	
}
}
	
	
	




