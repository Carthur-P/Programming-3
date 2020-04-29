package passignment;

import java.util.Comparator;

/**
 * @author Carthur Pongpatimet (1000026069)
 * Comparator class which will compare the amount of people aboard the plane
 */
public class CompareAboard implements Comparator<Accident> {

	/**
	 * @return int This returns a number that represents the outcome of the comparison 
	 */
	@Override
	public int compare(Accident a1, Accident a2) {
		int num;
		if (a1.getPlane().getAboard() > a2.getPlane().getAboard())
		{
			num = 1;
		}
		
		else if  (a1.getPlane().getAboard() < a2.getPlane().getAboard())
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
