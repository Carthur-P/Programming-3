package pmyfirst;

import java.util.*;

public class MyFirstApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("my first line");
		System.out.println(Math.PI);
		System.out.println(Math.E);
		//this will print out methods from the math class
		
		Random generator = new Random();
		int  dice = (generator.nextInt(6) + 1);
		System.out.println(dice);
	}

}
