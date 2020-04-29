package pabstract;

public class SeaLion extends Animal {
	public SeaLion(String name, String type)
	{
		super(name, type);
	}

	public String speak() 
	{
		return ", ow ow ow.";
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " This is how i speak " + speak();
	}
}