package passignment;

import java.util.*;

/**
 * @author Carthur Pongpatimet (1000026069)
 * Main class which pass variables to the correct classes and create the array list
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Plane> planeList = new ArrayList<Plane>();
		ArrayList<Accident> accidentList = new ArrayList<Accident>();
		ReadFile.Load(planeList, accidentList);
		AccidentReportFrame frame = new AccidentReportFrame(accidentList);
	}
}
