
/**
 * This program prompts the user to enter and integer and then returns the integer multiplied by two.
 * 
 * @Preston Raab
 * @September 11, 2016
 */
import java.util.Scanner;
public class TimesTwo
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer.");
        int n=input.nextInt();
        System.out.println("2 * "+n+" = "+n+n);
    }    
}
