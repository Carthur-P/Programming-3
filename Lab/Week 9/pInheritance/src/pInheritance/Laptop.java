package pInheritance;

public class Laptop extends Computer{
	
	//data fields
	private int screen;
	private double weight;
	private static final String DEFUALT_MAN = "HP"; 
	
	public Laptop(String manufacturer, String processor, int ramSize, int diskSize, int screen, double weight)
	{
		super(manufacturer, processor, ramSize, diskSize);
		this.screen = screen;
		this.weight = weight;
	}
	
	public Laptop(String processor, int ramSize, int diskSize, int screen, double weight)
	{
		this(DEFUALT_MAN, processor, ramSize, diskSize, screen, weight);
	}
	
	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "\nScreen Size: " + screen + "\nWeight: " + weight; 
	}
}
