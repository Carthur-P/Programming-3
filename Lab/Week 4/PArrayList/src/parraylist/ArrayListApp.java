package parraylist;

import java.util.ArrayList;

public class ArrayListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating an array list
		ArrayList<String> people;
		people = new ArrayList<String>();
		
		//initializing the array list
		people.add("Emma");
		people.add("Hamish");
		people.add("Matt");
		people.add("Kody");
		people.add("Rachel");
		
		//printing the list out
		System.out.println(people);
		
		//removing an item from the list
		people.remove("Emma");
		
		System.out.println(people);
		
		//printing all the items from the list on a separated lines
		for(String person:people)
		{
			System.out.println(person);
		}
		
		System.out.println(people.indexOf("Hamish"));
		System.out.println(people.get(3));
	}

}
