package shaffer_problem2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicateCounter {
	
	HashMap<String, Integer> wordcounters =  new HashMap<String, Integer>();;
	
	int l;

	
	public void count(String dataFile)
	{
String gfg1 = dataFile.toLowerCase();
		
		String[] words;
		
		
		words = gfg1.split(" ");
		for (int i = 0; i < words.length; i++)
			
		{
			
			 
		    if (!(wordcounters.containsKey (words[i])))
		    {
		    	l=1;
		    	wordcounters.put(words[i], l);
		    }
		    else
		    {
		    	l++;
		    	wordcounters.put(words[i], l);
		    }
		}
		
	}
	
	public void write(File outputFile)
	{
		
		 BufferedWriter bf = null;;
	        
	        try{
	            
	            
	            bf = new BufferedWriter( new FileWriter(outputFile) );
	 
	            
	            for(Entry<String, Integer> entry : wordcounters.entrySet()){
	                
	                
	                bf.write( entry.getKey() + ":" + entry.getValue() );
	                
	                
	                bf.newLine();
	            }
	            
	            bf.flush();
	 
	        }catch(IOException e)
	        {
	            e.printStackTrace();
	        }
	        finally
	        {
	            
	            try
	            {
	                
	                bf.close();
	            }
	            catch(Exception e)
	            {
	            	System.out.println("An error occurred.");
	            }
	        }
	        
	        System.out.println("File written.");

	}
}


