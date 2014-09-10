//Huahao Luo
//Lehigh ID: hul214
//Course: CSE 2
//Prof. Chen's bicycle cyclometer (meant to measure speed, distance, etc.)
//records two kinds of data, the time elapsed in seconds, and the 
//number of rotations of the front wheel during that time.
//For two trips, given time and rotation count, this program should
//a. print the number of minutes for each trip
//b. print the number of counts for each tirp
//c. print the distance of each trip in miles
//d. print the distance for the two trips combined

public class Cyclometer {
// main method required for every Java program
    public static void main(String[] args) {
        
        int secsTrip1=480;
        // this is the time spent on trip 1
        int secsTrip2=3220;
        //this is the time spent on trip 2
        int countsTrip1=1561;
        //this is the # of front wheel rev for trip 1
        int countsTrip2=9037;
        //this is the # of front wheel rev for trip 2
        
        // our intermediate variables and output data. Document!
        double wheelDiameter=27.0;
        //this is the diameter of the wheel
        double PI=3.14159;
        //this is the constant pi
        double feetPerMile=5280;
        //5280 feet is 1 mile
        double inchesPerFoot=12;
        //12 inches is 1 foot
        double secondsPerMinute=60;
        //60 seconds is 1 minute
        double distanceTrip1, distanceTrip2,totalDistance;
        //this step will define 3 variables that the program should calculate
        
        System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts.");
        
        System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+
        countsTrip2+" counts.");
        
        //run the calculations; store the values. Document your
        //calculation here. What are you calculating?
        //
        //distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        
        distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile ;
        //this will calculate the distance travelled for trip 1
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile ;
        //this will calculate the distance travelled for trip 1
        totalDistance=distanceTrip1+distanceTrip2 ;
        //this will calculate the total distance travelled
        
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        //these 3 lines will calculate all the result that the program
        //is looking for, then print them out to the screen.
        
    } //end of main method
} //end of class
