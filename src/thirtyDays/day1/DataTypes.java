package thirtyDays.day1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Integer: ");
		int i2 = scan.nextInt();
		
		System.out.println("Enter Double: ");
		double d2 = scan.nextDouble();
		
		System.out.println("Enter String: ");
		String s2 = scan.next();
		
		System.out.println("Sum of Integers: "+(i+i2));
		System.out.println(i+i2);
		
		System.out.println("Sum of Doubles: "+(d+d2));
		System.out.println(d+d2);
		
		//System.out.println("Concatenation of Strings: "+(s.concat(s2)));
		System.out.println(s+s2);

	}

}
