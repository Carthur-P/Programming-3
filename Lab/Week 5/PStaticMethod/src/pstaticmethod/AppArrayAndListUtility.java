package pstaticmethod;

import java.io.*;

public class AppArrayAndListUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader file;
		PrintWriter writer;
		String line;
		int[] numbers = new int[10000];
		int i = 0;
		
		try
		{
			file = new BufferedReader(new FileReader("sort04.txt"));
			while ((line = file.readLine()) != null && i < 10000)
			{
				numbers[i] = Integer.parseInt(line);
				i++;
			}
		}
		
		catch (IOException e)
		{
			System.out.println("File could not be found");
		}
		
		ArrayAndListUtility.bucketSort(numbers); 
		
		try 
		{
			writer = new PrintWriter(new FileWriter("output.txt"));
			
			for(int number:numbers)
			{
				writer.println(number);
			}
		}
		
		catch (IOException e)
		{
			System.out.println("File could not be made");
			e.getStackTrace();
		}

		
	}
}
