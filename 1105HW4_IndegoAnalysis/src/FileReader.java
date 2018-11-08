package Indego;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 * This class reads in a file, parses it and adds the data to station objects
 * @author Lucy Kuo
 *
 */
public class FileReader {
	
	/**
	 * A method that read stations file and parses it, construct station variable and add them in an arraylist
	 * @return the arraylist of stations from the data file
	 */
	public ArrayList<Station> readStationsFile() {
		
		ArrayList<Station> station = new ArrayList<Station>();
		ArrayList<Trip> trips = new ArrayList<Trip>(readTripsFile());
		
			try  {
				Scanner scan = new Scanner(new File("indego-stations-2018-8-3.csv"));
				PrintWriter out = new PrintWriter(new File("BikeStationReport.txt"));
				String title = scan.nextLine();
				
			    while (scan.hasNextLine()) {
			    	
			    	//read in each line of the file
			    	String line = scan.nextLine();
			    	
			    	//split the line at the backslash
			    	String[] parts = line.split("/");
			    	
			    	//the station ID (left of the colon) is in index place 0 of the array, its 0-3 characters of the string    	
			    	int stationID = Integer.parseInt(parts[0].substring(0, 4));
			    	String stationName = parts[0].split(",")[1];
			   
			    	//the month and year are in index 1 and 2
			    	int goLiveMonth = Integer.parseInt(parts[1]);
			    	int goLiveYear = Integer.parseInt(parts[2].split(",")[0]);
			    	
			    	String status = parts[2].split(",")[1];
			    	boolean active = true;
			    	
			    	//check the status, if its active, set the boolean value as true
			    	if(status.equalsIgnoreCase("active")) {
			    		active = true;
			    		}else active = false;
			    	
			    	//construct the station with the variables
			    	Station s = new Station(stationID,goLiveMonth, goLiveYear, active, trips);
			    	//add the station in the arraylist
			    	station.add(s);
			    	
			        //print the following data out to a report
			        out.print(stationID);
			    	out.print(",");
			    	out.print(stationName);
			    	out.print(",");
			    	out.print(s.totalTripsOfStation());
			    	out.print(",");
			    	out.print(s.avgDuration());
			    	out.print(",");
			    	out.print(s.maxDuration());
			    	out.print(",");
			    	out.print(s.NumberOfOneWay());
			    	out.print(",");
			    	out.print(s.diffOfStartAndEnd());
			    	out.println();
			    	

			    	
			    }
			    //close reader and writter
			    scan.close();
			    out.close();
			    
			    } catch(Exception e) {
			    	System.out.println("Error reading file ");
			    	e.printStackTrace();
			    }		
			return station;
		}
	
public ArrayList<Trip> readTripsFile() {
		
		ArrayList<Trip> trips = new ArrayList<Trip>();
		
			try  {
				Scanner scan = new Scanner(new File("indego-trips-2018-q2 2.csv"));
				
				String title = scan.nextLine();
				  while (scan.hasNextLine()) {
					  
				    	//read in each line of the file
				    	String line = scan.nextLine();
				    	
				    	
				    	String[] parts = line.split(",");
				    
				    	if(parts.length<= 1) {
				    		 continue;
				    		}

    	
				    	int startStation = Integer.parseInt(parts[4]);
				    	int endStation = Integer.parseInt(parts[7]);
				    
				    	
				    	int month = Integer.parseInt(parts[2].split("-")[1]);
				    	int duration = Integer.parseInt(parts[1]);
				    	
				    	int startTimeHour = Integer.parseInt(parts[2].split(" ")[1].split(":")[0]);
				    	int startTimeMin = Integer.parseInt(parts[2].split(" ")[1].split(":")[1]);
				    	
				    	int endTimeHour = Integer.parseInt(parts[3].split(" ")[1].split(":")[0]);
				    	int endTimeMin = Integer.parseInt(parts[3].split(" ")[1].split(":")[1]);
				    	int endTimeSec = Integer.parseInt(parts[3].split(" ")[1].split(":")[2].substring(0, 2));
				    	
				    	String routeCategory = parts[12];
				    	String passholderType = parts[13];
				    	

			    	Trip t = new Trip(startStation,endStation, passholderType,routeCategory, month, duration, endTimeHour,  
			    			endTimeMin,endTimeSec, startTimeHour, startTimeMin);
			    	trips.add(t);
			    	

			    }
			    scan.close();
			    } catch(Exception e) {
			    	System.out.println("Error reading file ");
			    	e.printStackTrace();
			    }		
			return trips;
		}


}




