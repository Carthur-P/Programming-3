package prandomnumbers;

import java.util.Random;

public class RandomNumbers {
	
	private int RANDOM = 101;
	private int[] numArray;
	
	public RandomNumbers(int arraySize)
	{
		numArray = new int[arraySize];
	}
	
	public void fillArray(Random rand)
	{
		for(int i = 0; i < numArray.length; i++)
		{
			numArray[i] = rand.nextInt(RANDOM);
		}
	}
	
	@Override
	public String toString()
	{
		StringBuilder message = new StringBuilder();
		for(int number:numArray)
		{
			message.append(Integer.toString(number) + " ");
		}
		
		return message.toString();
	}

}
