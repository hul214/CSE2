//Huahao Luo
//Lehigh ID: hul214
//Course: CSE 2
//HW05 Program2:BoolaBoola
//Write a program that has three boolean variables to each of which 
//the value of true or false is randomly assigned. Then, at random, combine 
//the three variables with random choices of && and || and stores the result.
//The program should then present the expression to the user and ask 
//the user to state the result of of the expression.


import java.util.Scanner;
public class BoolaBoola
{
    public static void main(String[] args)
    {
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        double x1=Math.random();//1st t/f    <0.5 true
        double x2=Math.random();//2nd t/f
        double x3=Math.random(); //3rd t/f
        double x4=Math.random();//1st || &&, <0.5 %%
        double x5=Math.random(); //2nd || &&
        
        boolean y1; String z1;
        boolean y2; String z2;
        boolean y3; String z3;
        String y4;
        String y5;
        //boolean y will store the t/f value of further operation
        //string y and z is for print and comparison
        
        if (x1<0.5)
        {
            y1 = true;
            z1 = " true ";
        }
        else
        {
            y1 = false;
            z1 = " false ";
        }
        
        if (x2<0.5)
        {
            y2 = true;
            z2 = " true ";
        }
        else
        {
            y2 = false;
            z2 = " false ";
        }
        
        if (x3<0.5)
        {
            y3 = true;
            z3 = " true ";
        }
        else
        {
            y3 = false;
            z3 = " false ";
        }
        
        if (x4<0.5)
        {
            y4 = " && ";
        }
        else
        {
            y4 = " || ";
        }if (x1<0.5)
        {
            y5 = " && ";
        }
        else
        {
            y5 = " || ";
        }
        //use the random results operated from x to define the T/F value of y and z
        
        System.out.println("Does"+ z1 + y4 + z2 + y5 + z3 +
        "have the value of true(t/T) or false(f/F)? ");
        //prompt the user to enter their respond
        
        String answer1 = myScanner.next();//store the answer as String answer1
        
        boolean answer;
        
        if(answer1.equals("t")||answer1.equals("T"))
        {
            answer = true;
        }
        else if (answer1.equals("f")||answer1.equals("F"))
        {
            answer = false;
        }
        else
        {
            System.out.println("Try again.");
            return;
        }
        //prompt error message if the user didn't enter t/T/f/F
        //define a boolean version of the user's respond: answer
        
        if(y4.equals(" && ")&& y5.equals(" && "))
        {
            boolean answer2 = y1 && y2 && y3;
            if(answer==answer2)
            {
                System.out.println("Correct");
                return;
            }
            else
            {
                System.out.println("Wrong, try again!");
                return;//prompt error message
            }
            
        }
        //let the result of 5 operations be answer2, and compare it with answer
        //if they match, prompt 'Correct'. If not let the user try again
        
        else if(y4.equals(" || ")&& y5.equals(" && "))
        {
            boolean answer2 = y1 || y2 && y3;
            if(answer==answer2)
            {
                System.out.println("Correct");
                return;
            }
            else
            {
                System.out.println("Wrong, try again!");
                return;
            }
            
        }
        //let the result of 5 operations be answer2, and compare it with answer
        //if they match, prompt 'Correct'. If not let the user try again
        
        else if(y4.equals(" && ")&& y5.equals(" || "))
        {
            boolean answer2 = y1 && y2 || y3;
            if(answer==answer2)
            {
                System.out.println("Correct");
                return;
            }
            else
            {
                System.out.println("Wrong, try again!");
                return;
            }
            
        }
        //let the result of 5 operations be answer2, and compare it with answer
        //if they match, prompt 'Correct'. If not let the user try again
        
        else if(y4.equals(" || ")&& y5.equals(" || "))
        {
            boolean answer2 = y1 || y2 || y3;
            if(answer==answer2)
            {
                System.out.println("Correct");
                return;
            }
            else
            {
                System.out.println("Wrong, try again!");
                return;
            }
            
        }
        //let the result of 5 operations be answer2, and compare it with answer
        //if they match, prompt 'Correct'. If not let the user try again
        
    }
}//end of program