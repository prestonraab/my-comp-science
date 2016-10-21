
/**
 * Jonathan Lentz
 */
public class Die
{
    int numDots;
    public void roll()
    {
        numDots = (int)(Math.random()*6+1);
    }
    public int getNumDots()
    {
        return numDots;
    }
}
