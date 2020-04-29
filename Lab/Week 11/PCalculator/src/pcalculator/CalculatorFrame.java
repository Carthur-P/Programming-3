package pcalculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class CalculatorFrame extends JFrame implements ActionListener  {

	private JPanel mainPanel;
	private JPanel panel;
	private JLabel labelFirst;
	private JLabel labelSecond;
	private JLabel LabelResult;
	private JButton btnAdd;
	private JTextField textFieldFirst;
	private JTextField textFieldSecond;
	private JTextField textFieldResult;
	private JButton btnRandom;
	private JButton btnSubtract;
	private JButton btnMultiply;
	private JButton btnDivide;
	private JButton btnClear;
	private JButton btnExit;
	private Random rand;

	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorFrame frame = new CalculatorFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create the frame.
	public CalculatorFrame() {
		rand = new Random();
		
		//setting up the form
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 282, 360);
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPanel);
		mainPanel.setLayout(null);
		
		//setting up number addition panel
		panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Calculator", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 251, 301);
		mainPanel.add(panel);
		panel.setLayout(null);
		
		//setting up all the label
		labelFirst = new JLabel("First Number");
		labelFirst.setBounds(26, 37, 101, 14);
		panel.add(labelFirst);
		
		labelSecond = new JLabel("Second Number");
		labelSecond.setBounds(26, 70, 101, 14);
		panel.add(labelSecond);
		
		LabelResult = new JLabel("Result");
		LabelResult.setBounds(26, 101, 101, 14);
		panel.add(LabelResult);
		
		//setting up all the text field
		textFieldFirst = new JTextField();
		textFieldFirst.setBounds(137, 34, 97, 20);
		panel.add(textFieldFirst);
		textFieldFirst.setColumns(10);
		
		textFieldSecond = new JTextField();
		textFieldSecond.setBounds(137, 67, 97, 20);
		panel.add(textFieldSecond);
		textFieldSecond.setColumns(10);
		
		textFieldResult = new JTextField();
		textFieldResult.setBounds(137, 98, 97, 20);
		panel.add(textFieldResult);
		textFieldResult.setColumns(10);
		
		//setting up button
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(this);
		btnAdd.setBounds(25, 133, 89, 23);
		panel.add(btnAdd);
		
		btnRandom = new JButton("Random ");
		btnRandom.setBounds(145, 133, 89, 23);
		btnRandom.addActionListener(this);
		panel.add(btnRandom);
		
		btnSubtract = new JButton("Subtract");
		btnSubtract.addActionListener(this);
		btnSubtract.setBounds(25, 167, 89, 23);
		panel.add(btnSubtract);
		
		btnMultiply = new JButton("Multiply");
		btnMultiply.addActionListener(this);
		btnMultiply.setBounds(25, 201, 89, 23);
		panel.add(btnMultiply);
		
		btnDivide = new JButton("Divide");
		btnDivide.addActionListener(this);
		btnDivide.setBounds(25, 235, 89, 23);
		panel.add(btnDivide);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(this);
		btnClear.setBounds(145, 167, 89, 23);
		panel.add(btnClear);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(this);
		btnExit.setBounds(86, 267, 89, 23);
		panel.add(btnExit);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnAdd)
		{
			textFieldResult.setText(Integer.toString(Integer.parseInt(textFieldFirst.getText()) + 
			Integer.parseInt(textFieldSecond.getText())));
		}
		
		if(e.getSource() == btnSubtract)
		{
			textFieldResult.setText(Integer.toString(Integer.parseInt(textFieldFirst.getText()) - 
			Integer.parseInt(textFieldSecond.getText())));
		}
		
		if(e.getSource() == btnMultiply)
		{
			textFieldResult.setText(Integer.toString(Integer.parseInt(textFieldFirst.getText()) * 
			Integer.parseInt(textFieldSecond.getText())));
		}
		
		if(e.getSource() == btnDivide)
		{
			textFieldResult.setText(Double.toString(Double.parseDouble(textFieldFirst.getText()) / 
			Double.parseDouble(textFieldSecond.getText())));
		}
		
		if(e.getSource() == btnRandom)
		{
			textFieldFirst.setText(Integer.toString(rand.nextInt(500) + 1));
			textFieldSecond.setText(Integer.toString(rand.nextInt(500) + 1));
		}
		
		if(e.getSource() == btnClear)
		{
			textFieldFirst.setText(null);
			textFieldSecond.setText(null);
			textFieldResult.setText(null);
		}
		
		if(e.getSource() == btnExit)
		{
			System.exit(0);
		}
	}
}
