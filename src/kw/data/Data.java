package kw.data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Data {
    public static void main(String[] args) {
        // Create a Date object
        Date date = new Date();
        date.setYear(2023-1900);
        date.setMonth(6);
        date.setDate(31);


        // Create a SimpleDateFormat object with the desired format
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz");
        // Format the date and convert it to a string
        String formattedDate = sdf.format(date);
        // Print the formatted date
        System.out.println("Formatted Date: " + formattedDate);
    }
}
