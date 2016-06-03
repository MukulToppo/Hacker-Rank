package warmup.plusMinus;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of Elements: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        
        for(int arr_i=0; arr_i < n; arr_i++){
        	System.out.println("Enter the Element: ");
            arr[arr_i] = in.nextInt();
        }
        
        //Count for Positive, Negatives and zeros
        for(int arr_i=0; arr_i < n; arr_i++){
        	if (arr[arr_i] == 0) {
        		countZero++;
        	} else  if (arr[arr_i] > 0) {
        		countPositive++;
        	} else {
        		countNegative++;
        	}
        }
        
        /*System.out.println("Fraction of Positives: " + (double) countPositive/arr.length);
        System.out.println("Fraction of Negatives: " + (double) countNegative/arr.length);
        System.out.println("Fraction of Zeros: " + (double) countZero/arr.length);*/
        
        System.out.println((double) countPositive/arr.length);
        System.out.println((double) countNegative/arr.length);
        System.out.println((double) countZero/arr.length);
    }
}