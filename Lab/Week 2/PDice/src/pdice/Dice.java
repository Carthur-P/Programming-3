package pdice;

import java.util.Random;

public class Dice {
	private int max = 6;
	private int faceValue;
	private Random rand;
	
	public Dice(int faceValue)
	{
		this.faceValue = faceValue;
	}
	
	public int Roll()
	{
		rand = new Random();
		faceValue = rand.nextInt(max) + 1;
		return faceValue;
	}
	
	public void SetFaceValue(int faceValue)
	{
		this.faceValue = faceValue;
	}
	
	public int GetFaceValue()
	{
		return faceValue;
	}
	
	@Override
	public String toString()
	{
		return "dice roll was " + faceValue;
	}
}
