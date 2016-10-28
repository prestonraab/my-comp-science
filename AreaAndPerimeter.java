
/**
 * Quizzes the user on the area and perimeter of a rectangle.
 * 
 * @Preston Raab
 * @vOctober 26, 2016
 */
import java.util.Scanner;
public class AreaAndPerimeter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in the area and the perimeter of a 6 by 7 rectangle, separated by spaces.");
        int first = input.nextInt();
        int second = input.nextInt();
        if((first == 42 && second == 26) || (first == 26 && second == 42))
        {
            System.out.println("You get 4 points because you got both right!");
        }
        else if(first == 42 || first == 26 || second == 42 || second == 26)
        {
            System.out.println("You get 2 points because you got one right.");
        }
        else
        {
            System.out.println("You don't get any points because you didn't get either right.");
        }
    }
}
