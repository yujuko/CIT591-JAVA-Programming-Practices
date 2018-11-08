package Indego;

import java.util.ArrayList;

/**
 * A class that represents a station in the data
 * @author lucykuo
 *
 */
public class Station {
	
	//instance variable
	private int stationID;
	private int goLiveMonth;
	private int goLiveYear;
	private Boolean active;
	private ArrayList<Trip> trips;
	
	//constructor
	Station(int id, int month, int year, boolean active,ArrayList<Trip> trips){
		this.stationID = id;
		this.goLiveMonth = month;
		this.goLiveYear = year;
		this.active =active;
		this.trips = trips;
	}

	/**
	 * A method that return the ID of the station
	 * @return the ID of the station
	 */
	public int getStationID() {
		return stationID;
	}

	/**
	 * A method that return the go-live month of the station
	 * @return the go-live month of the station
	 */
	public int getGoLiveMonth() {
		return goLiveMonth;
	}

    /**
     * A method that return the go-live year of the station
     * @return the go-live year of the station
     */
	public int getGoLiveYear() {
		return goLiveYear;
	}

    /**
     * A method that return if a station is active or not
     * @return ture/false if a station is active
     */
	public Boolean getActive() {
		return active;
	}

    /**
     * A method that counts the total trips of a station 
     * @return total trips of a station
     */
	public int totalTripsOfStation() {
		int count = 0;
		for(Trip t : trips) {
			//check if the end station date is missing
			if(t.getEndStation()<5000) {
				if(stationID== t.getStartStation()) {
					count++;
				}
			}
		}
		return count;
	}
	/**
	 * A method that return the average of duration of trips
	 * @return the average of trips' duration 
	 */
	public int avgDuration() {
		int time = 0;
		int count =0;
		if (totalTripsOfStation()!= 0) {
			for(Trip t : trips) {
				if(stationID== t.getStartStation()) {
					time += t.getDuration();
					count ++;
				}
			}
		}
		if (count!=0)
		return time/count;
		else return 0;
	}
	
	/**
	 * A method that return the number of one way trips of that station
	 * @return the number of one way trips of that station
	 */
	public int NumberOfOneWay() {
		int count=0;
		for(Trip t : trips) {
			if(stationID== t.getStartStation()) {
				if(t.getrouteCategory().equalsIgnoreCase("\"One Way\"")) {
					count++;
				}
			}
		}
		return count;
	}
	/**
	 * A method that return the max duration of the station
	 * @return the max duration of the station
	 */
	public int maxDuration() {
			int max = 0;
				for(Trip t : trips) {
					if(stationID== t.getStartStation()) {
						if(t.getDuration()>max) {
							max = t.getDuration();			
					}
				}
				}
			return max;
	}
				
	/**
	 * A method that return the difference of trips started and ended at the station
	 * @return the difference of trips started and ended at the station
	 */
	public int diffOfStartAndEnd() {
		int start = 0;
		int end = 0;
		for(Trip t : trips) {
			if(t.getEndStation()<5000) {
			if(stationID== t.getStartStation()) {
				start++;
			}
			if(stationID== t.getEndStation()) {
				end++;
			}
		}
		}
		if(start>end) return start-end;
		else if(start<end) return end-start;
		else return 0;
	}
		

	}
	
	
