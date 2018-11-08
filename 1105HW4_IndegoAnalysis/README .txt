
README for CIT591 HW4 - Part 2
-------------------------------------------
-------------------------------------------
Author: Lucy Kuo
Date: 11/06/18
IDE: Eclipse
Version: Photon Release (4.8.0)
-------------------------------------------
-------------------------------------------

Purpose: write a program in Java to read, analyze, and summarize Indego Bike Share Data

Use the Indego Bike Share Data on bike rentals and trips in Philadelphia. write a program in Java to read, analyze, and summarize the information


Design:
Firstly, we create a station class with the station's name, ID go-live year/month/date , and if it's still active, also we need an array list of trips to analyze. 
In this class, there are methods that help to analyze the total trips of station, average duration of station, number of one-way trips, max duration, difference of trips that started and ended at the station. Those data will be printed out to a report.


Secondly, we create a Trip class with the start, end station , month, start and end time as well as the pass holder type and route category of the trip. There are also getters for each variables.

Third, we need a file reader to read both trips and stations files , the file reader has a String name as its instance variable. There are readStationsFile and readTripsFile methods. In this two method, two files will be read in , parsed and save to variables that need to construct station and trip objects. Both will return an array list .

However, in the readStationsFile method. There is also a writter. Which will print out analysis of stations into a report named "BikeStationReport.txt".
Finally, we implement a IndegoAnalyzer class to run the project. We need to construct a file reader, and use readStationsFile, readTripsFile to create arraylists. Then we call the methods which help us to analyze the data and answer questions.

----------------------------------------------------------------------------------------
Executes:

How many Active stations were there in the second quarter of 2018? 
130 stations.

How many stations that had a Go-Live Date in 2017 are still Active?
19 stations.

How many trips originated at Amtrak 30th Street Station?
3245 stations.

What was the most popular month for walk ups?
April

What is the average duration of a bike rental?
21 minutes

How many trips started and completed between 10am and 1pm?
25620 trips

Which year has the most bikes Go-Live in?
2015 
