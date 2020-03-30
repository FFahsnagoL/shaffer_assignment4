package shaffer_problem1;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;





public class DuplicateRemover 
{


ArrayList<String> uniqueWords = new ArrayList<String>();
	
	public void remove(String dataFile)
	{
		 String gfg1 = dataFile.toLowerCase();
		
		String[] words;
		
		
		words = gfg1.split(" ");
		for (int i = 0; i < words.length; i++)
			
		{
			
		    if (!(uniqueWords.contains (words[i])))
		    {
		        uniqueWords.add(words[i]);
		    }
		}
		
		
		
	}
	
	public void write(File outputFile)
	{
		 try {
			 FileWriter writer = new FileWriter(outputFile); 
			 for(String str: uniqueWords) {
			   writer.write(str + System.lineSeparator());
			 }
			 writer.close();
			 System.out.println("the File has been successfully written to.");
			 
		    } 
		 catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
		
		
	}

	


