//Huahao Luo
//Lehigh ID: hul214
//Course: CSE 2
//HW06 Program1: Root
//Write a Java program that forces the user to enter a double 
//that is greater than 0, uses the above algorithm to compute the square root 
//of the number, and then prints it out. Use 0.0000001 as the “tolerance” for 
//stopping the loop that computes the square root.

import java.util.Scanner;
public class Root
{
    public static void main(String[] args)
    {
        
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        
        System.out.println("Enter a positive number, and this program "+
        "will find the square root of this number: ");
        //prompt the user to enter a positive double to find the square root of 
        
        double X;
        
        if(myScanner.hasNextDouble()) 
        {
            X=myScanner.nextDouble();
        }
        else
        {
            System.out.println("Please enter a positive double.");
            return;
        }
            
        if(X<0)
        {
            System.out.println("Please enter a positive double.");
            return;
        }
        //make sure the user enter the right input
        
        double high=X+1;
        double low=0;
        double mid = (X+1)/2;
        double tolerance=0.0000001*(1+X);
        
        while ((high-low)>tolerance)
        {
            if ((mid*mid)>X)
            {
                high=mid;
            }
            else
            {
                low=mid;
            }
            mid=(high+low)/2;
        }
        //find the square root.
        System.out.printf("the square root of the number "+X+" is approximately %3.2f \n"
        , mid);
        //print out the approximate square root 'mid'.
    }
}