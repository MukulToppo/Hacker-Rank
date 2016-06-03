package implementation.angryProfessor;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of Test cases: ");
        int t = in.nextInt();
        int count = 0;
        
        for(int i = 0; i < t; i++){
        	System.out.println("Enter total no. of Students: ");
            int n = in.nextInt();
            
            System.out.println("Enter cancelation threshold: ");
            int k = in.nextInt();
            
            int a[] = new int[n];
            for(int j=0; j < n; j++){
            	System.out.println("Enter arrival time: ");
                a[j] = in.nextInt();
                if (a[j] <= 0) {
                	count++;
                } 
            }
            
            if (count >= k) {
            	System.out.println("YES");
            } else {
            	System.out.println("NO");
            }
            count = 0;
        }
    }
}
