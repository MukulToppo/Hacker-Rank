package thirtyDays.day2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Meal Cost: ");
        double mealCost = scan.nextDouble(); // original meal price
        
        System.out.println("Enter Tip Percentage: ");
        int tipPercent = scan.nextInt(); // tip percentage
        
        System.out.println("Enter Tax Percentage: ");
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        //double totalCost = mealCost + (double) ((tipPercent/100)*mealCost) + (double) ((taxPercent/100)*mealCost);
        int totalCost = (int) Math.round((mealCost + ((tipPercent*mealCost)/100) + ((taxPercent*mealCost)/100)));
        
        // cast the result of the rounding operation to an int and save it as totalCost 
        //int totalCost = (int) Math.round(/*numberToRoundHere*/);
        System.out.println("Total Cost: " + totalCost);
        // Print your result
    }
}


