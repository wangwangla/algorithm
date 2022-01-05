package com.zhuanti.huisu;

import java.util.ArrayList;
import java.util.List;

/**
 * 22
 *
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 */
public class GenerateParenthesis {
    public static void main(String[] args) {
        GenerateParenthesis parenthesis = new GenerateParenthesis();
        parenthesis.generateParenthesis();
    }
    public List<String> generateParenthesis() {
        char arr[] = {'(','(','(',')',')',')'};
        List<Character> list = new ArrayList<>();
        xx(arr,0,list);
        return null;
    }

    public void xx(char arr[],int start,List<Character> list){
        System.out.println(list);
        for (int i = start; i < arr.length; i++) {
            list.add(arr[i]);
            xx(arr,i+1,list);
            list.remove(list.size()-1);
        }
    }
}
