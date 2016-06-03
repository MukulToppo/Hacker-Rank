package sorting.insertionSort.runningTime;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void insertionSortPart2(int[] ar, int size) {       
    	int count = 0;
        for (int i = 1; i < size; i++ ) {
    		int value = ar[i];
    		int j = i-1;
    		while (j>=0 && ar[j]>value) {
    			ar[j+1] = ar[j];
    			j--;
                count++;
    		}
    		ar[j+1] = value;
    	}
        System.out.println(count);
    }
      
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter size of the Array: ");
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
    	   System.out.println("Enter the element: ");
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar, s);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}