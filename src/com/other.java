package com;

public class other {
    public static void main(String[] args) {
        String st = new String("/sjh/sjss/sjjs/sjhs/sd/1.mp3");
        int i = st.lastIndexOf("/");
        String substring = st.substring(0, i);
        String substring1 = substring.substring(0, substring.length() - 4);
        System.out.println(st.substring(0,i));
    }
}
