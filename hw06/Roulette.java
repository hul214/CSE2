//Huahao Luo
//Lehigh ID: hul214
//Course: CSE 2
//HW06 Program1: Roulette
//For the 1000 repetitions of the 100-spin simulation, 
//1. compute the number of times I lose everything (my number never comes up), 
//2. compute the total winnings (of all simulations added together), 
//3. compute the number of times I walked away with a profit in one session of 100 spins of the wheel
import java.util.Scanner;
public class Roulette
{
    public static void main(String[] args)
    {
        
        Scanner myScanner;
        int n_spins=0;//up to 100
        int n_simulation=0;//up to 1000
        int win=0;//counting number of times i win in the 100 spins
        int totalwin=0;//number of times i win $36
        int outcome;//the random number by computer
        int n_wins=0;//counting for the simulation(100spins) of win
        int n_lost=0;//counting for the simulation(100spins) of lost
        int guess;//the user's guess
        
        myScanner = new Scanner(System.in);
        System.out.print("enter your number of pick in roulette (1-38): ");
        //prompt the user to enter their input
        
        if(myScanner.hasNextInt()) 
        {
            guess=myScanner.nextInt();
        }
        else
        {
            System.out.println("Please enter an integer.");
            return;
        }
            
        if(guess<0 && guess>38)
        {
            System.out.println("Please enter a positive integer from 1 to 38.");
            return;
        }
        //make sure user enter the right input    
        
            while (n_simulation <1000)//1000simulations
            {
                while (n_spins<100)//100 spins
                {
                    outcome=(int)(Math.random()*39);
                    if (outcome==guess)
                    {
                        win++;
                        totalwin++;
                    }
                    n_spins++;
                }
                
                if (win>=3)
                {
                    n_wins ++;
                }
                else if (win == 0)
                {
                    n_lost ++;
                }
                
                win=0;
                n_spins=0;
                n_simulation++;
                
            }
        
        int total =n_wins*36;
            
        System.out.println("Out of the 1000 simulations, "+n_wins+" times you walk away with profit.");
        System.out.println("The total money you win is $"+total+" dollars.");
        System.out.println("Out of the 1000 simulations, "+n_lost+" times you lost everything");
    }
}
            
            
            
            
            
            
            