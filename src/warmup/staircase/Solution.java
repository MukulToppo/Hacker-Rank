package warmup.staircase;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height of Staircase: ");
        int n = in.nextInt();
        int i = 0;
        int j = 0;
        int k = 0; 
        
        for (i=0; i<n; i++) {
        	for (j=0; j<n-i-1; j++) {
        		System.out.print(" ");
        	}
        	for (k=0; k<n-j; k++){
        		System.out.print("#");
        	}
        	System.out.println("");
        }
    }   
}
