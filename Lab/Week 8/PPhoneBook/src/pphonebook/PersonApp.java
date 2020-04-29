package pphonebook;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> people = new ArrayList<>();
		BufferedReader file;
		String line;
		
		try
		{
			file = new BufferedReader(new FileReader("Phone.csv"));
			while ((line = file.readLine()) != null)
			{
				String[] field = line.split(",");//putting each part of the split string into an array
				String firstname = field[1];
				String lastname = field[0];
				String room = field[2];
				String title = field[3];
				String phone = field[4];			
				people.add(new Person(firstname, lastname, room , title, phone));
			}		
		}
		
		catch (IOException e)
		{
			e.getStackTrace();
			System.out.println("File could not be found");
		}
		
		Collections.sort(people);
		
		for(Person p:people)
		{
			System.out.println(p);
		}
	}

}
