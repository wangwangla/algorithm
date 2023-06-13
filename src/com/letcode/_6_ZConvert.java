package com.letcode;

import java.util.ArrayList;

public class _6_ZConvert {
    public static String convert(String s, int numRows) {
//        P   A   H   N         0 4 8 12
//        A P L S I I G         1 3 5 7
//        Y   I   R             2 6 10
        ArrayList<StringBuffer> arrayList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            arrayList.add(new StringBuffer());
        }
        int col = 0;
        int off = -1;
        if (numRows==1)off=0;
        for (int i = 0; i < s.length(); i++) {
            arrayList.get(col).append(s.charAt(i));
            col += off;
            if (col==0||col==numRows-1){
                off = -off;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (StringBuffer stringBuffer : arrayList) {
            builder.append(stringBuffer);
        }
        return builder.toString();
    }

    public static void test(){
        int num = 0;
        int offset = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(num);
            num+=offset;
            if (num == 2){
                offset = -1;
            }
            if (num == 0){
                offset = 1;
            }
        }
    }

    public static void main(String[] args) {
        String str = "AB";
        int numRows = 1;
        System.out.println(convert(str, numRows));
//        test();
    }
}
