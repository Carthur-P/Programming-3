package pbox;

public class Box {
	private double height;
	private double width;
	private double length;
	
	//you can have multiple constructors, this is called constructor overloading
	public Box(double height, double width, double length)
	{
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
	public Box(double squareBase, double height)
	{
		this.height = height; 
		width = length = squareBase;
	}
	
	public Box(double size)
	{
		height = width = length = size;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public void setLength(double length)
	{
		this.length = length;
	}
	
	@Override
	public String toString()
	{
		return "Height = " + height + " Width = " + width + " Length = " + length;
	}
	
	
}
