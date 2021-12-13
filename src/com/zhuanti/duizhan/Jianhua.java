package com.zhuanti.duizhan;

import java.util.Stack;

public class Jianhua {
    public static void main(String[] args) {
        Jianhua jianhua = new Jianhua();
        jianhua.test("/a/./b/../../c/");
    }

    public void test(String str){

        String[] split = str.split("/");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < split.length; i++) {
            if (split[i].trim() .equals( ""))continue;
            if (split[i].equals("..")){
                if (!stack.isEmpty())
                    stack.pop();
            }else if (!" ..".contains(split[i])){
                stack.add(split[i]);
            }
        }
        StringBuilder builder = new StringBuilder();
        for (String s : stack) {
            builder.append("/"+s);
        }
//        if (builder.length()==0)return "/";
        System.out.println(builder.toString());
//        return builder.toString();
    }
}
