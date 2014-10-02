//Huahao Luo
//Lehigh ID: hul214
//Course: CSE 2
//HW05 Program1:BurgerKing
//Write a program that prompts the user to enter a choice of 
//a burger, a soda, or fries. Then the program prompts the users 
//for details of their choices. 

import java.util.Scanner;//import scanner
public class BurgerKing
{
    public static void main(String[] args)
    {
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);//accept input
        
        System.out.println("Enter a Letter to indicate a choice of ");
        System.out.println("       Burger (B or b)");
        System.out.println("       Soda (S or s)");
        System.out.println("       Fries (F or f)");
        String choice1 = myScanner.next();
        //prompt user to enter their choice of order
        
        if (choice1.length()==1)//make sure user enter 1 character
        {
            if(choice1.equals("B")||choice1.equals("b"))
            //if the user choose b/B
            {
                
                System.out.println("Enter A or a for 'all the fixins' ");
                System.out.println("C or c for cheese");
                System.out.println("N or n for one of the above");
                //listing the options, and let the users choose
                String choice2 = myScanner.next();
                
                if(choice2.length()==1)//make sure they enter 1 character
                {
                    if(choice2.equals("A")||choice2.equals("a"))
                    {
                        System.out.println("You ordered a burger with all fixins");
                        //tell the user what they ordered
                        return;
                    }
                    else if(choice2.equals("C")||choice2.equals("c"))
                    {
                        System.out.println("You ordered a burger with cheese.");
                        return;
                        //tell the user what they ordered
                    }
                    else if(choice2.equals("N")||choice2.equals("n"))
                    {
                        System.out.println("You ordered a burger.");
                        return;
                        //tell the user what they ordered
                    }
                    else
                    {
                        System.out.println("you did not enter any of A,a,C,c,N,n");
                        return;
                        //prompt error message
                    }
                }
                else
                {
                    System.out.println("a single character expected");
                    return;//prompt error message
                }
            }
            
            
            
            else if(choice1.equals("S")||choice1.equals("s"))
            //if the user choose S/s
            {
                
                System.out.println(" Do you want Pepsi (p or P), "
                +"Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)");
                String choice2 = myScanner.next();
                //listing the options, and let the users choose
                
                if(choice2.length()==1)//make sure user enter 1 character
                {
                    if(choice2.equals("P")||choice2.equals("p"))
                    {
                        System.out.println("You ordered a burger with all fixins");
                        //tell the user what they ordered
                        return;
                    }
                    else if(choice2.equals("C")||choice2.equals("c"))
                    {
                        System.out.println("You ordered a coke.");
                        //tell the user what they ordered
                        return;
                    }
                    else if(choice2.equals("S")||choice2.equals("s"))
                    {
                        System.out.println("You ordered a Sprite.");
                        //tell the user what they ordered
                        return;
                    }
                    else if(choice2.equals("M")||choice2.equals("m"))
                    {
                        System.out.println("You ordered a mountain Dew.");
                        //tell the user what they ordered
                        return;
                    }
                    else
                    {
                        System.out.println("you did not enter any of P,p,C,c,S,s,M,m");
                        return;//prompt error message
                    }
                }
                else
                {
                    System.out.println("a single character expected");
                    return;//prompt error message
                }
            }
                
                
                
            else if(choice1.equals("F")||choice1.equals("f"))
            //if the user choose f/F
            {
                
                System.out.println("Do you want a large or small order of fries l,L,s ,or S");
                String choice2 = myScanner.next();
                //listing the options, and let the users choose
                
                if(choice2.length()==1)//make sure user enter 1 character
                {
                    if(choice2.equals("L")||choice2.equals("l"))
                    {
                        System.out.println("You ordered a large fries");
                        //tell the user what they ordered
                        return;
                    }
                    else if(choice2.equals("S")||choice2.equals("s"))
                    {
                        System.out.println("You ordered a small fries");
                        //tell the user what they ordered
                        return;
                    }
                    else
                    {
                        System.out.println("you did not enter any of l,L,s ,or S");
                        return;//prompt error message
                    }
                }
                else
                {
                    System.out.println("a single character expected");
                    return;//prompt error message
                }
            }
            
            else
            {
                System.out.println("you did not enter any of B,b,S,s,F,f");
                return;//prompt error message
            }
        }
        
        else
        {
            System.out.println("a single character expected");
            return;//prompt error message
        }
    }
}