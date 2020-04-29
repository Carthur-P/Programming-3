package pballoon;

import java.util.ArrayList;
import java.util.Random;

public class BalloonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		ArrayList<Balloon> balloons = new ArrayList<Balloon>();
		
		for (int i = 0; i < 10; i++)
		{
			balloons.add(new Balloon(rand));
		}
		
		for(Balloon balloon: balloons)
		{
			System.out.println(balloon.getColour());
		}
	}
}
