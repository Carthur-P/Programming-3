package pabstract;

public class Tarzier extends Animal {
	public Tarzier(String name, String type)
	{
		super(name, type);
	}

	public String speak() 
	{
		return ", beep.";
	}

	@Override
	public String toString()
	{
		return super.toString() + " This is how i speak " + speak();
	}
}
