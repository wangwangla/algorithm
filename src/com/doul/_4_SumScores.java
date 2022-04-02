package com.doul;

public class _4_SumScores {
    public long sumScores(String s) {
        int ss = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(s.length() - 1 - i);
            builder.insert(0,c);
            ss+=score(builder,s);
        }
        return ss;
    }

    public int score(StringBuilder builder,String src){
        int x  =0;
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == src.charAt(i)) {
                x++;
            }else {
                break;
            }
        }
//        System.out.println(x);
        return x;
    }
}
