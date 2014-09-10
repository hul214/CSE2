//Huahao Luo
//Lehigh ID: hul214
//Course: CSE 2
//HW 02
//You go shopping at Walmart’s and want to 
//compute the cost of the items you bought
//including the PA sales tax of 6%.
//Begin by setting up a class called “Arithmetic” with a main method,
//as you did in your first homework.
//calculate:
//1. Total cost of each kind of item; sales tax for that total cost
//2. Total cost of purchases (before tax)
//3. Total actually paid for this transaction, including sales tax.

public class Arithmetic {
    public static void main(String[] args) {
        
        //Number of pairs of socks
        int n_socks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockscost$=2.58;
        
        //Number of drinking glasses
        int n_glasses=6;
        //Cost per glass
        double glasscost$=2.29;
        
        //Number of boxes of envelopes
        int n_envelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        
        double taxPercent=0.06;
        
        //calculate:
        //1. Total cost of each kind of item; sales tax for that total cost
        //2. Total cost of purchases (before tax)
        //3. Total actually paid for this transaction, including sales tax. 

        double tc_socks;//tc stands for total cost
        tc_socks=n_socks*sockscost$;
        double tc_glasses;
        tc_glasses=n_glasses*glasscost$;
        double tc_envelopes;
        tc_envelopes=n_envelopes*envelopeCost$;
        
        double tax_socks;
        tax_socks=taxPercent*tc_socks;
        double tax_glasses;
        tax_glasses=taxPercent*tc_glasses;
        double tax_envelopes;
        tax_envelopes=taxPercent*tc_envelopes;
        
        double total_purchases;
        total_purchases=tc_envelopes+tc_glasses+tc_socks;
        double total_tax;
        total_tax=tax_envelopes+tax_glasses+tax_socks;
        double total_paid;
        total_paid=total_tax+total_purchases;
        
        //Use the input variables to print out, on separate lines, 
        //the item being bought,  how many of the given item is being bought,
        //and the cost per item.
        //Then compute and display the cost of each of item and
        //the sales tax for that item. 
        //Then compute and display the total cost of the purchases (before tax),
        //the total sales tax,
        //and the total cost of the purchases (including sales tax). 
        
        System.out.println((n_socks)+" pairs of socks were bought at $"+
        (sockscost$)+"each");
        //this line prints the unit price of socks and the amount that was bought 
        System.out.println((n_glasses)+" glasses were bought at $"+
        (glasscost$)+"each");
        //this line prints the unit price of glasses and the amount that was bought
        System.out.println((n_envelopes)+" envelopes were bought at $"+
        (sockscost$)+" each");
        //this line prints the unit price of envelopes and the amount that was bought
        
        System.out.println("Total cost for the socks is $"+(tc_socks)+
        " plus tax $"+(tax_socks));
        System.out.println("Total cost for the glassess is $"+(tc_glasses)+
        " plus tax $"+(tax_glasses));
        System.out.println("Total cost for the envelopes is $"+(tc_envelopes)+
        " plus tax $"+(tax_envelopes));
        //these lines print the total cost and tax of each item
        
        
        System.out.println("Total cost of the purchases is $"+(total_purchases));
        System.out.println("Plus total tax $"+(total_tax));
        System.out.println("Total Payment is $"+(total_paid));
        //this line prints the total purchases, tax and amount to be paid
        
        
        
    } //end of main method
} //end of class
