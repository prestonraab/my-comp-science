
/**
 * This program subtracts from zero the square of all numbers preceding and including a certain integer,
 * which is obtained from the person who initializes the program at the time when the program is initialized.
 * 
 * @Preston Raab
 * @September 9                        STYLE: added comments
 */    
public class SubtractingSquares /* I capitalized and changed the name of the class. STYLE */
{                 /*I indented the method subtractSquares. STYLE*/
    public static int subtractSquares(int n) /*I indented the code within the method. STYLE*/
    /**n is the integer obtained before the program runs.
     * It should be a positive integer, because doubles return an error and negatives return a zero.*/    /* STYLE: added comments*/
    {             /*I lowered the open curly bracket to its own line. STYLE*/
        int x = 0; 
        /** x is the number that is returned. x should always be negative. STYLE: added comments*/
        for (int k = 1; k <= n; k++) /*I defined k within the for loop so it is clear where k is used. STYLE*/
                  /**I removed the semicolon from the line containing the for loop. SYNTAX*/
                  /*I indented the code within the for loop. STYLE*/
        {         /**I added curly brackets to the for loop. SYNTAX*/
            x -=k*k;
        }
        return x; /**I added a semicolon after return x. SYNTAX*/
    }
}

