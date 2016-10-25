
/**
 * Jonathan Lentz
 */
public class RectangularPrism
{
    private double length, width, height;
    public RectangularPrism(double l, double w, double h)
    {
        length = l;
        width = w;
        height = h;
    }
    public double getVolume()
    {
        return length*width*height;
    }
}
