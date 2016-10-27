
/**
 * Write a description of class NewCalc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import javax.script.ScriptEngineManager;
import java.util.Scanner;
public class NewCalc
{
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String ScriptException(String j)
    {
        return j;
    }
    public static void main(String[] args) throws Exception
    {
        System.out.println("Type in your expression");
        final ScriptEngineManager engineManager = new ScriptEngineManager();
        final ScriptEngine engine = engineManager.getEngineByName("JavaScript");
        Scanner input = new Scanner(System.in);
        String expression=input.nextLine();
        System.out.println(engine.eval(expression)); // prints 110.99997794278411
    }
}
