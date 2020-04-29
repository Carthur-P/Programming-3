package pdogyear;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DogFrame extends JFrame implements ActionListener {
	
	private JButton convert;
	private JPanel panel;
	private JLabel dogYears;
	private JLabel humanYears;
	private JTextArea dogText;
	private JTextArea humanText;
	
	public DogFrame()
	{
		//Initializing all the fields
		convert = new JButton("Convert");
		panel = new JPanel();
		dogYears = new JLabel("Dog Years:");
		humanYears = new JLabel("Human Years:");
		dogText = new JTextArea(1,5);
		humanText = new JTextArea(1,5);
		
		//creating the content pane object
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		//setting up the frame
		setSize(400, 80);
		setVisible(true);
		setResizable(false);
		setTitle("Dog Year Converter");
		
		//make button have an event (click able)
		convert.addActionListener(this);
		
		//adding components to panel and container
		panel.add(convert);
		cp.add(dogYears);
		cp.add(dogText);
		cp.add(panel);
		cp.add(humanYears);
		cp.add(humanText);	
	}

	public void actionPerformed(ActionEvent e) {
		int num = Integer.parseInt(dogText.getText());
		num = num * 7;
		humanText.setText(Integer.toString(num));
	}
	
}
