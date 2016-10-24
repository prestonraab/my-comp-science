
/**
 * Jonathan Lentz
 */
public class Die
{
    int numDots;
    //returns a random number between 1 and 6
    public void roll()
    {
        numDots = (int)(Math.random()*6+1);
    }
    //returns the number of dots that the
    public int getNumDots()
    {
        return numDots;
    }
}
