package shaffer_problem1;

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
			
			
			File inputFile = new File("problem1.txt");
			File outputFile = new File("unique_words.txt");
			
			
			
			DuplicateRemover duplicateRemover = new DuplicateRemover();

		      Scanner myReader = new Scanner(inputFile);
		      while (myReader.hasNextLine()) 
		      {
		        String dataFile = myReader.nextLine();
		    
		      
		        
		         duplicateRemover.remove(dataFile);
		         
		      }
		      
		      myReader.close();
		      System.out.println("the Input file has been read.");
		      
					if (outputFile.createNewFile()) 
					{
						System.out.println("File created: " + outputFile.getName());
					} 
						
					else 
					{
						System.out.println("File (unique_words.txt) already exists.");
						
						PrintWriter pw = new PrintWriter("unique_words.txt");
						pw.close();
						
						System.out.println("File (unique_words.txt) erased.");
					}
				
		      
		      duplicateRemover.write(outputFile);
		}
		
		catch (IOException e)
		{
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		
		
		
		
		
		
		
	
	}
	
}
