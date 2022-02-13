package com.labuladong._5_chapterfive;

public class _551_Paliandrome {
    public void paliandRome(String str){
        int left = 0;
        int right = str.length()-1;
        while (left<str.length()
                && right>0
                && str.charAt(left) == str.charAt(right)){
            left++;
            right--;
        }
    }


    public String paliandRome1(String str,int left,int right){
        while (left<str.length()
                && right>0
                && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }
        return str.substring(left,right);
    }

    public void paliandRome2(String str){
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            String s1 = paliandRome1(str,i,i);
            String s2 = paliandRome1(str, i, i + 1);
            res = res.length()>s1.length()?res:s1;
            res = res.length()>s2.length()?res:s2;
        }
    }

}
