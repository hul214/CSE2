//Huahao Luo
//Lehigh ID: hul214
//Course: CSE 2
//HW03 Program2:Month
//Write a program that prompts the user to enter an integer for the month 
//(1 for January, 2 for February, etc.)  and then displays the number of days 
//in the month).  If the number 2 is entered (February) the user is then 
//asked to enter the year. Make sure that the user enters an integer for the 
//month and that the integer is in the required range. Similarly, if the year 
//is requested, ensure that an int is entered, and that the int is positive. 

import java.util.Scanner;
public class Month
{
    public static void main(String[] args)
    {
        
        Scanner myScanner;
        
        int nMonth;
        int nDays=0;
        int year;
        int determinant100;
        int determinant400;
        int determinant4;
        //declare different variable
        
        myScanner=new Scanner(System.in);
        System.out.print("Enter an int giving the number of the month (1-12): ");
        
        if (myScanner.hasNextInt())//make sure it's an int
        {
            nMonth=myScanner.nextInt();
            
            if (nMonth<=12&&nMonth>=1)// make sure the number entered is between 1 and 12
            {
                if (nMonth==1)//Jan. has 31 days
                {
                    nDays=31;
                }
            
                if (nMonth==2)//things are complicated for Feb.
                {
                    myScanner=new Scanner(System.in);
                    System.out.print("Please enter the year: ");//prompt the user to enter the year
                    year=myScanner.nextInt();
                
                    determinant100=year%100;// the rule for "xx00" years is different from any other years
                
                    if(determinant100==0)
                    {
                        determinant400 = year%400;
                        //if the 'xx00' can be divided by 400, there are 29 days in the Feb of that year
                        if (determinant400==0)
                        {
                            nDays=29;
                        }
                        else
                        {
                            nDays=28;//other than that there are 28 days only
                        }
                    }
                    else//for any other years, if the year is a multiple of 4, there are 29 days in that Feb
                    {
                        determinant4 = year%4;
                        if (determinant4==0)
                        {
                        nDays=29;
                        }
                        else
                        {
                            nDays=28;
                        }
                    
                    }   
                
                }
                if (nMonth==3)
                {
                    nDays=31;
                }
                else if (nMonth==4)
                {
                    nDays=30;
                }
                else if (nMonth==5)
                {
                    nDays=31;
                }
                else if (nMonth==6)
                {
                    nDays=30;
                }
                else if (nMonth==7)
                {
                    nDays=31;
                }
                else if (nMonth==8)
                {
                    nDays=31;
                }
                else if (nMonth==9)
                {
                    nDays=30;
                }
                else if (nMonth==10)
                {
                    nDays=31;
                }
                
                else if (nMonth==11)
                {
                    nDays=30;
                }
                
                else if (nMonth==12)
                {
                    nDays=31;
                }
            
                System.out.println("There are "+ nDays +" days in the month.");
            
                //print to the screen the result
            }
            else
            {
                System.out.println("You didn't enter an integer from 1 to 12.");
            return;//leave the program when the error comes up
            }

        }
        
        else
        {
            System.out.println("You didn't enter an integer");
            return;//leave the program when the error comes up
        }
        
        
    }
}