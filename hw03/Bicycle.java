//Huahao Luo
//Lehigh ID: hul214
//Course: CSE 2
//HW03 Program1:Bicycle

//Write a program that prompts the user to enter two digits, 
//the first giving the number of counts on a cyclometer
//and the second giving the number of seconds during which
//the counts occurred, and then an then prints out the distance
//traveled and the average miles per hour. 
//Your program should assume the diameter of the wheel is 27 inches. 

import java.util.Scanner;
//In order to use the Scanner class, it must first imported
//otherwise the compiler will generate error messages.
//The import statement must be the first statement in the program after comments.
public class Bicycle
{
    public static void main(String[] args)
    {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter the number of counts: ");
        int counts = myScanner.nextInt();
        
        System.out.print("Enter the number of seconds taken: ");
        //prompt the user to enter the time taken in seconds
        int timeS = myScanner.nextInt();
        //define the variable of time in seconds
        
        double wheelDiameter=27.0;
        //this is the diameter of the wheel
        double PI=3.14159;
        //this is the constant pi
        double feetPerMile=5280;
        //5280 feet is 1 mile
        double inchesPerFoot=12;
        //12 inches is 1 foot
        double secondsPerMinute=60;
        //60sec per minutes
        
        double distance = counts*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        double timeM = timeS/60;
        //the time in minutes is the time in seconds divided by 60
        double speed = distance/(timeM/60);
        //mph equals to distance travelled in miles, divided by the hour taken,
        //which is the number of minutes divided by 60
        
        int wholedistance=(int)distance;
        int digit1distance=(int)(distance*10)%10;
        int digit2distance=(int)(distance*100)%10;
        //these lines will record the distance travelled to 2 decimal places
        
        int wholetime=(int)timeM;
        int digit1time=(int)(timeM*10)%10;
        int digit2time=(int)(timeM*100)%10;
        //these lines will record the time taken in minutes to 2 decimal places
        
        int wholespeed=(int)speed;
        int digit1speed=(int)(speed*10)%10;
        int digit2speed=(int)(speed*100)%10;
        //these will record the average speed in mph to 2 decimal places
        
        
        System.out.println("The distance was "+ wholedistance+"."+digit1distance
        +digit2distance+" miles and took "+wholetime+'.'+digit1time+digit2time
        +" minutes");
        //print to the screen the distance and time taken
        
        System.out.println("The average mph was "+wholespeed+'.'
        +digit1speed+digit2speed);
        //print to the screen the average speed
    }
}//end of program