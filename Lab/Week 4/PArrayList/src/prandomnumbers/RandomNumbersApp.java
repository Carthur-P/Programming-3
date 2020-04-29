package prandomnumbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class RandomNumbersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		String arrayLength = JOptionPane.showInputDialog("Please enter the length of the array");
		RandomNumbers array = new RandomNumbers(Integer.parseInt(arrayLength));
		array.fillArray(rand);
		System.out.println(array.toString());
	}

}
