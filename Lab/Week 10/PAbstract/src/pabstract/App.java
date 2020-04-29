package pabstract;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		SeaLion duffy = new SeaLion("Duffy", "sea lion");
		Dog benji = new Dog("Benji", "dog");
		
		ArrayList<Animal> list = new ArrayList<Animal>();
		list.add(duffy);
		list.add(benji);
		list.add(new Tarzier("Coco", "tarzier"));
		list.add(new Horse("Pony", "horse"));
		
		for(Animal a:list)
		{
			System.out.println(a.toString());//if you call the "a" variable in a system.out method, it will automatically use the toString method
		}
		
		for(Animal a:list)
		{
			if (a instanceof Domesticated)
			{
				System.out.println(a.getType() + ": " + ((Domesticated)a).work());
			}
			
			else
			{
				System.out.println(a.getType() + ": Animal is useless");
			}
		}
	}
}
