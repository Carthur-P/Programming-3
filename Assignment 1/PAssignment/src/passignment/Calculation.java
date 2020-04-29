package passignment;

import java.util.*;

/**
 * @author Carthur Pongpatimet (1000026069)
 * Main class which pass variables to the correct classes and create the array list
 */
public abstract class Calculation {
	
	/**
	 * @param accidentList This is the array list that will holds all the accident's information
	 * @param f This is the enum that will determine what data field from the accident class will be use in the method 
	 * @return int This returns the biggest number extracted from a field, base on the enum type from the accident array list 
	 */
	public static int findMax(ArrayList<Accident> accidentList, Fields f)
	{
		int max = accidentList.get(0).getValue(f);
		for(int i = 0; i < accidentList.size() - 1; i++)
		{
			if(max < accidentList.get(i + 1).getValue(f))
			{
				max = accidentList.get(i + 1).getValue(f);
			}
		}
		return max;
	}
	
	/**
	 * @param accidentList This is the array list that will holds all the accident's information
	 * @param f This is the enum that will determine what data field from the accident class will be use in the method
	 * @return int This returns the smallest number extracted from a field, base on the enum type from the accident array list 
	 */
	public static int findMin(ArrayList<Accident> accidentList, Fields f)
	{
		int min = accidentList.get(0).getValue(f);
		for(int i = 0; i > accidentList.size() - 1; i++)
		{
			if(min < accidentList.get(i + 1).getValue(f))
			{
				min = accidentList.get(i + 1).getValue(f);
			}
		}
		return min;
	}
	
	/**
	 * @param accidentList This is the array list that will holds all the accident's information
	 * @param f This is the enum that will determine what data field from the accident class will be use in the method
	 * @return int This returns the total number from a field, base on the enum type from the accident array list
	 */
	public static int findTotal(ArrayList<Accident> accidentList, Fields f)
	{
		int total = 0;
		for(Accident a:accidentList)
		{
			total = total + a.getValue(f);
		}
		return total;
	}
	
	/**
	 * @param accidentList This is the array list that will holds all the accident's information
	 * @param f This is the enum that will determine what data field from the accident class will be use in the method
	 * @return double This returns the average number from a field, base on the enum type from the accident array list
	 */
	public static double findAverage(ArrayList<Accident> accidentList, Fields f)
	{
		int total = findTotal(accidentList, f);
		return (double)total/accidentList.size();
	}
	
	/**
	 * @param accidentList This is the array list that will holds all the accident's information
	 * @return Map This returns a map which contains the accident's year as the key and total amount of fatality from that year as the value
	 */
	public static Map getTotalFatalityByYear(ArrayList<Accident> accidentList)
	{
		Map<Integer, Integer> myMap = new TreeMap<>();
		for(Accident a:accidentList)
		{
			if(myMap.get(a.getAccidentYear()) == null)
			{
				myMap.put(a.getAccidentYear(), (a.getAirFatality() + a.getGroundFatality()));
			}
			
			else
			{
				myMap.put(a.getAccidentYear(), myMap.get(a.getAccidentYear()) + (a.getAirFatality() + a.getGroundFatality()));
			}
		}
		return myMap;
	} 
}
