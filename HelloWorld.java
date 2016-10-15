
public class HelloWorld
{
    public static void main(String[]args)
    {
        int x = 2, y = 7; 
        double z = 4.5, w; 
        w = (x * z + y / x) / 4; 
        int test=(int)(Math.random()*10);
        System.out.println("Hello, World!"+w);
        int k = 7, n = 3;
        System.out.println(k % (n + 2) + n % (k + 2));
    }    
}    