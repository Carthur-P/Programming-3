package passignment;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.table.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.util.*;

/**
 * @author Carthur Pongpatimet (1000026069)
 * GUI class
 */
public class AccidentReportFrame extends JFrame implements ActionListener, ListSelectionListener{

	/**
	 * 
	 */
	private ArrayList<Accident> accidentList;
	/**
	 * 
	 */
	private ArrayList<Accident> showList;
	/**
	 * 
	 */
	private DecimalFormat formatter;
	/**
	 * 
	 */
	private int index;
	/**
	 * 
	 */
	private DefaultTableModel tm;
	/**
	 * 
	 */
	private JPanel contentPane;
	/**
	 * 
	 */
	private JTabbedPane tabbedPane;
	/**
	 * 
	 */
	private JPanel panelView;
	/**
	 * 
	 */
	private JPanel panelPlane;
	/**
	 * 
	 */
	private JScrollPane scrollPane;
	/**
	 * 
	 */
	private JLabel lblTitle;
	/**
	 * 
	 */
	private JLabel lblSortOption;
	/**
	 * 
	 */
	private JLabel lblDate;
	/**
	 * 
	 */
	private JLabel lblTime;
	/**
	 * 
	 */
	private JLabel lblLoacation;
	/**
	 * 
	 */
	private JLabel lblAirFatality;
	/**
	 * 
	 */
	private JLabel lblGroundFatality;
	/**
	 * 
	 */
	private JLabel lblSummary;
	/**
	 * 
	 */
	private JLabel lblPeopleAboard;
	/**
	 * 
	 */
	private JLabel lblRoute;
	/**
	 * 
	 */
	private JLabel lblOperator;
	/**
	 * 
	 */
	private JLabel lblType;
	/**
	 * 
	 */
	private JLabel lblRegistration;
	/**
	 * 
	 */
	private JLabel lblSerialNumber;
	/**
	 * 
	 */
	private JLabel lblFlightNumber;
	/**
	 * 
	 */
	private JLabel lblPlaneInvolve;
	/**
	 * 
	 */
	private JTextField textFieldDate;
	/**
	 * 
	 */
	private JTextField textFieldTime;
	/**
	 * 
	 */
	private JTextField textFieldLoaction;
	/**
	 * 
	 */
	private JTextField textFieldAirFatality;
	/**
	 * 
	 */
	private JTextField textFieldGroundFatality;
	/**
	 * 
	 */
	private JTextField textFieldPeopleAboard;
	/**
	 * 
	 */
	private JTextField textFieldOperator;
	/**
	 * 
	 */
	private JTextField textFieldType;
	/**
	 * 
	 */
	private JTextField textFieldRegistration;
	/**
	 * 
	 */
	private JTextField textFieldSerialNumber;
	/**
	 * 
	 */
	private JTextField textFieldFlightNumber;
	/**
	 * 
	 */
	private JTextArea textAreaSummary;
	/**
	 * 
	 */
	private JTextArea textAreaRoute;
	/**
	 * 
	 */
	private JButton btnNext;
	/**
	 * 
	 */
	private JButton btnPrevious;
	/**
	 * 
	 */
	private JComboBox<String> comboBoxSort;
	/**
	 * 
	 */
	private JComboBox<String> comboBoxSearchType;
	/**
	 * 
	 */
	private JPanel panelViewAll;
	/**
	 * 
	 */
	private JScrollPane scrollPaneTable;
	/**
	 * 
	 */
	private JTable table;
	/**
	 * 
	 */
	private JScrollPane scrollPaneSeach;
	/**
	 * 
	 */
	private JList<Object> listSearch;
	/**
	 * 
	 */
	private JLabel lblSearchType;
	/**
	 * 
	 */
	private JButton btnClearSearch;
	/**
	 * 
	 */
	private JPanel panelInfo;
	/**
	 * 
	 */
	private JPanel panelExtraInfo;
	/**
	 * 
	 */
	private JLabel lblMaxAirFatality;
	/**
	 * 
	 */
	private JTextField textFieldMaxAirFatality;
	/**
	 * 
	 */
	private JLabel lblMinAirFatality;
	/**
	 * 
	 */
	private JTextField textFieldMinAirFatality;
	/**
	 * 
	 */
	private JLabel lblMaxGroundFatality;
	/**
	 * 
	 */
	private JTextField textFieldMaxGroundFatality;
	/**
	 * 
	 */
	private JLabel lblMinGroundFatality;
	/**
	 * 
	 */
	private JTextField textFieldMinGroundFatality;
	/**
	 * 
	 */
	private JLabel lblAveAirFatality;
	/**
	 * 
	 */
	private JTextField textFieldAveAirFatality;
	/**
	 * 
	 */
	private JLabel lblAveGroundFatality;
	/**
	 * 
	 */
	private JTextField textFieldAveGroundFatality;
	/**
	 * 
	 */
	private JLabel lblTotalAirFatality;
	/**
	 * 
	 */
	private JTextField textFieldTotalAirFatality;
	/**
	 * 
	 */
	private JLabel lblTotalGroundFatality;
	/**
	 * 
	 */
	private JTextField textFieldTotalGroundFatality;
	/**
	 * 
	 */
	private JLabel lblExtraInfo;
	/**
	 * 
	 */
	private JButton btnShowGraph;

