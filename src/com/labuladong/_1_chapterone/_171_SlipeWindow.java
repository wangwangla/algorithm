package com.labuladong._1_chapterone;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 滑动窗口,从一头进，一头出去
 *
 * 出去使用for循环
 */
public class _171_SlipeWindow {
    public void moban(String[]a){
        ArrayList<String> arrayList = new ArrayList<>();
        int left = 0;
        int right = 0;
        while (right < arrayList.size()){
            arrayList.add(a[right]);
            right++;
            while (arrayList.contains("")){
                arrayList.remove(a[left]);
                left++;
            }
        }
    }

    public String wind(String s,String t){
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c,need.getOrDefault(c,0));
        }
        int left = 0;
        int right = 0;
        int valid = 0;
        int start = 0;
        int len = Integer.MIN_VALUE;
        while (right<s.length()){
            char c = s.charAt(right);
            right++;
            if (need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0));
                if (window.get(c) == need.get(c)){
                    valid++;
                }
            }
            while (valid == need.size()){
                if(right-left<len){
                    start = left;
                    len = right - left;
                }
                char d = s.charAt(left);
                left++;
                if (need.containsKey(d)){
                    if (window.get(d) == need.get(d)){
                        valid --;
                    }
                    Integer integer = window.get(d);
                    window.put(d,integer--);
                }
            }
        }
        return len == Integer.MAX_VALUE?"":s.substring(start,len);
    }

    /**
     * 进入窗口，出窗口
     */
    public void sliderWindow(){

    }
}
