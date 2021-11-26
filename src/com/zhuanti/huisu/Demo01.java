package com.zhuanti.huisu;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {

    }

    public List<String> letterCombinations(String digits) {
        String s = "abc";
        List<String> characters = new ArrayList<>();
        for (char c : s.toCharArray()) {
            characters.add(""+c);
        }
        return characters;
    }

    public List<String> letterCombinations1(String digits) {
        String s = "abc";
        String s1 = "edf";
        List<String> characters = new ArrayList<>();
        for (char c : s.toCharArray()) {
            for (char c1 : s1.toCharArray()) {
                characters.add(""+c1+c);
            }
        }
        return characters;
    }
}