	/**
	 * @param accidentList This is an array list containing all the information about the accidents
	 * Constructor
	 */
	public AccidentReportFrame(ArrayList<Accident> accidentList) 
	{
		super.setVisible(true);	
		super.setTitle("Accident Report");
		this.accidentList = accidentList;
		showList = new ArrayList<Accident>();
		formatter = new DecimalFormat("0.00");
		index = 0;
		for(Accident a:accidentList)
		{
			showList.add(a);
		}
		
		//view record tab
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1109, 476); 
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTitle = new JLabel("Plane Accident Report");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 30));
		lblTitle.setBounds(344, 11, 391, 49);
		contentPane.add(lblTitle);
			
		tabbedPane = new JTabbedPane(SwingConstants.TOP);
		tabbedPane.setBackground(new Color(192, 192, 192));
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBounds(10, 71, 1073, 355);
		contentPane.add(tabbedPane);
		
		panelView = new JPanel();
		panelView.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("View Record", null, panelView, null);
		panelView.setLayout(null);
		
		panelPlane = new JPanel();
		panelPlane.setBackground(new Color(173, 216, 230));
		panelPlane.setBounds(10, 11, 415, 271);
		panelView.add(panelPlane);
		panelPlane.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPlane.setLayout(null);

		lblPlaneInvolve = new JLabel("Plane Involved");
		lblPlaneInvolve.setFont(new Font("Arial", Font.BOLD, 12));
		lblPlaneInvolve.setBounds(10, 15, 122, 14);
		panelPlane.add(lblPlaneInvolve);
		
		lblPeopleAboard = new JLabel("People aboard:");
		lblPeopleAboard.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPeopleAboard.setBounds(10, 242, 103, 14);
		panelPlane.add(lblPeopleAboard);
		
		textFieldPeopleAboard = new JTextField();
		textFieldPeopleAboard.setEditable(false);
		textFieldPeopleAboard.setColumns(10);
		textFieldPeopleAboard.setBounds(123, 240, 280, 20);
		panelPlane.add(textFieldPeopleAboard);
		
		lblRoute = new JLabel("Route: ");
		lblRoute.setFont(new Font("Arial", Font.PLAIN, 12));
		lblRoute.setBounds(10, 102, 103, 14);
		panelPlane.add(lblRoute);
		
		textAreaRoute = new JTextArea();
		textAreaRoute.setEditable(false);
		textAreaRoute.setBounds(123, 102, 280, 40);
		textAreaRoute.setLineWrap(true);
		panelPlane.add(textAreaRoute);
		
		lblOperator = new JLabel("Operator: ");
		lblOperator.setFont(new Font("Arial", Font.PLAIN, 12));
		lblOperator.setBounds(10, 73, 103, 14);
		panelPlane.add(lblOperator);
		
		textFieldOperator = new JTextField();
		textFieldOperator.setEditable(false);
		textFieldOperator.setColumns(10);
		textFieldOperator.setBounds(123, 71, 280, 20);
		panelPlane.add(textFieldOperator);
		
		lblType = new JLabel("Type: ");
		lblType.setFont(new Font("Arial", Font.PLAIN, 12));
		lblType.setBounds(10, 44, 103, 14);
		panelPlane.add(lblType);
		
		textFieldType = new JTextField();
		textFieldType.setEditable(false);
		textFieldType.setColumns(10);
		textFieldType.setBounds(123, 42, 280, 20);
		panelPlane.add(textFieldType);
		
		lblRegistration = new JLabel("Registration: ");
		lblRegistration.setFont(new Font("Arial", Font.PLAIN, 12));
		lblRegistration.setBounds(10, 155, 103, 14);
		panelPlane.add(lblRegistration);
		
		textFieldRegistration = new JTextField();
		textFieldRegistration.setEditable(false);
		textFieldRegistration.setColumns(10);
		textFieldRegistration.setBounds(123, 153, 280, 20);
		panelPlane.add(textFieldRegistration);
		
		lblSerialNumber = new JLabel("Serial Number:");
		lblSerialNumber.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSerialNumber.setBounds(10, 184, 103, 14);
		panelPlane.add(lblSerialNumber);
		
		textFieldSerialNumber = new JTextField();
		textFieldSerialNumber.setEditable(false);
		textFieldSerialNumber.setColumns(10);
		textFieldSerialNumber.setBounds(123, 182, 280, 20);
		panelPlane.add(textFieldSerialNumber);
		
		lblFlightNumber = new JLabel("Flight Number:");
		lblFlightNumber.setFont(new Font("Arial", Font.PLAIN, 12));
		lblFlightNumber.setBounds(10, 213, 103, 14);
		panelPlane.add(lblFlightNumber);
		
		textFieldFlightNumber = new JTextField();
		textFieldFlightNumber.setEditable(false);
		textFieldFlightNumber.setColumns(10);
		textFieldFlightNumber.setBounds(123, 209, 280, 20);
		panelPlane.add(textFieldFlightNumber);
		
		lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDate.setBounds(435, 13, 103, 14);
		panelView.add(lblDate);
		
		textFieldDate = new JTextField();
		textFieldDate.setEditable(false);
		textFieldDate.setBounds(548, 11, 275, 20);
		panelView.add(textFieldDate);
		textFieldDate.setColumns(10);
		
		lblTime = new JLabel("Time:");
		lblTime.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTime.setBounds(435, 38, 103, 14);
		panelView.add(lblTime);
			
		textFieldTime = new JTextField();
		textFieldTime.setEditable(false);
		textFieldTime.setColumns(10);
		textFieldTime.setBounds(548, 36, 275, 20);
		panelView.add(textFieldTime);
		
		lblLoacation = new JLabel("Loacation:");
		lblLoacation.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLoacation.setBounds(435, 63, 103, 14);
		panelView.add(lblLoacation);
		
		textFieldLoaction = new JTextField();
		textFieldLoaction.setEditable(false);
		textFieldLoaction.setColumns(10);
		textFieldLoaction.setBounds(548, 61, 275, 20);
		panelView.add(textFieldLoaction);
		
		lblAirFatality = new JLabel("Air Fatality:");
		lblAirFatality.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAirFatality.setBounds(435, 88, 103, 14);
		panelView.add(lblAirFatality);
		
		textFieldAirFatality = new JTextField();
		textFieldAirFatality.setEditable(false);
		textFieldAirFatality.setColumns(10);
		textFieldAirFatality.setBounds(548, 86, 275, 20);
		panelView.add(textFieldAirFatality);
		
		lblGroundFatality = new JLabel("Ground Fatality:");
		lblGroundFatality.setFont(new Font("Arial", Font.PLAIN, 12));
		lblGroundFatality.setBounds(435, 113, 103, 14);
		panelView.add(lblGroundFatality);
		
		textFieldGroundFatality = new JTextField();
		textFieldGroundFatality.setEditable(false);
		textFieldGroundFatality.setColumns(10);
		textFieldGroundFatality.setBounds(548, 111, 275, 20);
		panelView.add(textFieldGroundFatality);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(435, 160, 390, 156);
		panelView.add(scrollPane);
		
		lblSummary = new JLabel("Summary: ");
		lblSummary.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSummary.setBounds(435, 138, 103, 14);
		panelView.add(lblSummary);
		
		textAreaSummary = new JTextArea();
		textAreaSummary.setEditable(false);
		scrollPane.setViewportView(textAreaSummary);
		textAreaSummary.setLineWrap(true);
		
		btnNext = new JButton("Next");
		btnNext.setBackground(new Color(169, 169, 169));
		btnNext.setBounds(210, 293, 215, 23);
		btnNext.addActionListener(this);
		panelView.add(btnNext);
		
		btnPrevious = new JButton("Previous");
		btnPrevious.setBackground(new Color(169, 169, 169));
		btnPrevious.setBounds(10, 293, 190, 23);
		btnPrevious.addActionListener(this);
		panelView.add(btnPrevious);

		lblSortOption = new JLabel("Sort Option:");
		lblSortOption.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSortOption.setBounds(833, 13, 87, 14);
		panelView.add(lblSortOption);

		comboBoxSort = new JComboBox<String>();
		comboBoxSort.setModel(new DefaultComboBoxModel<String>(new String[] {"Date", "Time", "Location", "Plane Type", "Plane Operator", "Plane Route", "Plane Registration", "Plane Serial Number", "Flight Number", "Air Fatality", "Ground Fatality", "People Aboard"}));
		comboBoxSort.setBounds(833, 36, 223, 20);
		comboBoxSort.addActionListener(this);
		panelView.add(comboBoxSort);
		
		lblSearchType = new JLabel("Search By:");
		lblSearchType.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSearchType.setBounds(836, 79, 69, 14);
		panelView.add(lblSearchType);
		
		comboBoxSearchType = new JComboBox<String>();
		comboBoxSearchType.setModel(new DefaultComboBoxModel<String>(new String[] {"Date", "Time", "Location", "Plane Type", "Plane Operator", "Plane Route", "Plane Registration", "Plane Serial Number", "Flight Number", "Air Fatality", "Ground Fatality", "People Aboard"}));
		comboBoxSearchType.setBounds(833, 98, 223, 20);
		comboBoxSearchType.addActionListener(this);
		panelView.add(comboBoxSearchType);
		
		scrollPaneSeach = new JScrollPane();
		scrollPaneSeach.setBounds(833, 126, 223, 156);
		panelView.add(scrollPaneSeach);
		
		btnClearSearch = new JButton("Clear Search");
		btnClearSearch.setBackground(new Color(169, 169, 169));
		btnClearSearch.setBounds(835, 293, 223, 23);
		btnClearSearch.addActionListener(this);
		panelView.add(btnClearSearch);

		//table tab
		panelViewAll = new JPanel();
		tabbedPane.addTab("View All", null, panelViewAll, null);
		panelViewAll.setLayout(null);
		
		scrollPaneTable = new JScrollPane();
		scrollPaneTable.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneTable.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPaneTable.setBounds(10, 11, 1048, 305);
		panelViewAll.add(scrollPaneTable);
		
		table = new JTable();
		tm = new DefaultTableModel(new Object[][]{},new String[] {"Accident Date", "Accident Time", "Accident Location", "Plane Type", "Plane Operator", "Plane Route", "Registration Number", "Serial Number", "Flight Number", "Air Fatality", "Ground Fatality","People Aboard", "Summary"});
		table.setModel(tm);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPaneTable.setViewportView(table);
	
		//information tab
		panelInfo = new JPanel();
		panelInfo.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("Information/Graph", null, panelInfo, null);
		panelInfo.setLayout(null);

		panelExtraInfo = new JPanel();
		panelExtraInfo.setBackground(new Color(173, 216, 230));
		panelExtraInfo.setBounds(10, 11, 233, 305);
		panelInfo.add(panelExtraInfo);
		panelExtraInfo.setLayout(null);
		
		lblMaxAirFatality = new JLabel("Highest Air Fatality: ");
		lblMaxAirFatality.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMaxAirFatality.setBounds(10, 64, 125, 14);
		panelExtraInfo.add(lblMaxAirFatality);
		
		textFieldMaxAirFatality = new JTextField();
		textFieldMaxAirFatality.setEditable(false);
		textFieldMaxAirFatality.setBounds(145, 62, 78, 20);
		panelExtraInfo.add(textFieldMaxAirFatality);
		textFieldMaxAirFatality.setColumns(10);
		textFieldMaxAirFatality.setText(Integer.toString(Calculation.findMax(accidentList, Fields.AIRFATALITY)));
		
		lblMinAirFatality = new JLabel("Lowest Air Fatality:");
		lblMinAirFatality.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMinAirFatality.setBounds(10, 91, 125, 14);
		panelExtraInfo.add(lblMinAirFatality);
		
		textFieldMinAirFatality = new JTextField();
		textFieldMinAirFatality.setEditable(false);
		textFieldMinAirFatality.setText("0");
		textFieldMinAirFatality.setColumns(10);
		textFieldMinAirFatality.setBounds(145, 89, 78, 20);
		textFieldMinAirFatality.setText(Integer.toString(Calculation.findMin(accidentList, Fields.AIRFATALITY)));
		panelExtraInfo.add(textFieldMinAirFatality);
		
		lblMaxGroundFatality = new JLabel("Highest Ground Fatality:");
		lblMaxGroundFatality.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMaxGroundFatality.setBounds(10, 118, 140, 14); 
		panelExtraInfo.add(lblMaxGroundFatality);
		
		textFieldMaxGroundFatality = new JTextField();
		textFieldMaxGroundFatality.setEditable(false);
		textFieldMaxGroundFatality.setText("0");
		textFieldMaxGroundFatality.setColumns(10);
		textFieldMaxGroundFatality.setBounds(145, 116, 78, 20);
		textFieldMaxGroundFatality.setText(Integer.toString(Calculation.findMax(accidentList, Fields.GROUNDFATALITY)));
		panelExtraInfo.add(textFieldMaxGroundFatality);
		
		lblMinGroundFatality = new JLabel("Lowest Ground Fatality:");
		lblMinGroundFatality.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMinGroundFatality.setBounds(10, 145, 140, 14);
		panelExtraInfo.add(lblMinGroundFatality);
		
		textFieldMinGroundFatality = new JTextField();
		textFieldMinGroundFatality.setEditable(false);
		textFieldMinGroundFatality.setText("0");
		textFieldMinGroundFatality.setColumns(10);
		textFieldMinGroundFatality.setBounds(145, 143, 78, 20);
		textFieldMinGroundFatality.setText(Integer.toString(Calculation.findMin(accidentList, Fields.GROUNDFATALITY)));
		panelExtraInfo.add(textFieldMinGroundFatality);
		
		lblAveAirFatality = new JLabel("Average Air Fatality:");
		lblAveAirFatality.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAveAirFatality.setBounds(10, 172, 140, 14);
		panelExtraInfo.add(lblAveAirFatality);
		
		textFieldAveAirFatality = new JTextField();
		textFieldAveAirFatality.setEditable(false);
		textFieldAveAirFatality.setText("0");
		textFieldAveAirFatality.setColumns(10);
		textFieldAveAirFatality.setBounds(145, 170, 78, 20);
		textFieldAveAirFatality.setText(formatter.format(Calculation.findAverage(accidentList, Fields.AIRFATALITY)));
		panelExtraInfo.add(textFieldAveAirFatality);
		
		lblAveGroundFatality = new JLabel("Average Ground Fatality:");
		lblAveGroundFatality.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAveGroundFatality.setBounds(10, 199, 140, 14);
		panelExtraInfo.add(lblAveGroundFatality);
		
		textFieldAveGroundFatality = new JTextField();
		textFieldAveGroundFatality.setEditable(false);
		textFieldAveGroundFatality.setText("0");
		textFieldAveGroundFatality.setColumns(10);
		textFieldAveGroundFatality.setBounds(145, 197, 78, 20);
		textFieldAveGroundFatality.setText(formatter.format(Calculation.findAverage(accidentList, Fields.GROUNDFATALITY)));
		panelExtraInfo.add(textFieldAveGroundFatality);
		
		lblTotalAirFatality = new JLabel("Total Air Fatality:");
		lblTotalAirFatality.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTotalAirFatality.setBounds(10, 226, 140, 14);
		panelExtraInfo.add(lblTotalAirFatality);
		
		textFieldTotalAirFatality = new JTextField();
		textFieldTotalAirFatality.setEditable(false);
		textFieldTotalAirFatality.setText("0");
		textFieldTotalAirFatality.setColumns(10);
		textFieldTotalAirFatality.setBounds(145, 224, 78, 20);
		textFieldTotalAirFatality.setText(Integer.toString(Calculation.findTotal(accidentList, Fields.AIRFATALITY)));
		panelExtraInfo.add(textFieldTotalAirFatality);
		
		lblTotalGroundFatality = new JLabel("Total Ground Fatality:");
		lblTotalGroundFatality.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTotalGroundFatality.setBounds(10, 257, 140, 14);
		panelExtraInfo.add(lblTotalGroundFatality);
		
		textFieldTotalGroundFatality = new JTextField();
		textFieldTotalGroundFatality.setEditable(false);
		textFieldTotalGroundFatality.setText("0");
		textFieldTotalGroundFatality.setColumns(10);
		textFieldTotalGroundFatality.setBounds(145, 255, 78, 20);
		textFieldTotalGroundFatality.setText(Integer.toString(Calculation.findTotal(accidentList, Fields.GROUNDFATALITY)));
		panelExtraInfo.add(textFieldTotalGroundFatality);
		
		lblExtraInfo = new JLabel("Extra Information");
		lblExtraInfo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblExtraInfo.setBounds(10, 22, 140, 14);
		panelExtraInfo.add(lblExtraInfo);
		
		btnShowGraph = new JButton("Show Graph");
		btnShowGraph.setFont(new Font("Arial", Font.PLAIN, 25));
		btnShowGraph.addActionListener(this);
		btnShowGraph.setBounds(571, 133, 178, 61);
		panelInfo.add(btnShowGraph);

		//displaying the information onto the GUI
		displayData();
		drawTable();
	}
	
	/**
	 * Drawing a table containing all the information of the accidents onto the GUI
	 */
	public void drawTable()
	{
		tm.setRowCount(0);
		for(Accident a:accidentList)
		{
			Object[] o = new Object[13];
			o[0] = a.getAccidentDate();
			o[1] = a.getTime();
			o[2] = a.getLocation();
			o[3] = a.getPlane().getType();
			o[4] = a.getPlane().getOperator();
			o[5] = a.getPlane().getRoute();
			o[6] = a.getPlane().getRegistration();
			o[7] = a.getPlane().getSerialNumber();
			o[8] = a.getPlane().getFlightNumber();
			o[9] = a.getAirFatality();
			o[10] = a.getAirFatality();
			o[11] = a.getPlane().getAboard();
			o[12] = a.getSummary();
			tm.addRow(o);
		}
	}
	
	/**
	 * Sorting the data alphabetically on what is selected from the the combo box 
	 */
	public void Sort()
	{	
		switch((String)comboBoxSort.getSelectedItem())
		{
			case "Date":
			{
				Collections.sort(showList);
				break;
			}
			
			case "Time":
			{
				Collections.sort(showList, new CompareTime());
				break;
			}
			
			case "Location":
			{
				Collections.sort(showList, new CompareLocation());
				break;
			}
			
			case "Plane Type":
			{
				Collections.sort(showList, new ComparePlaneType());
				break;
			}
			
			case "Plane Operator":
			{
				Collections.sort(showList, new CompareOperator());
				break;
			}
			
			case "Plane Route":
			{
				Collections.sort(showList, new CompareRoute());
				break;
			}
			
			case "Plane Registration":
			{
				Collections.sort(showList, new CompareRegistration());
				break;
			}
			
			case "Plane Serial Number":
			{
				Collections.sort(showList, new CompareSerialNumber());
				break;
			}
			
			case "Flight Number":
			{
				Collections.sort(showList, new CompareFlightNumber());
				break;
			}
			
			case "Air Fatality":
			{
				Collections.sort(showList, new CompareFatality());
				break;
			}
			
			case "Ground Fatality":
			{
				Collections.sort(showList, new CompareGroundFatality());
				break;
			}
			
			case "People Aboard":
			{
				Collections.sort(showList, new CompareAboard());
				break;
			}
		}
		index = 0;
		displayData();
	}
	
	/**
	 * Displaying the choices that the user can select to search base on what is selected from the combo box
	 */
	public void searchType()
	{
		ArrayList<Object> information = new ArrayList<Object>();
		TreeSet<Object> myTreeSet = null;
		
		switch((String)comboBoxSearchType.getSelectedItem())
		{
			case "Date":
			{
				information.clear();
				for(Accident a:accidentList)
				{
					information.add(a.getAccidentDate());
				}
				myTreeSet = new TreeSet<Object>(information);
				break;
			}
			
			case "Time":
			{
				information.clear();
				for(Accident a:accidentList)
				{
					information.add(a.getTime());
				}
				myTreeSet = new TreeSet<Object>(information);
				break;
			}
			
			case "Location":
			{
				information.clear();
				for(Accident a:accidentList)
				{
					information.add(a.getLocation());
				}
				myTreeSet = new TreeSet<Object>(information);
				break;
			}
			
			case "Plane Type":
			{
				information.clear();
				for(Accident a:accidentList)
				{
					information.add(a.getPlane().getType());
				}
				myTreeSet = new TreeSet<Object>(information);
				break;
			}
			
			case "Plane Operator":
			{
				information.clear();
				for(Accident a:accidentList)
				{
					information.add(a.getPlane().getOperator());
				}
				myTreeSet = new TreeSet<Object>(information);
				break;
			}
			
			case "Plane Route":
			{
				information.clear();
				for(Accident a:accidentList)
				{
					information.add(a.getPlane().getRoute());
				}
				myTreeSet = new TreeSet<Object>(information);
				break;
			}
			
			case "Plane Registration":
			{
				information.clear();
				for(Accident a:accidentList)
				{
					information.add(a.getPlane().getRegistration());
				}
				myTreeSet = new TreeSet<Object>(information);
				break;
			}
			
			case "Plane Serial Number":
			{
				information.clear();
				for(Accident a:accidentList)
				{
					information.add(a.getPlane().getSerialNumber());
				}
				myTreeSet = new TreeSet<Object>(information);
				break;
			}
			
			case "Flight Number":
			{
				information.clear();
				for(Accident a:accidentList)
				{
					information.add(a.getPlane().getFlightNumber());
				}
				myTreeSet = new TreeSet<Object>(information);
				break;
			}
			
			case "Air Fatality":
			{
				information.clear();
				for(Accident a:accidentList)
				{
					information.add(a.getAirFatality());
				}
				myTreeSet = new TreeSet<Object>(information);
				break;
			}
			
			case "Ground Fatality":
			{
				information.clear();
				for(Accident a:accidentList)
				{
					information.add(a.getGroundFatality());
				}
				myTreeSet = new TreeSet<Object>(information);
				break;
			}
			
			case "People Aboard":
			{
				information.clear();
				for(Accident a:accidentList)
				{
					information.add(a.getPlane().getAboard());
				}
				myTreeSet = new TreeSet<Object>(information);
				break;
			}
		}
		listSearch = new JList<Object>(myTreeSet.toArray());
		listSearch.addListSelectionListener(this);
		scrollPaneSeach.setViewportView(listSearch); 
	}
	
	/**
	 * Searching method that will filter what data is displayed based on what the user have chosen
	 */
	public void search() 
	{
		index = 0;
		showList.clear();
		for(Accident a:accidentList)
		{
			if(a.getAccidentDate().equals(listSearch.getSelectedValue().toString()) && comboBoxSearchType.getSelectedItem().equals("Date"))
			{
				showList.add(a);
			}
			
			if(a.getTime().equals(listSearch.getSelectedValue().toString()) && comboBoxSearchType.getSelectedItem().equals("Time"))
			{
				showList.add(a);
			}
			
			if(a.getLocation().equals(listSearch.getSelectedValue().toString()) && comboBoxSearchType.getSelectedItem().equals("Location"))
			{
				showList.add(a);
			}
			
			if(a.getPlane().getType().equals(listSearch.getSelectedValue().toString()) && comboBoxSearchType.getSelectedItem().equals("Plane Type"))
			{
				showList.add(a);
			}
			
			if(a.getPlane().getOperator().equals(listSearch.getSelectedValue().toString()) && comboBoxSearchType.getSelectedItem().equals("Plane Operator"))
			{
				showList.add(a);
			}
			
			if(a.getPlane().getRoute().equals(listSearch.getSelectedValue().toString()) && comboBoxSearchType.getSelectedItem().equals("Plane Route"))
			{
				showList.add(a);
			}
			
			if(a.getPlane().getRegistration().equals(listSearch.getSelectedValue().toString()) && comboBoxSearchType.getSelectedItem().equals("Plane Registration"))
			{
				showList.add(a);
			}
			
			if(a.getPlane().getSerialNumber().equals(listSearch.getSelectedValue().toString()) && comboBoxSearchType.getSelectedItem().equals("Plane Serial Number"))
			{
				showList.add(a);
			}
			
			if(a.getPlane().getFlightNumber().equals(listSearch.getSelectedValue().toString()) && comboBoxSearchType.getSelectedItem().equals("Flight Number"))
			{
				showList.add(a);
			}
			
			if(Integer.toString(a.getAirFatality()).equals(listSearch.getSelectedValue().toString()) && comboBoxSearchType.getSelectedItem().equals("Air Fatality"))
			{
				showList.add(a);
			}
			
			if(Integer.toString(a.getGroundFatality()).equals(listSearch.getSelectedValue().toString()) && comboBoxSearchType.getSelectedItem().equals("Ground Fatality"))
			{
				showList.add(a);
			}
			
			if(Integer.toString(a.getPlane().getAboard()).equals(listSearch.getSelectedValue().toString()) && comboBoxSearchType.getSelectedItem().equals("People Aboard"))
			{
				showList.add(a);
			}
		}
	}
	
	/**
	 * Displaying all the information from the accident array list to the text field 
	 */
	public void displayData()
	{
		textFieldDate.setText(showList.get(index).getAccidentDate().toString());
		textFieldTime.setText(showList.get(index).getTime());
		textFieldLoaction.setText(showList.get(index).getLocation());
		textAreaSummary.setText(showList.get(index).getSummary());
		textFieldOperator.setText(showList.get(index).getPlane().getOperator());
		textFieldType.setText(showList.get(index).getPlane().getType());
		textFieldRegistration.setText(showList.get(index).getPlane().getRegistration());
		textFieldSerialNumber.setText(showList.get(index).getPlane().getSerialNumber());
		textFieldFlightNumber.setText(showList.get(index).getPlane().getFlightNumber());
		textAreaRoute.setText(showList.get(index).getPlane().getRoute());
		textFieldAirFatality.setText(Integer.toString(showList.get(index).getAirFatality()));
		textFieldGroundFatality.setText(Integer.toString(showList.get(index).getGroundFatality()));
		textFieldPeopleAboard.setText(Integer.toString(showList.get(index).getPlane().getAboard()));
	}
	
	/**
	 * Creating a line graph
	 */
	public void createLineGraph()
	{	
		ArrayList<Integer> keys = new ArrayList<Integer>(Calculation.getTotalFatalityByYear(accidentList).keySet());
		ArrayList<Integer> values = new ArrayList<Integer>(Calculation.getTotalFatalityByYear(accidentList).values());
				
		XYSeries series = new XYSeries("Total Fatality Per Year");
		for(int i = 0; i < keys.size(); i++)
		{
			series.add(keys.get(i), values.get(i));
		}
		
		XYSeriesCollection dataset = new XYSeriesCollection();
		dataset.addSeries(series);
		JFreeChart chart = ChartFactory.createXYLineChart("Total Aviation Accident's Fatality Per Year", "Year", "Total Fatality", dataset, PlotOrientation.VERTICAL, true, true, true);
		ChartPanel myPanel = new ChartPanel(chart);
		
		JFrame graphPane = new JFrame();
		graphPane.setBounds(100, 100, 1500, 850);
		graphPane.setVisible(true);
		graphPane.setTitle("Line Graph");
		graphPane.getContentPane().add(myPanel);
	}

	/** 
	 * Checking to see what components is calling the action listener and performing an action related to that component  
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNext)
		{
			if (index < showList.size() - 1)
			{
				index++;
			}
			else
			{
				index = 0;
			}
			displayData();
		}
		
		if (e.getSource() == btnPrevious)
		{
			if (index > 0)
			{
				index--;
			}
			else
			{
				index = showList.size() - 1;
			}
			displayData();
		}
		
		if (e.getSource() == btnClearSearch)
		{
			index = 0;
			showList.clear();
			for(Accident a:accidentList)
			{
				showList.add(a);
			}
			displayData();
		}
		
		if (e.getSource() == comboBoxSort)
		{
			Sort();
		}
		
		if(e.getSource() == comboBoxSearchType)
		{
			searchType();
		}	
		
		if(e.getSource() == btnShowGraph)
		{
			createLineGraph();
		}
	}

	/** 
	 * Checking to see what components is calling the value change and performing an action related to that component  
	 */
	@Override
	public void valueChanged(ListSelectionEvent e) {
		if (e.getSource() == listSearch)
		{
			search();
			displayData();
		}
	}
}
