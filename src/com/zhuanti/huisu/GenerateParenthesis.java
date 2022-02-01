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

    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if(n <= 0){
            return res;
        }
        getParenthesis("",n,n);
        return res;
    }

    private void getParenthesis(String str,int left, int right) {
        if(left == 0 && right == 0 ){
            res.add(str);
            return;
        }
        if(left == right){
            //剩余左右括号数相等，下一个只能用左括号
            getParenthesis(str+"(",left-1,right);
        }else if(left < right){
            //剩余左括号小于右括号，下一个可以用左括号也可以用右括号
            if(left > 0){
                getParenthesis(str+"(",left-1,right);
            }
            getParenthesis(str+")",left,right-1);
        }
    }
}
