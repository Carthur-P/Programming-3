package pstaticmethod;

import java.io.*;


public class AppArrayAndListUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader file;
		PrintWriter writer;
		String line = null;
		String[] words = new String[1291];
		int i = 0;
				
		try
		{
			file = new BufferedReader(new FileReader("threebears.txt"));
			while((line = file.readLine()) != null && i < words.length)
			{
				words[i] = line;
				i++;
			}
		}
		
		catch (IOException e)
		{
			e.getStackTrace();
			System.out.println("File could not be found");
		}
		
		ArrayAndListUtility.bubbleSortString(words);; 

		try 
		{
			writer = new PrintWriter(new FileWriter("output.txt"));
			for(String word:words)
			{
				writer.println(word);
			}
			writer.close();
		}
		
		catch (IOException e)
		{
			System.out.println("File could not be made");
			e.getStackTrace();
		} 
		
		System.out.println(ArrayAndListUtility.binarySearchString(words, "always"));
	}  
}
