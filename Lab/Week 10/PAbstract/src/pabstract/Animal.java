package pabstract;

public abstract class Animal {
	protected String name;
	protected String type;
	
	public Animal(String name, String type)
	{
		this.name  = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString()
	{
		return "I am a " + type + ". My name is " + name + ".";
	}
	
	public abstract String speak(); 
}
