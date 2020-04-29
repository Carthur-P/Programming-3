package pflagquiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class QuizFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblFlag;
	private JComboBox comboBox;
	private JLabel lblSelect;
	private JTextField textField;
	private JButton btnNewButton;
	private Random rand;
	private String country = "Australia";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizFrame frame = new QuizFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public QuizFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 132);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblFlag = new JLabel("");
		lblFlag.setVerticalAlignment(SwingConstants.TOP);
		lblFlag.setToolTipText("");
		lblFlag.setBounds(25, 16, 134, 99);
		contentPane.add(lblFlag);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Australia", "Brazil", "China", "Italy", "Russia", "South Africa", "Spain", "United States"}));
		comboBox.addActionListener(this);
		comboBox.setBounds(149, 54, 118, 22);
		contentPane.add(comboBox);
		
		lblSelect = new JLabel("Select Country:");
		lblSelect.setBounds(154, 16, 100, 22);
		contentPane.add(lblSelect);
		
		textField = new JTextField();
		textField.setBounds(322, 55, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Next Flag");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(300, 16, 124, 23);
		contentPane.add(btnNewButton);
		
		rand = new Random();
		lblFlag.setIcon(new ImageIcon("Australia.png"));		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnNewButton)
		{
			int select = rand.nextInt(8);
			textField.setText(null);
			
			switch (select)
			{
				case 0:
				{
					country = "Australia";
					lblFlag.setIcon(new ImageIcon(country + ".png"));
					break;
				}
				
				case 1:
				{
					country = "Brazil";
					lblFlag.setIcon(new ImageIcon(country + ".png"));
					break;
				}
				
				case 2:
				{
					country = "China";
					lblFlag.setIcon(new ImageIcon(country + ".png"));
					break;
				}
				
				case 3:
				{
					country = "Italy";
					lblFlag.setIcon(new ImageIcon(country + ".png"));
					break;
				}
				
				case 4:
				{
					country = "Russia";
					lblFlag.setIcon(new ImageIcon(country + ".png"));
					break;
				}
				
				case 5:
				{
					country = "South Africa";
					lblFlag.setIcon(new ImageIcon(country + ".png"));
					break;
				}
				
				case 6:
				{
					country = "Spain";
					lblFlag.setIcon(new ImageIcon(country + ".png"));
					break;
				}
				
				case 7:
				{
					country = "United States";
					lblFlag.setIcon(new ImageIcon(country + ".png"));
					break;
				}		
			}
		}
		
		if (e.getSource() == comboBox)
		{
			if (((String)comboBox.getSelectedItem()).equals(country))
			{
				textField.setText("Correct");
			}
			 
			else 
			{
				textField.setText("Wrong");
			}
		}
	}
}
