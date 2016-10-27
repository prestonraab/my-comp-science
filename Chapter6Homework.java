
/**
 * Jonathan Lentz
 */
import java.util.Scanner;
public class Chapter6Homework
{
    //Question number 2
    public static int max(int x, int y)
    {
      if(x>y)
      {
          return x;
      }
      else
      {
          return y;
      }
    }
    //Question number 3
    public static int max(int x, int y, int z)
    {
        return Math.max(x,(Math.max(y,z)));
    }
    public static int maximum(int x, int y, int z)
    {
        if(x>y&&x>z)
        {
            return x;
        }
        else if(y>z)
        {
            return y;
        }
        else
        {
            return z;
        }
    }
    //Question number 4
    public static boolean squareCheck(int n)
    {
        return Math.pow(Math.round(Math.sqrt(n)),2)== n;
    }
    //Question number 5
    public static double totalWages(double hours, double rate)
    {
        double wages = 0.0;
        if(hours>40)
        {
            wages += 40 * rate;
            wages += (hours-40) * 1.5 * rate;
        }
        else
        {
            wages = hours *rate;
        }
        return wages;
    }

    /**
        7 C- the ! carries through and the or becomes and.
        8a !(x && y) && (a || b)
        8b if(x <7)
        9a if((x+2 > a  ||  x-2 < b) && y >= 0))
        9b if (a >= b && a >= c && a %2 == 0)
        10 if(x>7 && math.sqrt(x) < 3)
        11 a*b*c != 0 && a*c == b^2 
    */
   Chapter6Homework()
   {
   }
   //Question number 17
   /**
    * public class BooksCost
    * {
   */
    public static double getOrderTotal(int bp, int nb)
    {
        double bpCost = 20.95;
        double nbCost = 21.95;
        double totalNumBooks = bp + nb;
        double orderTotal;
        if(totalNumBooks >= 12)
        {
            orderTotal = totalNumBooks * 16.0;
        }
        else if(totalNumBooks >= 3)
        {
            orderTotal = totalNumBooks * 16.95;
        }
        else if(totalNumBooks <3 && totalNumBooks >=0)
        {
            if(bp == 1 && nb == 1)
            {
                orderTotal = 39.95;
            }
            else
            {
                orderTotal = bp*bpCost + nb*nbCost;
            }
        }
        else
        {
            orderTotal = 0;
            System.out.println("You can't order a negative number of books");
        }
        return ((int )orderTotal * 100)/100;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Be Prepared books");
        int bp = input.nextInt();
        System.out.println("Enter number of Next Best books");
        int nb = input.nextInt();
        System.out.println("Your total is: " +getOrderTotal(bp, nb));
    }
   /**
    }
    */
   
   //Question 21 - see other file.
   
   //Question 23 - see other file.
   
}