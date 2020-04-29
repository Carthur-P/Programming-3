package pword;

import javax.swing.JOptionPane;

public class WordApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = new String[4];
		
		for (int i = 0; i < words.length; i++)//getting the input dialog to show 4 times
		{
			words[i] = JOptionPane.showInputDialog("Please enter your words (word " + (i + 1) + "): ");
		}
		
		Word message = new Word(words[0], words[1], words[2], words[3]);
		System.out.println("The message is: " + message.getMessage());
		message.reverseMessage();
		System.out.println("The message in reverse is: " + message.getMessage());
	}

}
