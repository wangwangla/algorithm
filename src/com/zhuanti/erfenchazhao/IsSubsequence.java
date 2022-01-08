package com.zhuanti.erfenchazhao;

public class IsSubsequence {
    /**
     * 如果没有顺序要求
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        for (char c : s.toCharArray()) {
            for (char c1 : t.toCharArray()) {
                if (c == c1){
                    index++;
                    break;
                }
            }
        }
        if (index == s.length()){
            return true;
        }else {
            return false;
        }
    }

    public boolean isSubsequence1(String s, String t) {
        int index = 0;
        int s1 = 0;
        int t1 = 0;
        flag:for (int i = s1; i < s.length(); i++) {
            char c = s.charAt(i);
            s1++;
            for (int i1 = t1; i1 < t.length(); i1++) {
                char c1 = t.charAt(i1);
                t1 ++;
                if (c == c1){
                    index ++;
                    if (index == s.length()){
                        break flag;
                    }
                    break;
                }
            }
        }
        if (index == s.length()){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {
        IsSubsequence subsequence = new IsSubsequence();
        subsequence.isSubsequence1("abc","ahbgdc");
    }
}
