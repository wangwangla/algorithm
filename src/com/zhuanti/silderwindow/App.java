package com.zhuanti.silderwindow;

public class App {
    //举个例子  最长不重复的子序列
    public void templete(int arr[]){
        int start = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = start; i1 < i; i1++) {
                if (arr[i]==arr[i1]){
                    start = i1+1;
                }
            }
            max = Math.max(i - start + 1,max);
        }
        System.out.println(max);
    }

    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1)return 1;
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char aChar = s.charAt(i);
            for (int i1 = start; i1 < i; i1++) {
                if (aChar == s.charAt(i1)){
                    start = i1+1;
                }
            }
            max = Math.max(max,i-start+1 );
        }
        return max;
    }
}
