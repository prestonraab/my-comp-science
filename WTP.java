
/**
 * Calulates your total cost for a visit to the Winnie the Pooh Company.
 * 
 * @Preston Raab
 * @October 26, 2016
 */
import java.util.Scanner;
public class WTP
{
    public static double getTotalPrice(int hun, int heph, int wooz)
    {
        int totalNumber = hun + heph + wooz;
        double costHun  = 1.0;
        double costHeph = 3.5;
        double costWooz = 5.0;
        if(totalNumber >= 100)
        {
            costHun   = 0.00;
            costHeph += 0.20;
            costWooz += 0.05;
        }
        else if(totalNumber >= 20)
        {
            costHun  -= 0.25;
            costHeph -= 0.75;
            costWooz -= 1.00;
        }  
        else if(totalNumber <= 15 && hun == heph && heph == wooz)
        {
            costHun  -= 0.25;
            costHeph -= 0.75;
            costWooz -= 1.00;
        }
        return costHun*hun + costHeph*heph + costWooz*wooz;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        int hun = 0;
        int heph = 0;
        int wooz = 0;
        System.out.println("Hello! Welcome to the Winnie-The-Pooh company. We sell hunny, hephalumps, and woozles."); 
        System.out.println("Hunny costs $1.00 a jar, hephalumps cost $3.50 each, and woozles cost $5.00 each.");  
        System.out.println("We currently have a few specials: if you buy the same amount of each (up to 5 of each) the price of hunny goes down by $0.10 a jar, and hephalumps and woozles go down by $0.50 each.");  
        System.out.println("If you buy 20 or more of any combination the price of hunny goes down by $0.25 a jar, hephalumps go down by $0.75 each, and woozles go down by $1.00 each.");  
        System.out.println("Lastly if you buy 100 or more (of any combination) hunny is free, hephalumps go up by $0.20 each, and woozles go up by $0.05 each.");
        System.out.println("How many jars of honey would you like today? (No negatives please!)");
        while(valid == false)
        {
            hun = input.nextInt();
            if( hun < 0)
            {
                System.out.println("Sorry, no negative numbers");
                System.out.println("How many jars of honey would you like today? (No negatives please!)");
            }
            else
            {
                valid = true;
            }
        }
        valid = false;
        System.out.println("How many hephalumps would you like today? (No negatives please!)");
        while(valid == false)
        {
            heph = input.nextInt();
            if( heph < 0)
            {
                System.out.println("Sorry, no negative numbers");
                System.out.println("How many hephalumps would you like today? (No negatives please!)");
            }
            else
            {
                valid = true;
            }
        }
        valid = false;
        System.out.println("How many woozles would you like today? (No negatives please!)");
        while(valid == false)
        {
            wooz = input.nextInt();
            if( wooz < 0)
            {
                System.out.println("Sorry, no negative numbers");
                System.out.println("How many woozles would you like today? (No negatives please!)");
            }
            else
            {
                valid = true;
            }
        }
        System.out.println("Your total is: " + getTotalPrice(hun, heph, wooz) + " dollars. Yay!");
    }
}
