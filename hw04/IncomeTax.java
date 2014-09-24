//Huahao Luo
//Lehigh ID: hul214
//Course: CSE 2
//HW04 Program1:IncomeTax
//Write a program that prompts the user to enter an int that gives
//the thousands of dollars of income and then writes out the amount of tax
//on the income

import java.util.Scanner;
public class IncomeTax
{
    public static void main(String[] args)
    {
        
        Scanner myScanner;
        
        int income;//declear the variables
        int taxrate;
        int incometax;
        
        myScanner = new Scanner(System.in);
        System.out.print("Enter an int giving the number of thousands: ");
        //prompt the user to enter their income
        
        if (myScanner.hasNextInt())//make sure the user entered an int
        {
            income= myScanner.nextInt();
            
            if (income>0)//make sure it's a positive int
            {
                if (income<20)//if the income is less than 20k, the tax rate is 5%
                {
                    taxrate = 5;
                    incometax = income*1000*taxrate/100;
                    System.out.println("The tax rate on $"+income+",000 is "+taxrate+
                    "%, and the tax is $"+incometax);//prints the income, tax rate, and tax to the screen
                }
                else if (income<40)
                {
                    taxrate = 7;//if the income is less than 40k and bigger or equal to 20k, the tax rate is 7%
                    incometax = income*1000*taxrate/100;
                    System.out.println("The tax rate on $"+income+",000 is "+taxrate+
                    "%, and the tax is $"+incometax);//prints the income, tax rate, and tax to the screen
                }
                else if (income<78)
                {
                    taxrate = 12;//if the income is less than 78k and bigger or equal to 40k, the tax rate is 12%
                    incometax = income*1000*taxrate/100;
                    System.out.println("The tax rate on $"+income+",000 is "+taxrate+
                    "%, and the tax is $"+incometax);//prints the income, tax rate, and tax to the screen
                }
                else if (income>=78)
                {
                    taxrate = 14;//if the income is bigger than 78k, the tax rate is 14%
                    incometax = income*1000*taxrate/100;
                    System.out.println("The tax rate on $"+income+",000 is "+taxrate+
                    "%, and the tax is $"+incometax);//prints the income, tax rate, and tax to the screen
                }
            }
            
            else
            {
                System.out.println("You didn't enter a positive integer.");//tell the user error
                return;//leave the program when the error comes up
            }
        }
        
        else
        {
            System.out.println("You didn't enter an int.");//tell the user error
            return;//leave the program when the error comes up
        }
    }
}