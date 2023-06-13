package com.zhuanti.doublepoint;

public class _541_ReverseStr {
//    输入：s = "abcdefg", k = 2
//    输出："bacdfeg"

    public void rev(char arr[],int start,int end){
        while (end>start){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end --;
        }
    }

    public String reverseStr(String str,int k){
        int end = k * 2;
        int start= 0;
        char[] chars = str.toCharArray();
        while (end<str.length()) {
            rev(chars, start,end/2-1);
            start = end;
            end = start+k;
        }
        if(start<str.length()){
            if(start+k<str.length()){
                rev(chars,start,start+k-1);
            }else {
                rev(chars,start,chars.length-1);
            }
            //反转
        }
        StringBuilder builder = new StringBuilder();
        for (char aChar : chars) {
            builder.append(aChar);
        }
        return builder.toString();
    }

    public static void main(String[] args) {

        _541_ReverseStr str = new _541_ReverseStr();
//                                              bacdfeghjiklnmopq
//                                              bacdefghijklmnopq
        System.out.println(str.reverseStr("abcdefghijklmnopq",
                2));
    }
}
