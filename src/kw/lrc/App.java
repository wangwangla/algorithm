package kw.lrc;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class App {
//    "EEE, d MMM yyyy  HH:mm:ss Z"
    public static void main(String[] args) {


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
