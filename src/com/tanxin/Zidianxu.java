package com.tanxin;

public class Zidianxu {
    public static String cowLine(String s) {
        char[] chs = new char[s.length()];
        char[] dest = new char[s.length()];
        //将字符串装入到chs中
        s.getChars(0, s.length(), chs, 0);
        //开始在最开始  和   最结尾
        int start = 0, end = s.length() - 1;

        while(start <= end) {
            boolean isLeft = false;
            for(int i=0; i <= end - start; i++) {
                if(chs[start + i] < chs[end - i]) {
                    isLeft = true;
                    break;
                } else if(chs[start + i] > chs[end - i]) {
                    isLeft = false;
                    break;
                }
            }
            if(isLeft) {
                dest[s.length() - (end - start + 1)] = chs[start ++];
            } else {
                dest[s.length() - (end - start + 1)] = chs[end --];
            }
        }
        return new String(dest);
    }
    public static void main(String args[]) {
        System.out.println(cowLine("ADHCACBD"));
    }
}
