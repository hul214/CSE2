//Huahao Luo
//Lehigh ID: hul214
//Course: CSE 2
//HW07 Program: NumberStack
//Write a program that forces the user to enter an integer between 1 and 9,
//inclusive, and then prints out displays that depend on the value entered.
//You should use loops to create each of the three stacks of number. 
//The first stack should be created only using for loops. 
//The second stack should be created only using while loops. 
//The third stack should be created only using do-while loops. 
//Start by writing a program that prints the first stack and get it running. 
//Then it is straightforward to modify a copy of that code (which uses for loops) 
//to write code that uses only while loops. 
//Once you have code that generates the top two stacks you can easily modify
//the code to generate the third diamond that only uses do-while loops.

import java.util.Scanner;//import scanner
public class NumberStack

{
    public static void main(String[] args)
    {
        
        Scanner myScanner;
        myScanner=new Scanner (System.in);//declare scanner
        
        System.out.print("Enter an integer from 1 to 9: ");
        //prompt user to ernter an interger
        
        if(!myScanner.hasNextInt()) 
        {
            System.out.println("Please enter an integer between 1 and 9.");
            return;
        }//make sure user enter an int
        
        int x= myScanner.nextInt();
        
        if(x<1 && x>9)
        {
            System.out.println("Please enter an integer between 1 and 9.");
            return;
        }//make sure user enter an int within the range
        
        
        
        
        System.out.println("Using 'for' loops:");//start coding for loop
        
        int y=x;//this will be used in generating space before each line
        String line="-";//after printing a stack of one number a line is needed
        String space="";//the space before each line is printed
        int PrintNumber=1;//the number goint to be printed in each line
        int PrintCount=1;//
        //define variables
        
        for(int i=0;i<x;i++)
        {
            for (int l=0;l<y;l++)
            {
                space+=" ";
            }//generate spapce before each line
            
            for (int j=0;j<PrintNumber;j++)
            {
                System.out.print(space);//space before each line
                for(int k=0;k<PrintCount;k++)//have the right number of printing in each line
                {
                    System.out.print(PrintNumber);
                }
                System.out.println("");//to next line
            }//print numbers for each stack
            System.out.println(space+line);//print line after the stack
            PrintNumber+=1;
            PrintCount+=2;
            line+="--";
            y--;
            space="";
            //reset counting values and increasment of each counting
        }
        
        
        
        System.out.println("Using 'while' loops:");
        
        y=x;
        line="-";
        space="";
        PrintNumber=1;
        PrintCount=1;
        int i=0, j=0, k=0, l=0;
        
        while(i<x)
        {
            while(l<y)
            {
                space+=" ";
                l++;
            }
            l=0;
            
            while(j<PrintNumber)
            {
                System.out.print(space);
                while(k<PrintCount)
                {
                    System.out.print(PrintNumber);
                    k++;
                }
                k=0;
                System.out.println("");
                j++;
            }
            System.out.println(space+line);
            j=0;
            i++;
            PrintNumber+=1;
            PrintCount+=2;
            line+="--";
            y--;
            space="";
        }
        
        System.out.println("Using 'do-while' loops:");
        y=x;
        line="-";
        space="";
        PrintNumber=1;
        PrintCount=1;
        i=0; 
        j=0;
        k=0;
        l=0;
        do{
            
            do{
                space+=" ";
                l++;
            }while(l<y);
            l=0;

            do{
                System.out.print(space);
                do{
                    System.out.print(PrintNumber);
                    k++;
                    
                }while(k<PrintCount);
                
                k=0;
                System.out.println("");
                j++;
                
            }while(j<PrintNumber);
            
            System.out.println(space+line);
            j=0;
            i++;
            PrintNumber+=1;
            PrintCount+=2;
            line+="--";
            y--;
            space="";
        }while(i<x);
        
    }
}