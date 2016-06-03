package warmup.simpleArraySum;

import java.io.*;
import java.util.*;

public class Solution {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	 
    	Scanner s = new Scanner(System.in); 
    	System.out.print("Enter no. of Elements: ");
    	int n=s.nextInt();
    	int[] a=new int[n];
    	int sum=0;

    	 for(int i=0;i<a.length;i++) {
    		 System.out.print("Enter the Element: ");
	    	 a[i]=s.nextInt();
	    	 sum+=a[i];    	  
    	 }
    	  
    	 System.out.println("The sum of all the elements is "+sum);
    }
}