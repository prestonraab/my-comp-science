
/**
 * This is my chapter 3 homework.
 * @Preston Raab
 * @September 19
 * 
 */
public class Chpt3Homework
{
 /**
  * Question 1:
     * Comments explain what a program does.
     * Comments explain how to use a program.
     * Comments can be used to "Comment out" a piece of code.
 * 
 * Question 2:
 * 
   * This method creates a yellow disk that moves in a circle. It also sets a background color based on the position of the moving disk.
   * 
   * This method utilizes x and y variables to create a circular path based on time.
   * It paints the circle and the background to an object named g, which is a parameter.
   * 
   * @param g , the Graphics object the background and moving disk are to be drawn on.
   * @return a disk that moves in a circle, and a background that is blue when the circle is high and is black when the circle is low.
   *
 *
 * Question 3a:
     * 16
     * import, public, class, extends, implements, private, int, void, if, else, super, static, new, false, true
     * 
 * Question 3b:
     * Packages:
         * java.awt.Color
         * java.awt.Container
         * java.awt.Graphics
         * java.awt.event.ActionListener
         * java.awt.event.ActionEvent
         * javax.swing.JFrame
         * javax.swing.JPanel
         * javax.swing.Timer
     * Classes:
         * JPanel
         * ActionListener
         * Timer
         * Color
         * JFrame
         * Container
         * ActionEvent
     * Methods:
         * Timer();
         * clock.start();
         * Math.cos();
         * Math.sin();
         * setBackground();
         * paintComponent();
         * setColor();
         * fillOval();
         * repaint();
         * setSize();
         * add();
         * setDefaultCloseOperation();
         * setResizable();
         * setVisible();
     * Constants:
         * Math.PI
         * Color.BLACK
         * Color.CYAN
         * Color.ORANGE
         * JFrame.EXIT_ON_CLOSE
     * Twelve names chosen by programmer:
         * Moving Disk,time,clock,g,x,y,r,sky,e,args,w,c
 * Question 4: 
     * style all comments are optional
     * style lowercase letters are optional for methods but highly encouraged
     * syntax closing and opening braces are required
     * style indenting two spaces makes the program easier to read but not neccessary
     * style braces can be put anywhere
     * style blank lines are not required
     * style if is reserved, but IF is not reserved.
 * Question 5:
     * Redundancy refers to the quality of a language that enables listeners or readers to understand even if there are mistakes.
 * Question 6:
     * The program throws the error:
     * Error: Main method not found in class MovingDisk
     * or it gives no error and the program works perfectly.
 * Question 7:
     * Parenthesis are required but braces are optional if the code is on only one line by itself.
 * Question 8:
     * Because it has an extra semicolon, the code is run no matter if the if condition is true or false.
 * Question 9:*/
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
 /** Question 10:
     * F: The Java compiler recognizes blocks through braces.
     * F: Some lines do not end in semiclolons
     * T: The quotes tell the compiler that the next words are part of a string, and the compiler thinks that the string has an infinite number of spaces in it, it cannot calculate how many.
     * T: The compiler does not care about the white spaces.
     * T: A class definition's order is up to the programmer.
 * Question 11:
     * The program runs, but the title bar is empty.
     * Adding void makes the compiler think that Hello Gui is a method.
 */
 public static boolean main(int maxLines)
 {
     countLines(maxLines);
     return true;
 }    
     
}