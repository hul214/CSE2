//Huahao Luo
//Lehigh ID: hul214
//Course: CSE 2
//HW03 Program2:Root

// Write a program that prompts the user to enter a double and
//then prints out a crude estimate of the cube root of the number
//and the value of this crude guess when cubed. 

import java.util.Scanner;
//In order to use the Scanner class, it must first imported
//otherwise the compiler will generate error messages.
//The import statement must be the first statement in the program after comments.
public class Root
{
    public static void main(String[] args)
    {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter a double, and the program will estimate its cube root: ");
        double X=myScanner.nextDouble();
        //this will let 
        
        double guess1=X/3;
        //the first guess of the cubic root is 1/3 of the number entered
        
        double guess2=(2*guess1*guess1*guess1+X)/(3*guess1*guess1);
        //guess2 will be a equation about guess1
        double guess3=(2*guess2*guess2*guess2+X)/(3*guess2*guess2);
        //guess3 will be a equation about guess2
        double guess4=(2*guess3*guess3*guess3+X)/(3*guess3*guess3);
        //guess4 will be a equation about guess3
        double guess5=(2*guess4*guess4*guess4+X)/(3*guess4*guess4);
        //guess5 will be a equation about guess4
        double guess6=(2*guess5*guess5*guess5+X)/(3*guess5*guess5);
        //guess6 will be a equation about guess5
        
        double test=guess6*guess6*guess6;
        //find the cubic of the estimate 
        
        System.out.println("The cube root of "+ X + " is " + guess6);
        System.out.println(guess6+"*"+guess6+"*"+guess6+"="+test);
        //print to the sceen the estimate of the cubic root and the cubic of
        //this estimate.
        
    }
}//end of program