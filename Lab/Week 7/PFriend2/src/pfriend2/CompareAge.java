package pfriend2;

import java.util.Comparator;

public class CompareAge implements Comparator<Friend>{

	@Override
	public int compare(Friend f1, Friend f2) {
		
		if(f1.getDOB() != null && f2.getDOB() != null)
		{
			return f1.calcAge() - f2.calcAge();
		}
		
		else if (f1.getDOB() == null)
		{
			return -99;
		}
		
		else
		{
			return 0;
		}
		
	}
}
