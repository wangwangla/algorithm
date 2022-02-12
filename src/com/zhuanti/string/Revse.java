package com.zhuanti.string;

public class Revse {
    public static void main(String[] args) {
        Revse r = new Revse();
//        r.re("ABCDv");
        r.r("ABCDE",0,2);
    }

    public String re(String st){
        char[] chars = st.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length / 2; i++) {
            char x= chars[i];
            chars[i] = chars[length-1-i];
            chars[length-1-i] = x;
        }
        for (char aChar : chars) {
            System.out.println(aChar);
        }
        StringBuilder b = new StringBuilder();
        for (char aChar : chars) {
            b.append(aChar);
        }
        return b.toString();
    }

    public void r(String str,int begin,int end){
        String substring = str.substring(begin, end);
        String other = str.substring(end,str.length());
        String re = re(substring);
        String s = re + other;
        System.out.println(s);
    }
}
