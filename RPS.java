
/**
 * Rock Paper Scissors
 * @Preston Raab
 * @October 14, 2016
 */
import java.util.Scanner;
public class RPS
{
    private static final int RICE_KRISPIE = -1;
    private static final int ROCK = 0;
    private static final int PAPER = 1;
    private static final int SCISSORS = 2;
    
    public static int playerChoice()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose rock, paper, or scissors");
        String player = input.next();
        if(isRock(player))
        {
            return ROCK;
        }
        else if(isPaper(player))
        {
            return PAPER;
        }
        else if(isScissors(player))
        {
            return SCISSORS;
        }
        else
        {
            return RICE_KRISPIE;
        }    
    }
    public static int computerChoice()
    {
        return (int) (Math.random()*3);
    }
    public static boolean tie(int p,int c)
    {
        return p==c;
    }
    public static boolean playerWins(int p, int c)
    {
        if(tie(p,c))
        {
            return false;
        }
        else if((p == ROCK && c == SCISSORS )||
                (p == PAPER && c == ROCK)||
                (p == SCISSORS && c == PAPER))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    private static boolean isRock(String str)
    {
        return (str.equals("rock")||str.equals("Rock")||str.equals("Rck")||str.equals("rck")||str.equals("R")||str.equals("r"));
    }
    private static boolean isPaper(String str)
    {
        return (str.equals("paper")||str.equals("Paper")||str.equals("Ppr")||str.equals("ppr")||str.equals("P")||str.equals("p"));
    }
    private static boolean isScissors(String str)
    {
        return (str.equals("scissors")||str.equals("Scissors")||str.equals("Sss")||str.equals("sss")||str.equals("S")||str.equals("s"));
    }
    public static void main(String[] args)
    {
        int player = playerChoice();
        int computer = computerChoice();
        if (playerWins(player,computer))
        {
            System.out.println("Good job, you win");
        }
        else if(tie(player, computer))
        {
            System.out.println("Tie");
        }
        else
        {
            System.out.println("You Lose");
        }    
    }
}
