package passignment;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Carthur Pongpatimet (1000026069)
 * Class that will read in the csv file holding all the data set and put it into an array list
 */
public class ReadFile {	
	/**
	 * @param planeList This is an array list which will be populated with information about planes
	 * @param accidentList This is an array list which will be populated with information about accidents
	 * try to read each line of a csv file and load it into its correct fields in an array list
	 */
	public static void Load(ArrayList<Plane> planeList, ArrayList<Accident> accidentList) {
		try
		{
			BufferedReader file;
			String line;
			int i = 0;
			file = new BufferedReader(new FileReader("Airplane Crashes and Fatalities.csv"));
			while((line = file.readLine()) != null)
			{
				String[] field = line.split(",");
				String date = field[0];
				String time = field[1];
				String location = field[2];
				String operator = field[3];
				String flightNumber = field[4];
				String route = field[5];
				String type = field[6];
				String registration = field[7];
				String serialNumber = field [8];
				int aboard = Integer.parseInt(field[9]);
				int fatality = Integer.parseInt(field[10]);
				int groundFatality = Integer.parseInt(field[11]);
				String summary = field[12];
				
				planeList.add(new Plane(operator, flightNumber, route, type, registration, serialNumber, aboard));
				accidentList.add(new Accident(date, time, location, fatality, groundFatality, summary, planeList.get(i)));
				i++;
			}
		}
		
		catch (IOException e)
		{
			System.out.println("Could not find file");
			e.getStackTrace();
		}
	}
}
