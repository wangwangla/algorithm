package kw.down;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class App {
//    "EEE, d MMM yyyy  HH:mm:ss Z"
    public static void main(String[] args) {
//        String str = "EEE, d MMM yyyy  HH:mm:ss Z";
//        String str = "21 Mar 2023 06:32:07 GMT";
//        try {
//            long parse = Date.parse(str);
//            System.out.println(parse);
//            Date date = new Date(parse);
//            System.out.println(date);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

//        String str = "Fri, 31 Mar 2023 09:07:58 GMT";
//        System.out.println(str);
//        converServerTime(str);
//        String encodedString = "%7B%22method%22%3A%22get_daily_config%22%2C%22time_zone%22%3A8%7D=";
//        try {
//            String decode = URLDecoder.decode(encodedString, "UTF-8");
//            System.out.println(decode);
//        } catch (UnsupportedEncodingException e) {
//            throw new RuntimeException(e);
//        }

        ///storage/emulated/0/PMSLLM/Music/周杰伦 - 晴天.mp3
        String str =  "/storage/emulated/0/PMSLLM/Music/周杰伦 - 晴天.mp3";
        File file = new File(str);
        String parent = file.getParent();
//        \storage\emulated\0\PMSLLM\Music
        System.out.println("parent : "+ parent);
        String name = file.getName();
        System.out.println(name);
        int i = name.lastIndexOf(".");
        String substring = name.substring(0, i);
        System.out.println(substring);
        System.out.println(parent +"/"+substring+".lrc");

    }

//    Fri, 31 Mar 2023 09:07:58 GMT
    public static void converServerTime(String object){
        // 创建用于解析日期字符串的格式化程序
        try {
            String str = object;
            SimpleDateFormat formatter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH);
            Date date = formatter.parse(str);
            String gmtTime = formatter.format(date);
            System.out.println(gmtTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
