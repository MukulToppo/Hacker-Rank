package sorting.insertionSort.Part1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
	public static void insertIntoSorted(int[] ar,int size) {
    // Fill up this function
		for(int i=size-1;i>=0;i--){
			int unsortedNo=ar[i];
			int hole=i;
			while(hole>=1 && ar[hole-1]>unsortedNo){
				ar[hole]=ar[hole-1];
				hole--;
				printArray(ar);
			}
			ar[hole]=unsortedNo;
		}        
		printArray(ar);
	}
	
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int s = in.nextInt();
        int[] ar = new int[s];
        
        for(int i=0;i<s;i++){
        	System.out.println("Enter the Element: ");
        	ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar, s);
    }
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}