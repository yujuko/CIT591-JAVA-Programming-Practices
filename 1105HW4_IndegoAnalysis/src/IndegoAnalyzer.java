package Indego;

import java.util.ArrayList;
/**
 * This class does the analysis of both Trips and Station files. 
 * It answers questions based on the files data
 * @author lucykuo
 *
 */
public class IndegoAnalyzer {

	public static void main(String[] args) {
	
		//create two fileReader with two names
		FileReader fr = new FileReader();
		
		//read stations and trips file and save them into two arraylist
		ArrayList<Station> station = fr.readStationsFile();	
		ArrayList<Trip> trips = fr.readTripsFile();
		
		System.out.println("How many Active stations were there in the second quarter of 2018? ");
		System.out.println(stationActive(station)+ " stations.");
		
		System.out.println();
		
		System.out.println("How many stations that had a Go-Live Date in 2017 are still Active?");
		System.out.println(goLiveAndActive(station)+ " stations.");
				
		System.out.println();		
		
		System.out.println("How many trips originated at Amtrak 30th Street Station?");
		System.out.println(originatedAtAmtrak(trips)+ " stations.");
		
		System.out.println();
		
		System.out.println("What was the most popular month for walk ups?");
		System.out.println(mostPopularMonth(trips));
		
		System.out.println();
		
		System.out.println("What is the average duration of a bike rental?");
		System.out.println(averageDuration(trips)+ " minutes");
		
		System.out.println();
		
		System.out.println("How many trips started and completed between 10am and 1pm?");
		System.out.println(startAndEndTime(trips)+ " trips");	
		
		System.out.println();
		
		System.out.println("Which year has the most bikes Go-Live in?");
		System.out.println(yearOfMostGoLive(station)+ " ");	
				
	}
	
	/**
	 * A method that analyze how many stations are still active.
	 * @param station that need to be analyzed
	 * @return the number of active stations
	 */
	public static int stationActive(ArrayList<Station> station){
		int count = 0;	
		//check every station in the arraylist 
		for(Station s :station ) {			
		//if its active, increase count
		if(s.getActive()==true) {
			count++;
		}
	    }
		return count;
	}
	
	/**
	 * A method that analyze how many stations that had a Go-Live Date in 2017 are still Active.
	 * @param station that need to be analyzed
	 * @return the number of active stations that had a Go-Live Date in 2017
	 */
	public static int goLiveAndActive(ArrayList<Station> station) {
		int count = 0;
		//check every station in the arraylist 
		for(Station s :station ) {
			//if its active and go-live in 2017, increase count
			if(s.getGoLiveYear()==2017) {
				if(s.getActive()==true) {
				count++;
			    }
				}
		}
		return count;
		}
	
	/**
	 * A method that analyze how many trips originated at Amtrak 30th Street Station
	 * @param trip the arraylist of trips that needed to be analyzed
	 * @return the number of trips originated at Amtrak 30th Street Station
	 */
	public static int originatedAtAmtrak(ArrayList<Trip> trip) {
		int count = 0;
		//check every trip in the arraylist 
		for(Trip t : trip ) {
			//if it started at station 3022 ( Amtrak 30th Street), increase the count
			if(t.getStartStation()==3022) {
				count++;
			}
		}
		return count;
		
	}
	
	/**
	 * A method that analyze what was the most popular month for walk ups.
	 * @param trip the arraylist of trips that needed to be analyzed
	 * @return the month that was the most popular for walk ups
	 */
	public static String mostPopularMonth(ArrayList<Trip> trip) {
		int apr=0;
		int may=0;
		int jun=0;
		//check every trip in the arraylist 
		for(Trip t : trip ) {
			//if it's "Walk up", check which month it was in, and increase the count
			if(t.getPassholderType().equals("\"Walk-up\"")) {
				switch (t.getMonth()){
					case 4:
						apr ++;
						break;
					case 5:
						may++;
						break;
					case 6:
						jun++;
						break;
				}		
			}
		}
		//save the biggest one in max variable
		int max = Math.max(apr, Math.max(may, jun));
		
		//return the String of the month
	    if (max == apr)
	    	return "April";
	    else if (max == may)
	    	return "May";
	    else return "June";
	}
	    
	/**
	 * A method that analyze the average duration of a bike rental.
	 * @param trip the arraylist of trips that needed to be analyzed
	 * @return the average duration of a bike rental
	 */
	public static int averageDuration(ArrayList<Trip> trip) {
		int total = 0;
		int count = 0;
		//check every trip in the arraylist 
		for(Trip t : trip ) {
			//add up the duration
			total += t.getDuration();
			//increase count by one
			count++;
		}
		return total/count;
	}
	
	/**
	 * A method that analyze how many trips started and completed between 10am and 1pm.
	 * @param trip the arraylist of trips that needed to be analyzed
	 * @return the number of trips that started and completed between 10am and 1pm
	 */
	public static int startAndEndTime(ArrayList<Trip> trip) {
		int count =0;
		for(Trip t : trip ) {
			//check if the end station data is missing.
			//if it is , the station ID would be more than 4000 (like 90000)
			if(t.getEndStation()<4000) {
				
			   //check if the start and end number is between 10 and 13
			   if (t.getStartTimeHour()>=10) {
				 if(t.getEndTimeHour()<13) {
					count ++;
				 }
				 //check if it is 13:00:00
				 if(t.getEndTimeHour()==13 && t.getEndTimeMin()==0 && t.getEndTimeSec()==0) {
					count ++;
				 }
			   }
			}
		}
		return count;
	}
	
	/**
	 * A method that analyze the year when most bike go-live.
	 * @param station that needed to be analyzed
	 * @return the year that the most bikes go-live
	 */
	public static int yearOfMostGoLive(ArrayList<Station> station) {
		int fifteen =0;
		int sixteen =0;
		int seventeen =0;
		int eighteen =0;
		
		    //check if the go-live year is 2015/ 2016/ 2017/ 2018 and increase it's count
			for(Station s : station ) {
				switch(s.getGoLiveYear()){
				case 2015:
					fifteen++;
					break;
				case 2016:
					sixteen++;
					break;				
				case 2017:
					seventeen++;
					break;
				case 2018:
					eighteen++;
					break;
				}
			}
		//save the biggest one in the max variable
		int max= Math.max(fifteen, Math.max(sixteen, Math.min(seventeen, eighteen)));
		
		//return the int of the year
		if(max == fifteen)
			return 2015;
		else if (max == sixteen)
			return 2016;
		else if (max == seventeen)
			return 2017;
		else return 2018;
	    }

}
