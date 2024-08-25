package com.sul.part1.removedata;

public class BackspaceCompare {
    public boolean backspaceCompare(String s, String t) {
        System.out.println(tool("abc#d"));
        System.out.println(tool("abcd"));
        return false;
    }

    public String tool(String s){
        char[] temp = new char[s.length()];
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (index>0){
                    --index;
                }
            }else {
                temp[++index] = s.charAt(i);
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.println(temp[i]);
        }
        return new String(temp,0,index+1);
    }

    public static void main(String[] args) {
        BackspaceCompare backspaceCompare = new BackspaceCompare();
        backspaceCompare.backspaceCompare("abc#de","");
    }
}
