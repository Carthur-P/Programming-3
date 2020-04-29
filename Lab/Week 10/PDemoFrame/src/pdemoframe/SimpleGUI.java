package pdemoframe;

import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI extends JFrame implements ActionListener {
	private JButton yes;
	private JButton no;
	private JLabel label;
	private JPanel back;
	private JTextArea text;
	
	public SimpleGUI()
	{
		yes = new JButton("Yes");
		no = new JButton("No");
		label = new JLabel("Click Yes or No");
		back = new JPanel();
		text = new JTextArea(10, 5);
		
		Container cp = getContentPane();//creating an instance of the content pane so you can call it later
		cp.setLayout(new FlowLayout());//layout type, otherwise everything will be on top of each other 
		
		//make button have an event (click able)
		yes.addActionListener(this);
		no.addActionListener(this);
		
		//adding components to the panel and content pane
		back.add(no);
		back.add(yes);
		cp.add(text);
		cp.add(label);
		cp.add(back);
	}
	
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == yes)
		{
			text.append("Yes button was clicked\n");
		}
		
		if (event.getSource() == no)
		{
			text.append("No button was clicked\n");
		}
		//you can use the else sysntax aswell since there is only two buttons
	}
}
