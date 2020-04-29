package pfriend2;

import java.util.Arrays;

import pfriend2.Gender;
import pfriend2.Relationship;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend f1 = new Friend("Matt", "Jarvie", 1990, 11, 20, Gender.MALE, "Dunedin", "matt.jarvie@gmail.com", Relationship.COMPLICATED);
		Friend f2 = new Friend("Hamish", "Sheppard", 1996, 05, 18, Gender.MALE, "Dunedin", "H_J@gmail.com", Relationship.SINGLE);		
		Friend f3 = new Friend("Rachel", "Youngson", 1997, 02, 13, Gender.FEMALE, "Dunedin", "rachely_767@gmail.com", Relationship.MARRIED);		
		Friend f4 = new Friend("Carthur", "Youngson", 1996, 04, 19, Gender.MALE, "Dunedin", "carthur2263@gmail.com", Relationship.MARRIED);
		Friend f5 = new Friend("Matt", "Maynard");
		
		Friend[] friends = {f1,f2,f3,f4,f5};
		//Arrays.sort is a system sort which takes in an array and a comparator class
		//Arrays.sort(friends);
		Arrays.sort(friends, new CompareAge());
		
		for(Friend f:friends)
		{
			System.out.println(f.toString());
		}	
	}

}
