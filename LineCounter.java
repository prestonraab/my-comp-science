public class LineCounter
{
 public static void main(int args)
 {
     countLines(args);
 }
 public static boolean countLines(int maxLines)
 {
     int lineCount=3;
     while(lineCount<maxLines)
     {
         System.out.println(lineCount);
         lineCount++;
         return true;
     }
     return true;
 }
}
