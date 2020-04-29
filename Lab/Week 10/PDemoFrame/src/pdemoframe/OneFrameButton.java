package pdemoframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class OneFrameButton extends JFrame implements ActionListener {
	JButton button = new JButton("Exit");
	
	//constructor
	public OneFrameButton()
	{
		super("Carthur's Frame With Exit Button");
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//make a panel
		JPanel panel = new JPanel();
		panel.add(button);
		setContentPane(panel);
		//alternative: getContentPane.add(panel);
		button.addActionListener(this);//it is asking for what class has implement the action listener
	}

	public void actionPerformed(ActionEvent event) {
		System.out.println(((JButton)event.getSource()).getText());
		System.exit(0);
	}
}
