package pabstract;

public class Dog extends Animal implements Domesticated {
	public Dog(String name, String type)
	{
		super(name, type);
	}

	public String speak() 
	{
		return ", bark.";
	}

	public String work() {
		return "sniffer dog";
	}

	public String reward() {
		return "cat threats";
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " This is how i speak " + speak() + " I work as a " + work() + " and my threat is " + reward() + ". My registration fee is $" + REGFEE;
	}
}
