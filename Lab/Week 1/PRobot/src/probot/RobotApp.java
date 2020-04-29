package probot;

import javax.swing.JOptionPane;

public class RobotApp {

	private static Robot machine1;
	private static Robot machine2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Making the robots");
		String tempName = JOptionPane.showInputDialog("Please enter the name of the robot");
		String tempFuel = JOptionPane.showInputDialog("Please enter the fuel type that the robot use to run");
		machine1 = new Robot(tempName, tempFuel);
		machine2 = new Robot("c3po", "solar");
		
		//printing the name and fuel type of the robot onto the screen
		System.out.println(machine1.getName() + " runs on " + machine1.getFeul());
		System.out.println(machine2.getName() + " runs on " + machine2.getFeul());
	}

}
