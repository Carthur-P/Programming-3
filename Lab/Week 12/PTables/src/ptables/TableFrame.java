package ptables;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class TableFrame extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel tm;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableFrame frame = new TableFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TableFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 535, 372);
		contentPane.add(scrollPane);
		
		table = new JTable();
		tm = new DefaultTableModel(new Object[][] {{null, null, null, null, null},}, new String[] {"Name", "Address", "Brand", "Country", "Item"});
		table.setModel(tm);
		scrollPane.setViewportView(table);
		drawTable();
	}
	
	public void drawTable()
	{
		tm.setRowCount(0);
		
		for(int i = 0; i <= 100; i++)
		{
			Object[] o = new Object[5];
			o[0] = "computers.get(0).getName()";
			o[1] = "computers.get(1).getAddress()";
			o[2] = "computers.get(2).getBrand()";
			o[3] = "computers.get(3).getCountry()";
			o[4] = "computers.get(4).getItem()";
			tm.addRow(o);
		}
	}
}
