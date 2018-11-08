package Indego;
/**
 * A class that represents a trip in the data file
 * @author lucykuo
 *
 */

public class Trip {
	
	//instance variable
	private int startStation;
	private int endStation;
	private String passholderType;
	private int month;
	private int duration;
	private int endTimeHour;
	private int endTimeMin;
	private int endTimeSec;
	private int startTimeHour;
	private int startTimeMin;
	private String routeCategory;
	

	/**
	 * Construct a trip 
	 * @param startStation
	 * @param endStation
	 * @param passholderType
	 * @param month
	 * @param duration
	 * @param endTimeHour
	 * @param endTimeMin
	 * @param endTimeSec
	 * @param startTimeHour
	 * @param startTimeMin
	 */
	//constructer
	public Trip(int startStation,int endStation, String passholderType,String routeCategory, int month, int duration, int endTimeHour, int endTimeMin,int endTimeSec,
			int startTimeHour, int startTimeMin) {
		super();
		this.startStation = startStation;
		this.endStation = endStation;
		this.passholderType = passholderType;
		this.routeCategory = routeCategory;
		this.month = month;
		this.duration = duration;
		this.endTimeHour = endTimeHour;
		this.endTimeMin = endTimeMin;
		this.endTimeSec = endTimeSec;
		this.startTimeHour = startTimeHour;
		this.startTimeMin = startTimeMin;
	}

	//methods: 
	/**
	 * A method that return the start station of the trip
	 * @return the start station of the trip
	 */
	public int getStartStation() {
		return startStation;
	}
    /**
     * A method that return the end station of the trip
     * @return the end station of the trip
     */
	public int getEndStation() {
		return endStation;
	}
	
	/**
	 * A method that return the passholder type of the trip
	 * @return the passholder type of the trip
	 */
	public String getPassholderType() {
		return passholderType;
	}
	/**
	 * A method that return the route category of the trip
	 * @return the route category of the trip
	 */
	public String getrouteCategory() {
		return routeCategory;
	}
    /**
     * A method that return the month of the trip
     * @return the month of the trip
     */
	public int getMonth() {
		return month;
	}
	
    /**
     * A method that return the duration of the trip
     * @return the duration of the trip
     */
	public int getDuration() {
		return duration;
	}
    /**
     * A method that return the hour when the trip ended
     * @return the hour when the trip ended
     */
	public int getEndTimeHour() {
		return endTimeHour;
	}
    /**
     * A method that return the minute when the trip ended
     * @return the minute when the trip ended
     */
	public int getEndTimeMin() {
		return endTimeMin;
	}
	/**
	 * A method that return the second when the trip ended
	 * @return the second when the trip ended
	 */
	public int getEndTimeSec() {
		return endTimeSec;
	}
    /**
     * A method that return the hour when the trip started
     * @return the hour when the trip started
     */
	public int getStartTimeHour() {
		return startTimeHour;
	}
    /**
     * A method that return the minute when the trip started
     * @return the minute when the trip started
     */
	public int getStartTimeMin() {
		return startTimeMin;
	}
	
	
	
	
	

}
