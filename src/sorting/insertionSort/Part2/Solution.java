package sorting.insertionSort.Part2;

import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar, int size) {       
    	for (int i = 1; i < size; i++ ) {
    		int value = ar[i];
    		int j = i-1;
    		while (j>=0 && ar[j]>value) {
    			ar[j+1] = ar[j];
    			j--;
    		}
    		ar[j+1] = value;
    		printArray(ar);
    	}
    	//printArray(ar);
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