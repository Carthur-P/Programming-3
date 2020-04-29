package pstaticmethod;

import java.util.ArrayList;

public class ArrayAndListUtility {
	
	public static int findMax(int[] array)
	{
		if (array == null)
		{
			throw new NullPointerException("Array is empty");
		}
		
		int max = array[0];
		for(int number:array)
		{
			if (max < number)
			{
				max = number;
			}
		}
		return max;
	}
	
	public static int findMax(ArrayList<Integer> array)
	{
		int max = array.get(0);
		for(int i = 0; i < array.size(); i++)
		{
			if (max < array.get(i))
			{
				max = array.get(i);
			}
		}
		return max;
	}
	
	public static int findMin(int[] array)
	{
		int min = array[0];
		for(int i = 0; i < array.length; i++)
		{
			if (min > array[i])
			{
				min = array[i];
			}
		}
		return min;
	}
	
	public static int findMin(ArrayList<Integer> array)
	{
		int min = array.get(0);
		for(int i = 0; i < array.size(); i++)
		{
			if (min > array.get(i))
			{
				min = array.get(i);
			}
		}
		return min;
	}
	
	public static String findIt(int[] array, int findNumber)
	{
		StringBuilder message = new StringBuilder();
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == findNumber)
			{
				message.append("number was found at position " + i + "\n");
			}
		}
		return message.toString();
	}
	
	public static String findIt(ArrayList<Integer> array, int findNumber)
	{
		StringBuilder message = new StringBuilder();
		for (int i = 0; i < array.size(); i++)
		{
			if (array.get(i) == findNumber)
			{
				message.append("number was found at position " + i + "\n");
			}
		}
		return message.toString();
	}
	
	public static void bubbleSortV1(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array.length - 1; j++)
			{
				if (array[j] > array[j + 1])
				{
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
	
	public static void bubbleSortV2(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array.length - (i + 1); j++)
			{
				if (array[j] > array[j + 1])
				{
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
	
	public static void bubbleSortV3(int[] array)
	{
		boolean sorted = false;
		do 
		{
			sorted = true;
			for (int j = 0; j < array.length - 1; j++)
			{
				if (array[j] > array[j + 1])
				{
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					sorted = false;
				}
			}
		}while (sorted == false);
	}
	
	public static void selectionSort(int[] array)
	{
		for (int i = 0; i < array.length - 1; i++)
		{
			int min = i;//selection sort is only finding the place of minimum not the number itself
			for (int j = i; j < array.length - 1; j++)
			{
				if (array[min] > array[j + 1])
				{
					min = j + 1;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
	}
	
	public static void bucketSort(int[] array)
	{
		int max =findMax(array);
		int[] bucket = new int[max + 1];
		
		for(int i = 0; i < array.length; i++)
		{
			bucket[array[i]]++;
		}
		
		for(int i = 0, j = 0; j < bucket.length; j++)
		{
			for (int b = 0; bucket[j] > 0 && b < bucket[j]; b++)
			{
				array[i] = j;
				i++;
			}
		}
	}	
}


