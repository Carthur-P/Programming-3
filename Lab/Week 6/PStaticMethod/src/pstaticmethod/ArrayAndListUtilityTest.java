package pstaticmethod;

import static org.junit.Assert.*;
import java.io.*;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayAndListUtilityTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindMaxIntArray() {
		ArrayAndListUtility function = new ArrayAndListUtility();
		int[] numbers = {10, 8, 2, 4, 11, 50, 8, 10};
		assertEquals(50, function.findMax(numbers)); 
		
	}

	@Test
	public void testFindMaxArrayListOfInteger() { 
		ArrayList<Integer> listNumbers = new ArrayList<Integer>();
		listNumbers.add(10);
		listNumbers.add(1);
		listNumbers.add(5);
		listNumbers.add(9);
		listNumbers.add(17);
		listNumbers.add(11);
		listNumbers.add(29);
		listNumbers.add(9);
		assertEquals(29, ArrayAndListUtility.findMax(listNumbers));
	}

	@Test
	public void testFindMinIntArray() {
		int[] numbers = {10, 8, 2, 4, 11, 50, 8, 10};
		assertEquals(2, ArrayAndListUtility.findMin(numbers));
	}

	@Test
	public void testFindMinArrayListOfInteger() {
		ArrayList<Integer> listNumbers = new ArrayList<Integer>();
		listNumbers.add(10);
		listNumbers.add(1);
		listNumbers.add(5);
		listNumbers.add(9);
		listNumbers.add(17);
		listNumbers.add(11);
		listNumbers.add(29);
		listNumbers.add(9);
		assertEquals(1, ArrayAndListUtility.findMin(listNumbers));
	}

	@Test
	public void testFindItIntArrayIntNum20() {
		int[] numbers = {5, 60, 70, 5, 52, 11, 12, 8, 19, 20};
		assertEquals("number was found at position 9\n", ArrayAndListUtility.findIt(numbers, 20));
	}
	
	@Test
	public void testFindItIntArrayIntNum5() {
		int[] numbers = {5, 60, 70, 5, 52, 11, 12, 8, 19, 20};
		assertEquals("number was found at position 0\n" + 
		"number was found at position 3\n", ArrayAndListUtility.findIt(numbers, 5));
	}
	
	@Test
	public void testFindItIntArrayIntNum100() {
		int[] numbers = {5, 60, 70, 5, 52, 11, 12, 8, 19, 20};
		assertEquals("", ArrayAndListUtility.findIt(numbers, 100));
	}

	@Test
	public void testFindItArrayListOfIntegerInt() {
		ArrayList<Integer> listNumbers = new ArrayList<Integer>();
		listNumbers.add(10);
		listNumbers.add(1);
		listNumbers.add(5);
		listNumbers.add(9);
		listNumbers.add(17);
		listNumbers.add(11);
		listNumbers.add(29);
		listNumbers.add(9);
		assertEquals("number was found at position 2\n", ArrayAndListUtility.findIt(listNumbers, 5));
	}
	
	@Test(expected = NullPointerException.class)
	public void shouldRaiseAnException() throws Exception
	{
	  int[] numbers = null;
	  ArrayAndListUtility.findMax(numbers);
	} 
	
	@Test
	public void testFileReadingIntoArray() 
	{
		BufferedReader file;
		String line;
		int[] numbers = new int[1000];
		int i = 0;
		
		try 
		{
			file = new BufferedReader(new FileReader("rand.txt"));
			while ((line = file.readLine()) != null && i < 1000)
			{
				numbers[i] = Integer.parseInt(line);
				i++;
			}
		}
		
		catch (IOException e)
		{
			System.out.println("File could not be found");
		}
		
		catch (NumberFormatException e)
		{
			System.out.println("Coverting string to integer error");
		}
		
		assertEquals(299, ArrayAndListUtility.findMax(numbers));
		assertEquals(1, ArrayAndListUtility.findMin(numbers));
		assertEquals("number was found at position 110\n" + 
					"number was found at position 517\n" + 
					"number was found at position 762\n", ArrayAndListUtility.findIt(numbers, 150));
	}
	
	@Test
	public void testBubbleSortV1() {
		int[] test = {5, 8, 2, 3, 1};
		int[] expected = {1, 2, 3, 5, 8};
		ArrayAndListUtility.bubbleSortV1(test);
		assertArrayEquals(expected, test);
	}

	@Test
	public void testBubbleSortV2() {
		int[] test = {5, 8, 2, 3, 1};
		int[] expected = {1, 2, 3, 5, 8};
		ArrayAndListUtility.bubbleSortV2(test);
		assertArrayEquals(expected, test);
	}

	@Test
	public void testBubbleSortV3() {
		int[] test = {5, 8, 2, 3, 1};
		int[] expected = {1, 2, 3, 5, 8};
		ArrayAndListUtility.bubbleSortV3(test);
		assertArrayEquals(expected, test);
	}

	@Test
	public void testSelectionSort() {
		int[] test = {5, 8, 2, 3, 1};
		int[] expected = {1, 2, 3, 5, 8};
		ArrayAndListUtility.selectionSort(test);
		assertArrayEquals(expected, test);
	}

	@Test
	public void testBucketSort() {
		int[] numbers = {4, 3, 5, 5, 7, 10, 10, 10, 2, 2};
		ArrayAndListUtility.bucketSort(numbers);
		StringBuilder message = new StringBuilder();
		for(int number:numbers)
		{
			message.append(number + " ");
		}	
		assertEquals("2 2 3 4 5 5 7 10 10 10 ", message.toString()); 
	}
	
	@Test 
	public void textBinarySearch1() {
		int[] numbers = {4, 3, 5, 5, 7, 10, 10, 10, 2, 2};
		assertEquals("3", ArrayAndListUtility.binarySearch(numbers, 4));
	}
	
	@Test 
	public void textBinarySearch2() {
		int[] numbers = {4, 3, 5, 5, 7, 10, 10, 10, 2, 2};
		assertEquals("search could not find the number", ArrayAndListUtility.binarySearch(numbers, 22));	
	}
	
	@Test
	public void textBinarySearch3() {
		int[] numbers = {4, 3, 5, 5, 7, 10, 10, 10, 2, 2};
		assertEquals("7", ArrayAndListUtility.binarySearch(numbers, 10));	
	}
	
	@Test
	public void testBinarySearchString() {
		BufferedReader file;
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
		
		assertEquals("word found at position 19", ArrayAndListUtility.binarySearchString(words, "a"));
	}
	
	@Test
	public void testBinarySearchStringNotFound() {
		BufferedReader file;
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
		
		assertEquals("search could not find the word", ArrayAndListUtility.binarySearchString(words, "volcano"));
	}
}
