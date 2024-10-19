package kw.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Date {
    public static void main(String[] args) {
        // Create a Date object
        java.util.Date date = new java.util.Date();
        date.setYear(2023-1900);
        date.setMonth(6);
        date.setDate(31);
        //
        // Create a SimpleDateFormat object with the desired format
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz");
        // Format the date and convert it to a string
        String formattedDate = sdf.format(date);
        // Print the formatted date
        System.out.println("Formatted Date: " + formattedDate);

        String s = "Fri, 31 Mar 2023 09:07:58 GMT";
        converServerTime(s,Locale.US);
    }



    //    Fri, 31 Mar 2023 09:07:58 GMT
    public static void converServerTime(String object,Locale locale){
        // 创建用于解析日期字符串的格式化程序
        try {
            String str = object;
            SimpleDateFormat formatter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
            java.util.Date date = formatter.parse(str);
            String gmtTime = formatter.format(date);
            System.out.println(gmtTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
