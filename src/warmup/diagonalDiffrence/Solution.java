package warmup.diagonalDiffrence;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		   Scanner in = new Scanner(System.in);
		   System.out.println("Enter the size of Matrix: ");
	       int n = in.nextInt();
	       int a[][] = new int[n][n];
	       int sumDiagonal1 = 0;
	       int sumDiagonal2 = 0;
	       int difference = 0;
	       
	       for(int a_i=0; a_i < n; a_i++){
	           for(int a_j=0; a_j < n; a_j++){
	        	   System.out.println("Enter the Element: ");
	               a[a_i][a_j] = in.nextInt();
	           }
	       }
	       
	       //Sum Diagonal 1
	       for(int a_i=0; a_i < n; a_i++){
	    	   sumDiagonal1 += a[a_i][a_i];
	       }
	       
	     //Sum Diagonal 2
	       for(int a_i=0; a_i < n; a_i++){
	    	   sumDiagonal2 += a[n-a_i-1][a_i];
	       }
	       
	       difference = Math.abs(sumDiagonal1-sumDiagonal2);
	       System.out.println("Diagonal Difference is: "+ difference);
	}
}
