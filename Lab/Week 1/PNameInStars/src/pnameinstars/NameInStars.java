package pnameinstars;

public class NameInStars {
	
	private String name;
	
	public NameInStars(String name)
	{
		this.name = name;
	}
	
	public String surroundNameInStar()//this will return the text with stars around it
	{
		return "****" + name + "****\n" +
				"****" + name + "****\n" +
				"****" + name + "****\n";
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}
