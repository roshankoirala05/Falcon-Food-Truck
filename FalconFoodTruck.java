// Roshan Koirala
// Ms. Taylor
// CSCI 2003
// 1/18/2104
// Program Description: A Java Program which takes input form user, calculates and displays total, tax, and tips.

import java.util.Scanner; // Importing Scanner 

public class FalconFoodTruck
{
   public static void main( String[] Args)
   {
      double  costofentree, costofside, costofdrink, subtotal, tax, fifteentip,twentytip, total; // Declaration of all variables
      final double taxrate = 9.9, tiprate1 = 15, tiprate2 = 20;
      Scanner roshan = new Scanner (System.in);  // Declaration of scanner called roshan
      
      System.out.println("Welcome to The Grillenium Falcon Food Truck\n");
      System.out.println("Enter the cost of the entree : ");
      costofentree = roshan.nextInt(); // Using scanner to input the value to the variable
      
      System.out.println("Enter the cost of the side :");
      costofside = roshan.nextDouble();
      
      System.out.println("Enter the cost of the drink :");
      costofdrink = roshan.nextDouble();

      // Calculation  of toal, tax , subtotal and tips
      subtotal = costofentree+costofside+costofdrink;
      
      tax = taxrate*subtotal/100 ;
      
      total = subtotal+ tax;
      
      fifteentip = tiprate1* subtotal/100;
      twentytip = tiprate2*subtotal/100;
      
      // Displaying the final result
      
      System.out.printf(" Your Receipt \n Subtotal = $%.2f \n Tax = $%.2f \n  Total = $%.2f \n \n 15 percent tip = $%.2f \n 20percent tip = $%.2f",subtotal, tax, total, fifteentip, twentytip);
      System.out.println(" \n Thank You for purchasing your meal at The Grillenium Falcon Food Truck. \n Have a GOOD DAY!!");
      
   }
}