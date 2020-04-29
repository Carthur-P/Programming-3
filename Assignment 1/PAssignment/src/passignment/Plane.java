package passignment;

/**
 * @author Carthur Pongpatimet (1000026069)
 * This class holds all the information about a plane
 */
public class Plane{

	/**
	 * This is the field holding the operator of the plane
	 */
	private String operator;
	/**
	 * This is the field holding the flight number of the plane
	 */
	private String flightNumber;
	/**
	 * This is the field holding the route that the plane was schedule to fly 
	 */
	private String route;
	/**
	 * This is the field holding the type of the plane
	 */
	private String type;
	/**
	 * This is the field holding the registration number of the plane
	 */
	private String registration;
	/**
	 * This is the field holding the serial number of the plane
	 */
	private String serialNumber;
	/**
	 * This is the field holding the amount of people that was aboard the plane
	 */
	private int aboard;
	
	/**
	 * @param operator This is a String containing the operator of the plane
	 * @param flightNumber This is a String containing the flight number of the plane
	 * @param route This is a String containing the route that the plane was schedule to fly
	 * @param type This is a String containing the type of the plane
	 * @param registration This is a String containing the registration number of the plane
	 * @param serialNumber This is a String containing the serial number of the plane
	 * @param aboard This is an int containing the amount of people that was aboard the plane
	 * Constructor
	 */
	public Plane(String operator, String flightNumber, String route, String type, String registration, String serialNumber, int aboard)
	{
		this.operator = operator;
		this.flightNumber = flightNumber;
		this.route = route;
		this.type = type;
		this.registration = registration;
		this.serialNumber = serialNumber;
		this.aboard = aboard;
	}
	
	/**
	 * @return String This returns the operator of the plane
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * @param operator This is a String containing the operator of the plane
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

	/**
	 * @return String This returns the flight number of the plane
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * @param flightNumber This is a String containing the flight number of the plane
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * @return String This returns the route that the plane was schedule to fly
	 */
	public String getRoute() {
		return route;
	}

	/**
	 * @param route This is a String containing the route that the plane was schedule to fly
	 */
	public void setRoute(String route) {
		this.route = route;
	}

	/**
	 * @return String This returns the type of the plane
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type This is a String containing the type of the plane
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return String This returns the registration of the plane
	 */
	public String getRegistration() {
		return registration;
	}

	/**
	 * @param registration This is a String containing the registration number of the plane
	 */
	public void setRegistration(String registration) {
		this.registration = registration;
	}

	/**
	 * @return String This returns the serial number of the plane
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @param serialNumber This is a String containing the serial number of the plane
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * @return int This returns the number of people that was aboard the plane
	 */
	public int getAboard() {
		return aboard;
	}

	/**
	 * @param aboard This is an int containing the amount of people that was aboard the plane
	 */
	public void setAboard(int aboard) {
		this.aboard = aboard;
	}
	
	/**
	 * @return String This returns a String contains all the information about the plane by displaying all the fields in the plane class 
	 */
	@Override
	public String toString()
	{
		return "Operator: " + operator + "\nFlight Number: " + flightNumber + "\nRoute: " + route + "\nType: " + type + "\nRegistration: "
		+ registration + "\nSerial Number: " + serialNumber + "\nPeople Aboard: " + aboard + "\n";
	}
}
