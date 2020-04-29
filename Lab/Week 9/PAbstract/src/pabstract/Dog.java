package pabstract;

public class Dog extends Animal implements Domesticated {
	public Dog(String name, String type)
	{
		super(name, type);
	}

	public String speak() 
	{
		return "bark";
	}

	public String work() {
		return "Have worked for 2 hours";
	}

	public String reward() {
		return "Gain reward";
	}
	
	public double registration()
	{
		double fee = REGFEE + 20;
		return fee;
	}
}
