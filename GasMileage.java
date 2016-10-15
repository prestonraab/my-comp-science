// Chapter 5 Question 18

// This program prompts the user to enter miles traveled and
// gas spent and calculates the car's gas mileage

import java.util.Scanner;

public class GasMileage
{
  public static double gasMileage(int miles, double gallons)
  {
    return miles/gallons;
  }
  public static double gallons(int miles, double mpg)
  {
      return miles/mpg;
  }
  public static void mpgAndMilesToGallons()
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Miles traveled: ");
    int miles = input.nextInt();
    System.out.print("Miles per gallon: ");
    double mpg = input.nextDouble();
    
    input.close();
    
    double gallons = gasMileage(miles, mpg);
    System.out.printf("Your car's gas usage was %.1f gallons\n", gallons);
  }
  public static void milesAndGallonsToMpg()
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Miles traveled: ");
    int miles = input.nextInt();
    System.out.print("Gallons of gas spent: ");
    double gallons = input.nextDouble();
    
    input.close();
    
    double mpg = gasMileage(miles, gallons);
    System.out.printf("Your car's gas mileage was %.1f miles per gallon\n", mpg);
  }
  public static void main(String[] args)
  {
      mpgAndMilesToGallons();
  }
}
