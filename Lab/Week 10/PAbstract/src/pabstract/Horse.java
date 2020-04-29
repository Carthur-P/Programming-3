package pabstract;

public class Horse extends Animal implements Domesticated {
	public Horse(String name, String type)
	{
		super(name, type);
	}

	public String speak() 
	{
		return ", ne ne.";
	}

	public String work() {
		return "show horse";
	}

	public String reward() {
		return "carrots";
	}
	
	@Override
	public String toString()
	{
		return super.toString( )+ " This is how i speak " + speak() + " I work as a " + work() + " and my threat is " + reward() + ". My registration fee is $" + REGFEE;
	}
}
