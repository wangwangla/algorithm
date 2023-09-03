package com.algorithm._2_stack.demo;

import com.algorithm._2_stack.stack.StackLink;

/**
 * 括号匹配
 */
public class AppStack {

    public boolean isMatch(String str){
        StackLink<String> chars = new StackLink<>();
        //遍历字符串
        for (int i = 0; i < str.length(); i++) {
            //获取当前的字符
            String currChar = str.charAt(i) + "";
            //左括号就存起来
            if (currChar.endsWith("(")){
                chars.push(currChar);
            }else if (currChar.endsWith(")")){
                //如果是右括号有一个右括号匹配就继续，如果没有就结束
                String pop = chars.pop();
                if (pop == null){
                    return false;
                }
                if (!pop.equals("(")){
                    return false;
                }
            }
        }
        //如果长度为0，那么就返回true，否 则就返回false;
        if (chars.size() == 0){
            return true;
        }else {
            return false;
        }
    }
}
