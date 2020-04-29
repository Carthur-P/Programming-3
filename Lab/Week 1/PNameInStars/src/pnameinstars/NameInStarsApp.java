package pnameinstars;

import javax.swing.JOptionPane;

public class NameInStarsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userName = JOptionPane.showInputDialog("Enter your name");//this will pop up a dialog box for user's input
		NameInStars you = new NameInStars(userName); 
		JOptionPane.showMessageDialog(null, you.surroundNameInStar());
	}

}
