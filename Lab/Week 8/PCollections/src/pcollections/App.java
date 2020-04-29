package pcollections;

import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myCollections = new ArrayList<>();
		myCollections.add("I");
		myCollections.add("Came");
		myCollections.add("I");
		myCollections.add("Saw");
		myCollections.add("I");
		myCollections.add("Conquered");
		
		HashSet<String> myHashSet = new HashSet(myCollections);
		LinkedHashSet<String> linkedMyHashSet = new LinkedHashSet(myCollections);
		TreeSet<String> myTreeSet = new TreeSet(myCollections);
		System.out.println(myHashSet.toString());
		System.out.println(linkedMyHashSet.toString());
		System.out.println(myTreeSet.toString());
		
		ArrayList<String> myCollections2 = new ArrayList<>();
		myCollections.add("I");
		myCollections.add("Came");
		myCollections.add("I");
		myCollections.add("Saw");
		myCollections.add("I");
		myCollections.add("Ran");
		myCollections.add("Away");
		
		TreeSet<String> myTreeSet2 = new TreeSet(myCollections);
		System.out.println(myTreeSet2.toString());

		Map<String, Integer> vehicles = new TreeMap<>();
		vehicles.put("Dutsun", 2);
		vehicles.put("Holden", 3);
		vehicles.put("Toyota", 4);
		vehicles.put("Suzuki", 1);
		System.out.println(vehicles.toString() + "\n");

		System.out.println("List of all the vehicles");
		for(String model:vehicles.keySet())
		{
			System.out.println(model);
		}
	
		/*for(Integer num:vehicles.values())
		{
			System.out.println(num);
		}*/
		
		String temp;
		temp = JOptionPane.showInputDialog("Please enter the vehicle you want");
		if (vehicles.containsKey(temp))
		{
			System.out.println(vehicles.get(temp));
		}
		
		else
		{
			System.out.println("The vehicle that you are looking for cannot be found");
		}
		
		BufferedReader file;
		String line;
		ArrayList<String> words = new ArrayList<>();
		
		try
		{
			file = new BufferedReader(new FileReader("threebears.txt"));
			while ((line = file.readLine()) != null)
			{
				words.add(line);
			}
		}
		
		catch (IOException e)
		{
			e.getStackTrace();
			System.out.println("File could not be loaded");
		}
		
		Map<String, Integer> threeBearsWords = new TreeMap<>();
		for(String w:words)
		{
			if (threeBearsWords.get(w) == (null))//the .get method will return a null if the key does not exist in the map
			{
				threeBearsWords.put(w, 1);
			}
			
			else
			{
				threeBearsWords.put(w, threeBearsWords.get(w) + 1);
			}

		}
		System.out.println(threeBearsWords.toString());
		
		
	}

}
