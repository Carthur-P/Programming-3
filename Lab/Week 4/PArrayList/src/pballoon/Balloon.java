package pballoon;

import java.util.Random;

public class Balloon {
	
	private int RANDOM = 11;
	private int colour;
	private String balloonColour;
	
	public Balloon(Random rand)
	{
		colour = rand.nextInt(RANDOM);
		colour();
	}
	
	private void colour()
	{
		switch (colour)
		{
			case 0:
			{
				balloonColour = "red";
				break;
			}
			
			case 1:
			{
				balloonColour = "blue";
				break;
			}
			
			case 2:
			{
				balloonColour = "green";
				break;
			}
			
			case 3:
			{
				balloonColour = "yellow";
				break;
			}
			
			case 4:
			{
				balloonColour = "orange";
				break;
			}
			
			case 5:
			{
				balloonColour = "purple";
				break;
			}
			
			case 6:
			{
				balloonColour = "black";
				break;
			}
			
			case 7:
			{
				balloonColour = "white";
				break;
			}
			
			case 8:
			{
				balloonColour = "grey";
				break;
			}
			
			case 9:
			{
				balloonColour = "lime green";
				break;
			}
			
			case 10:
			{
				balloonColour = "cyan";
				break;
			}
			
			default:
			{
				balloonColour = "invalid colour";
				break;
			}
		}
		
	}
	
	public String getColour()
	{
		return balloonColour;
	}
	
	public void setColour(Random rand)
	{
		colour = rand.nextInt(RANDOM);
	}

}
