package com.grindcode._8_fz;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 *
 * 分治
 *
 * 一个表达式   使用括号进行拆分   得到结果
 *
 */
public class _241_Dwap {
    public List<Integer> diffWaysToCompute(String input){
        if (input == null || input.length() < 0){
            return new ArrayList<>();
        }
        ArrayList<Integer> curRes = new ArrayList<>();
        int length = input.length();
        char[] charArray = input.toCharArray();

        for (int i = 0; i <length; i++) {
            char aChar = input.charAt(i);
            if (aChar == '+' || aChar=='-' || aChar=='*'){
                List<Integer> left = diffWaysToCompute(input.substring(0,i));
                List<Integer> right = diffWaysToCompute(input.substring(i+1));
                for (int i1 : left) {
                    for (int i2 : right) {
                        switch (aChar){
                            case '+': curRes.add(i1+i2);break;
                            case '-': curRes.add(i1-i2);break;
                            case '*': curRes.add(i1*i2);break;
                        }
                    }
                }
            }
        }
        if (curRes.isEmpty())curRes.add(Integer.valueOf(input));
        return curRes;
    }
}
