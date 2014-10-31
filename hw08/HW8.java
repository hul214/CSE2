//Huahao Luo
//Lehigh ID: hul214
//Course: CSE 2
//HW08 Program: HW8.java
//In the program below I call on three different overloaded versions of getInput(). 
//(Overloaded methods are two or more methods that have the same name but that take different numbers or types of parameters).
//You should add the definitions of the methods so that the program would produce the output (for the corresponding input) shown below the program. 

//1. Calls like getInput(scan,”dEf”) should force the user to enter a string 
   //from the keyboard that is exactly one character long and that is one of the 
   //characters in the string “dEf”, and it should return the character entered. 
//2. Calls like getInput(scan,”abc”,7) should try to force the user to enter a 
   //string that consists of exactly one character and is one of the characters 
   //in the string “abc”, and it should return the character entered, but it 
   //should give up and return the character ‘ ‘ if the user fails to enter 
   //one of the required characters after 7 attempts. 
//3. Calls like getInput(scan,”Prompt: “,”059”) should use the string “Prompt:",
   //should force the user to enter a string with exactly one character that is one
   //of the characters in the string “059”, and should return the character entered.  
   //The phrase “force the user” means that the program should repeatedly prompt 
   ///the user until the user enters the correct input. 

import java.util.Scanner;
public class HW8
{
    public static void main(String []arg)//this is the main method
    {
    	char input;//declare variable
    	Scanner myScanner=new Scanner(System.in);//declare Scanner
    	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");//Prompt the user to enter c or C to continue
    	input=getInput(myScanner,"Cc");//obtain result from method 1
    	System.out.println("You entered '"+input+"'");//print out what the user have entered
    	
    	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");//Prompt the user to enter one of Y,y,N,n to continue
    	input=getInput(myScanner,"yYnN",5); //give up after 5 attempts
    	if(input!=' ')
    	{
        	System.out.println("You entered '"+input+"'");//print out the valid input
    	}
    	input=getInput(myScanner,"Choose a digit.","0123456789");//prompt the user to enter a digit from 0123456789
    	System.out.println("You entered '"+input+"'");//print out the digit that the user entered.
        
    }

    public static char getInput(Scanner myScanner, String range)//this is "getInput" method 1
    {
        String X=myScanner.next();//let the user's input be X
        int n=0;//define an interger n for counting
        char input=' ';//and two character: input and compare
        
        while (input==' ')
        {
            while (X.length()!=1)//check if X is 1 character lenth
            {
                System.out.print("You should enter exactly one character.-");//prompt error message
                X=myScanner.next();//prompt the user to enter another value for X
            }
            
            while(n<range.length())//this while loop will check if the input is equal to any character within the range.
            {
                if(X.charAt(0)==range.charAt(n))//if X is within the range, the "input" will be changed to the value of X
                {
                    input = range.charAt(n);
                    break;
                }
                n++;
            }
            
            if (input!=' ')//jump out of the loop if the X is within the range, which leads to the change of input
            {
                break;
            }
            
            else//otherwise, prompt the user to enter another value for X
            {
                System.out.print("You did not enter a character from the list '"+range+"' try again: ");
                X=myScanner.next();
                n=0;//reset n value
            }
            
        }
        return input;//return the input value to the main mathod
    }

    public static char getInput(Scanner myScanner, String range, int limit)//this is "getInput" method 2
    {
        String X=myScanner.next();
        int n=0, m=1;//n for counting number of values in the range, and m is counting the number of wrong input
        char input=' ';
        
        while (m<=limit)
        {
            while(X.length()!=1)//the same usage as in method 1
            {
                System.out.print("You should enter exactly one character.");
                m++;
                X=myScanner.next();
                if(m>=limit && X.length()!=1)
                {
                    System.out.println("you failed after "+limit+" times.");//prompt error message that the user have entered wrong input more than limit times.
                    break;
                }
            }
            
            while (n<range.length()&&m<=limit)//another condition to run this loop is checking if the number of wrong input is within the limit.
            {
                if(X.charAt(0)==range.charAt(n))
                {
                    input=range.charAt(n);
                    break;
                }
                n++;
            }
            
            if(input==' '&&m<=limit)//prompt the user to enter anther value fo X
            {
                System.out.print("You did not enter a character from the list '"+range+"' try again: ");
                m++;
                X=myScanner.next();
                n=0;
            }
            else
            {
                break;//jump out of the program when there is a valid input.
            }
            
            if(m>=limit&&input==' ')//if the number of wrong input exceeds the limit, tell the user he/she has exceeds the number of wrong input limit
            {
                System.out.println("you failed after "+limit+" times.");
                break;
            }
            
        }
        return input;//return input value to main method
    }
    
    public static char getInput(Scanner myScanner, String prompt, String range)//this is "getInput" method 3
    {
        int n=0;
        int m=0;
        char replace;//this is the tool to accumulate different values into the prompt message
        char compare=' ';
        char input=' ';
        String output="";//this is the prompt message that would be prompted to the screen
        
        while(n<range.length())//first of all, formulate the promt message that would go to the screen.
        {
            replace=range.charAt(n);
            output=output+"'"+replace+"',";
            n++;
        }
        
        while(input==' ')
        {
            System.out.println(prompt);
            System.out.print("Enter one of: "+output);//prompt the "prompt" message to the screen
              
            String X=myScanner.next();//get input from user
            while(X.length()!=1)//check the X is of a length of 1
            {
                System.out.println("Enter exactly one character.");//error message
                System.out.println(prompt);
                System.out.print("Enter one of: "+output);//prompt the user to enter another one
                X=myScanner.next();
            }
          
            while (m<range.length())//checking if the X value matches any of the values in range
            {
                if(X.charAt(0)==range.charAt(m))
                {
                    input=range.charAt(m);
                    break;
                }
                m++;
            }
      
            if (input==' ')//if X does't not match any value of the range,prompt error message, and force the user to enter another value for X
            {
                System.out.println("You did not enter an acceptable character.");
                m=0;//reset the value for m
            }
            else
            {
                break;//jump out of the program if there is a match.
            }
        }
        return input;//return the input value
    }
}
