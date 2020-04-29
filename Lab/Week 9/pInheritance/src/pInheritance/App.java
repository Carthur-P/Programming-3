package pInheritance;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com = new Computer("HP", "Ryzen 5", 16, 500);
		Laptop lap = new Laptop("Intel core i5", 8, 500, 15, 2.2);
		
		System.out.println(com.toString());
	}

}
