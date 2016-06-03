package warmup.timeConversion;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Time in format hh:mm:ssAM or hh:mm:ssPM: ");
        String time = in.next();
        
        try {
            // Declare a date format for parsing
            SimpleDateFormat dateParser = new SimpleDateFormat("h:mm:ssa");

            // Parse the time string
            Date date = dateParser.parse(time);

            // Declare a date format for printing
            SimpleDateFormat dateFormater = new SimpleDateFormat("HH:mm:ss");

            // Print the previously parsed time
            System.out.println(dateFormater.format(date));

        } catch (ParseException e) {
            System.err.println("Cannot parse this time string !");
        }
        
    }
}

//07:00:45PM
//07:00:45AM
//17:00:45PM
//17:00:45AM