package passignment;

import java.time.LocalDate;

/**
 * @author Carthur Pongpatimet (1000026069)
 * This class holds all the information about an accident
 */
public class Accident implements Comparable<Accident> {
	
	/**
	 * This is the field holding the date of the accident
	 */
	private LocalDate accidentDate;
	/**
	 * This is the field holding the time of the accident
	 */
	private String time;
	/**
	 * This is the field holding the location of the accident
	 */
	private String location;
	/**
	 * This is the field holding the amount of fatality in the air from the accident
	 */
	private int airFatality;
	/**
	 * This is the field holding the amount of fatality on the ground from the accident
	 */
	private int groundFatality;
	/**
	 * This is the field holding the summary of the accident
	 */
	private String summary;
	/**
	 * This is the field holding the plane involve in the accident
	 */
	private Plane plane;
	
	/**
	 * @param date This is a String containing the date of the accident
	 * @param time This is a String containing the time of the accident
	 * @param location This is a String containing the location of the accident
	 * @param airFatality This is an int containing the number of fatality in the air from the accident
	 * @param groundFatality This is an int containing the number of fatality on the ground from the accident
	 * @param summary This is a String containing the summary of the accident
	 * @param plane This is a plane object containing the plane that was involved in the accident
	 * Constructor
	 */
	public Accident(String date, String time, String location, int airFatality, int groundFatality, String summary, Plane plane) 
	{
		String[] dates = date.split("/");
		String day = dates[1];
		String month = dates[0];
		String year = dates[2];
		accidentDate = LocalDate.parse(year + "-" + month + "-" + day);
		
		this.time = time;
		this.location = location;
		this.airFatality = airFatality;
		this.groundFatality = groundFatality;
		this.summary = summary;
		this.plane = plane;
	}
	
	/**
	 * @return String This returns the date of the accident re-ordered to make it more readable 
	 */
	public String getAccidentDate() {
		return accidentDate.getDayOfMonth() + " " + accidentDate.getMonth().toString().toLowerCase() + " " + accidentDate.getYear();
	}
	
	/**
	 * @return int This returns the year of the accident
	 */
	public int getAccidentYear()
	{
		return accidentDate.getYear();
	}

	/**
	 * @param accidentDate This is a String containing the date of the accident
	 */
	public void setAccidentDate(LocalDate accidentDate) {
		this.accidentDate = accidentDate;
	}

	/**
	 * @return String This returns the time of the accident
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time This is a String containing the time of the accident
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return String This returns the location of the accident
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location This is a String containing the location of the accident
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return int This returns the number of fatality in the air from the accident
	 */
	public int getAirFatality() {
		return airFatality;
	}

	/**
	 * @param airFatality This is an int containing the number of fatality in the air from the accident
	 */
	public void setAirFatality(int airFatality) {
		this.airFatality = airFatality;
	}

	/**
	 * @return int This returns the number of fatality on the ground from the accident
	 */
	public int getGroundFatality() {
		return groundFatality;
	}

	/**
	 * @param groundFatality This is an int containing the number of fatality on the ground from the accident
	 */
	public void setGroundFatality(int groundFatality) {
		this.groundFatality = groundFatality;
	}

	/**
	 * @return String This returns the summary of the accident
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * @param summary This is a String containing the summary of the accident
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 * @return Plane This returns the plane object that was involved in the accident
	 */
	public Plane getPlane() {
		return plane;
	}

	/**
	 * @param plane This is a plane object containing the plane that was involved in the accident
	 */
	public void setPlane(Plane plane) {
		this.plane = plane;
	}
	
	/**
	 * @param f This is an enum which is used to select what field to return between air fatality, ground fatality and people aboard the plane
	 * @return int This returns the value from the field specify by the enum that was pass into the method as a parameter
	 */
	public int getValue(Fields f)
	{
		switch(f)
		{
			case AIRFATALITY:
			{
				return airFatality;
			}
			
			case GROUNDFATALITY:
			{
				return groundFatality;
			}
			
			case ABOARD:
			{
				return plane.getAboard();
			}
			
			default:
			{
				return 0;
			}
		}
	} 
	
	/**
	 * @return String This returns a String contains all the information about the accident by displaying all the fields in the accident class 
	 */
	@Override
	public String toString()
	{
		return "Accident report\nDate: " + accidentDate + "\nTime: " + time + "\nLocation: " + location + "\nAir Fatality: " + airFatality + "\nGround Fatality: " 
		+ groundFatality + "\nSummary: " + summary + "\nThe following plane was involve in the accident:\n" + plane.toString();
	}

	/**
	 * @return int This returns a number that represents the outcome of the default comparison of the class and is use for sorting
	 */
	@Override
	public int compareTo(Accident a) {
		
		int num = 0;
		if(this.accidentDate.getYear() != a.accidentDate.getYear())
		{
			if(this.accidentDate.getYear() > a.accidentDate.getYear())
			{
				num = 1;
			}
			else if(this.accidentDate.getYear() < a.accidentDate.getYear())
			{
				num = -1;
			}
		}
		
		else if(this.accidentDate.getMonthValue() != a.accidentDate.getMonthValue())
		{
			if(this.accidentDate.getMonthValue() > a.accidentDate.getMonthValue())
			{
				num = 1;
			}
			else if(this.accidentDate.getMonthValue() < a.accidentDate.getMonthValue())
			{
				num = -1;
			}
		}
		
		else
		{
			if(this.accidentDate.getDayOfMonth() > a.accidentDate.getDayOfMonth())
			{
				num = 1;
			}
			else if(this.accidentDate.getDayOfMonth() < a.accidentDate.getDayOfMonth())
			{
				num = -1;
			}
			else
			{
				num = 0;
			}
		}
		return num;		
	}	
}
