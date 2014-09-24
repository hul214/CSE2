//Huahao Luo
//Lehigh ID: hul214
//Course: CSE 2
//HW04 Program4:TimePadding
//Write a program that has the user enter an positive integer giving 
//the number of seconds that have passed during the day and then displays 
//the time in conventional form. (The problem here is displaying time 
//with “padded” 0s, e.g., 10:03:05).

import java.util.Scanner;//declare Scanner
public class TimePadding
{
    public static void main(String[] args)
    {
        Scanner myScanner;
        
        myScanner = new Scanner(System.in);
        System.out.print("Enter the time in seconds: ");
        //prompt the user to enter seconds
        
        if(myScanner.hasNextInt())//make sure the user enter an int
        {
            int seconds = myScanner.nextInt();
            if (seconds>=0)
            {
                int m_s = seconds%3600;//obtain the number of sumed up by mins and seconds
                int h = ((seconds - m_s)/3600)%24;//get the number of hous ofthe time
                int s = m_s % 60;//get the number of seconds
                int m = (m_s - s)/60;//get the number of mins
                
                int h1=(h/10)%10;//get the first digit
                int h2=h%10;//get the second digit
                int m1=(m/10)%10;//get the third digit
                int m2=m%10;//get the fourth digit
                int s1=(s/10)%10;//get thefifth digit
                int s2=s%10;//get the sixth digit
                
                
                System.out.println("The time is:    "+h1+h2+":"+m1+m2+":"+s1+s2);//print out the time
            }
            
            else if (seconds<0)
            {
                System.out.println("the number entered is not positive.");
                return;//leave the program when the error comes up
            }
            
        }
        
        else
        {
            System.out.println("number entered is not an integer.");
            return;//leave the program when the error comes up
        }
    }
}