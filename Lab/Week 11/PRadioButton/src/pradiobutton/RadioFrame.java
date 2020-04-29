package pradiobutton;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import java.awt.Font;

public class RadioFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JRadioButton rbCold;
	private JRadioButton rbMild;
	private JRadioButton rbHot;
	private JRadioButton rbRain;
	private JRadioButton rbSnow;
	private JRadioButton rbWet;
	private JRadioButton rbDry;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JButton btnShow;
	private JTextArea textArea;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioFrame frame = new RadioFrame();
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
	public RadioFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		rbCold = new JRadioButton("Cold");
		buttonGroup.add(rbCold);
		rbCold.setBounds(49, 18, 79, 23);
		contentPane.add(rbCold);
		
		rbMild = new JRadioButton("Mild");
		buttonGroup.add(rbMild);
		rbMild.setBounds(177, 18, 79, 23);
		contentPane.add(rbMild);
		
		rbHot = new JRadioButton("Hot");
		buttonGroup.add(rbHot);
		rbHot.setBounds(305, 18, 79, 23);
		contentPane.add(rbHot);
		
		rbRain = new JRadioButton("Rain");
		buttonGroup_2.add(rbRain);
		rbRain.setBounds(49, 118, 109, 23);
		contentPane.add(rbRain);
		
		rbSnow = new JRadioButton("Snow");
		buttonGroup_2.add(rbSnow);
		rbSnow.setBounds(177, 118, 109, 23);
		contentPane.add(rbSnow);
		
		rbWet = new JRadioButton("Wet");
		buttonGroup_1.add(rbWet);
		rbWet.setBounds(177, 70, 79, 23);
		contentPane.add(rbWet);
		
		rbDry = new JRadioButton("Dry");
		buttonGroup_1.add(rbDry);
		rbDry.setBounds(49, 70, 79, 23);
		contentPane.add(rbDry);
		
		btnShow = new JButton("Show Condition");
		btnShow.setFont(new Font("Arial", Font.PLAIN, 11));
		btnShow.addActionListener(this);
		btnShow.setBounds(305, 172, 119, 51);
		contentPane.add(btnShow);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(49, 156, 237, 83);
		contentPane.add(textArea);
	}
	public void actionPerformed(ActionEvent e) {
		
		rbCold.setActionCommand(rbCold.getText());
		rbMild.setActionCommand(rbMild.getText());
		rbHot.setActionCommand(rbHot.getText());
		rbDry.setActionCommand(rbDry.getText());
		rbWet.setActionCommand(rbWet.getText());
		rbRain.setActionCommand(rbRain.getText());
		rbSnow.setActionCommand(rbSnow.getText());
	    
		textArea.setText("");
	    textArea.append("Weather Information:\n");
	    textArea.append(buttonGroup.getSelection().getActionCommand() + "\n");
	    textArea.append(buttonGroup_1.getSelection().getActionCommand() + "\n");
	    textArea.append(buttonGroup_2.getSelection().getActionCommand());	    
	}
}
