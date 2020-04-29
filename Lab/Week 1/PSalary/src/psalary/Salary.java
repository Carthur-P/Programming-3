package psalary;

public class Salary {

	private double salary;
	
	public Salary(double salary)
	{
		this.salary = salary;
	}
	
	public double getGross()
	{
		return salary;
	}
	
	public void setGross(double gross)
	{
		salary = gross;
	}
	
	public double getTax()
	{
		double tax = 0;
		
		if (salary > 70000)
		{
			tax = ((salary - 70000)*0.33) + (22000*0.3) + (34000*0.175) + (14000*0.105);
		}
		
		else if (salary > 48000)
		{
			tax = ((salary - 48000)*0.3) + (34000*0.175) + (14000*0.105);
		}
		
		else if (salary > 14000)
		{
			tax = ((salary - 14000)*0.175) + (14000*0.105);
		}
		
		else if ((salary < 14000) && (salary > 0))
		{
			tax = salary*0.105;
		}
		
		else
		{
			tax = 0;
		}
		
		return tax; 
	}
	
	public double getNet()
	{
		double net;
		net = salary -= getTax();
		return net;
	}
}
