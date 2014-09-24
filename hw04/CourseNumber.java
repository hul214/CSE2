//Huahao Luo
//Lehigh ID: hul214
//Course: CSE 2
//HW04 Program3:CourseNumber
//The semester during which a course is offered at Lehigh is given by a 6 digit number.
//The first four digits give the year, and the last two digits give the semester: 
//10 spring, 20 summer 1, 30 summer 2, and 40 fall. Write a program that reads
//in a 6 digit number, makes sure that it adheres to the above description,
//and then prints out the semester and year.


import java.util.Scanner;
public class CourseNumber
{
    public static void main(String[] args)
    {
        
        Scanner myScanner;
        
        myScanner = new Scanner(System.in);
        System.out.print("Enter a six digit number giving the course semester: ");
        //prompt the user to enter coursenumber
        
        if (myScanner.hasNextInt())
        {
            int CRN = myScanner.nextInt();
            
            if(CRN>=186510 && CRN<=201440)//make sure the coursenumber is within the range
            {
                int Sem=CRN%100;//seperate the year number and semester number
                int year=(CRN-Sem)/100;
                
                if(Sem==10)
                {
                    System.out.println("The course was offered in the Spring of "+year);
                    //10 is for Spring semester
                }
                
                else if(Sem==20)
                {
                    System.out.println("The course was offered in the Summer 1 of "+year);
                }//20 is for Summer 1
                
                else if(Sem==30)
                {
                    System.out.println("The course was offered in the Summer 2 of "+year);
                }//30 is for summer 2
                
                else if(Sem==40)
                {
                    System.out.println("The course was offered in the Fall of "+year);
                }//40 is for Fall Semester
                
                else
                {
                    System.out.println(Sem+" is not a legitimate semester ");
                    return;//leave the program when the error comes up
                }
            }
            
            else
            {
                System.out.println("The number was outside the range [186510,201440]");
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