package probot;

public class Robot {
	
	private String name;
	private String feul;
	
	public Robot(String name, String feul)
	{
		this.name = name;
		this.feul = feul;
	}//constructor
	
	//these are your get and set methods
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getFeul()
	{
		return feul;
	}
	
	public void setFeul(String feul)
	{
		this.feul = feul;
	}
}
