package pabstract;

public class App {

	public static void main(String[] args) {
		SeaLion duffy = new SeaLion("Duffy", "mammal");
		Dog benji = new Dog("Benji", "k9");
		
		System.out.println(duffy.toString());
		System.out.println(benji.toString());
		System.out.println(benji.work());
		System.out.println(benji.reward());
	}
}
