package passignment;

import java.util.Comparator;

/**
 * @author Carthur Pongpatimet (1000026069)
 * Comparator class which will compare the accident's time
 */
public class CompareTime implements Comparator<Accident>{

	/**
	 * @return int This returns a number that represents the outcome of the comparison 
	 */
	@Override
	public int compare(Accident a1, Accident a2) {
		return a1.getTime().compareTo(a2.getTime());
	}

}
