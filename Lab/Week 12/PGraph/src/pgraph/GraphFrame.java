package pgraph;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.JTabbedPane;

public class GraphFrame extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GraphFrame frame = new GraphFrame();
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
	public GraphFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 592, 355);
		tabbedPane.setVisible(true);
		contentPane.add(tabbedPane);
		
		CreateAPie();
	}
	
	public void CreateAPie() {
		DefaultPieDataset data = new DefaultPieDataset();
		//setting up the values
		data.setValue("Priciple", 5);
		data.setValue("Lecturer", 10);
		data.setValue("Administrator", 2);
		
		//creating the chart
		JFreeChart chart = ChartFactory.createPieChart("Pie Graph", data, true, true, Locale.ENGLISH);
		
		//setting up the panel for the chart
		ChartPanel myPanel = new ChartPanel(chart);
		myPanel.setVisible(true);
		tabbedPane.add("Pie Graph", myPanel);
	}
}
