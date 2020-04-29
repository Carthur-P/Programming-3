package pwindowbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

public class OneButton extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnExit = new JButton("Exit");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OneButton frame = new OneButton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OneButton() {
		//setting up the content pane
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//setting up the button
		btnExit.setBounds(170, 21, 93, 23);
		btnExit.addActionListener(this);
		
		//setting up the panel
		contentPane.setLayout(null);
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Test", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(88, 55, 255, 159);
		contentPane.add(panel);
		contentPane.add(btnExit);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnExit)
		{
			System.exit(0);
		}		
	}

}
