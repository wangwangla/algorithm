package com.letcode;

import java.util.ArrayList;

public class _6_ZConvert {
    public String convert(String s, int numRows) {
//        P   A   H   N         0 4 8 12
//        A P L S I I G         1 3 5 7
//        Y   I   R             2 6 10
        ArrayList<StringBuffer> arrayList = new ArrayList<>();
        int col = 0;
        int off = -1;
        for (int i = 0; i < numRows; i++) {
            arrayList.get(col).append(s.charAt(i));
            if (i==0||i==numRows-1){
                off = -off;
            }
            col += off;
        }
        return null;
    }
}
