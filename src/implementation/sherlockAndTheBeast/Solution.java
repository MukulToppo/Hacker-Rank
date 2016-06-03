package implementation.sherlockAndTheBeast;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("Enter test cases: ");
	    int t = in.nextInt();
	    
	    for(int a0 = 0; a0 < t; a0++) {
        	System.out.println("Enter no: ");
            int n = in.nextInt();
            StringBuilder strb=new StringBuilder();
            for(int i=n;i>=0;i--) {   
                if(i%3==0 && (n-i)%5==0) {
                    int j=0;
                    for(j=0;j<i;j++)
                        strb.append("5");
                    for(int k=j;k<n;k++)
                        strb.append("3");
                    break;
                }
            }
            if(strb.length()==0)
                System.out.println("-1");
            else
                System.out.println(strb);
	        
	    }
	}
}
