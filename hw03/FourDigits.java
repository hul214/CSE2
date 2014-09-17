//Huahao Luo
//Lehigh ID: hul214
//Course: CSE 2
//HW03 Program3:FourDigits

//Write a program that prompts the user to enter a double and 
//then prints out the first four digits to the right of the decimal point

import java.util.Scanner;
//In order to use the Scanner class, it must first imported
//otherwise the compiler will generate error messages.
//The import statement must be the first statement in the program after comments.
public class FourDigits
{
    public static void main(String[] args)
    {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter a double and this program will display the four digits to the right of the decimal point ");
        double input=myScanner.nextDouble();
        //this will prompt the user to enter a double and,
        //the variale 'input' will be any double number 
        //the user put in the program
        
        int digit1=(int)(input*10)%10;
        //this will obtain the 1st digit to the right of the decimal point
        int digit2=(int)(input*100)%10;
        //this will obtain the 2nd digit to the right of the decimal point
        int digit3=(int)(input*1000)%10;
        //this will obtain the 3rd digit to the right of the decimal point
        int digit4=(int)(input*10000)%10;
        //this will obtain the 4th digit to the right of the decimal point
        
        System.out.println("The four digits are "+digit1+digit2+digit3+digit4);
        //this line will print out the result to the screen
    }
}//end of program