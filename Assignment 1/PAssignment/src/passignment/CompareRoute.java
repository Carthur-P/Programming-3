package passignment;

import java.util.Comparator;

/**
 * @author Carthur Pongpatimet (1000026069)
 * Comparator class which will compare the plane's route before the accident
 */
public class CompareRoute implements Comparator<Accident>{

	/**
	 * @return int This returns a number that represents the outcome of the comparison 
	 */
	@Override
	public int compare(Accident a1, Accident a2) {
		return a1.getPlane().getRoute().compareTo(a2.getPlane().getRoute());
	}
}
