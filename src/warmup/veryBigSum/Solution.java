package warmup.veryBigSum;

import java.util.Scanner;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
    	System.out.print("Enter no. of Elements: ");
    	int n=s.nextInt();
    	int[] a=new int[n];
    	long sum=0;

    	for(int i=0;i<a.length;i++) {
    		System.out.print("Enter the Element: ");
	    	a[i]=s.nextInt();
	       	sum+=a[i];    	  
    	}
    	  
    	System.out.println("The sum of all the elements is "+sum);
        //System.out.println(sum);

	}

}
