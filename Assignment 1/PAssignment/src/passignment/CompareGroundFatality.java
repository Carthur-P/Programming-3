package passignment;

import java.util.Comparator;

/**
 * @author Carthur Pongpatimet (1000026069)
 * Comparator class which will compare the amount of ground fatality in an accident 
 */
public class CompareGroundFatality implements Comparator<Accident> {

	/**
	 * @return int This returns a number that represents the outcome of the comparison 
	 */
	@Override
	public int compare(Accident a1, Accident a2) {
		int num;
		if (a1.getGroundFatality() > a2.getGroundFatality())
		{
			num = 1;
		}
		
		else if  (a1.getGroundFatality() < a2.getGroundFatality())
		{
			num = -1;
		}
		
		else
		{
			num = 0;
		}
		return num;
	}
}
