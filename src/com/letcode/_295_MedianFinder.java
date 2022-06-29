package com.letcode;

import java.util.ArrayList;
import java.util.Collections;

public class _295_MedianFinder {
    private ArrayList<Integer> arrayList;
    public _295_MedianFinder() {
        arrayList = new ArrayList<>();
    }

    public void addNum(int num) {
        arrayList.add(num);
    }

    public double findMedian() {
        if (arrayList.size()<=0)return 0;
        Collections.sort(arrayList);
        if (arrayList.size()%2==0) {
            int i = arrayList.size() / 2;
            return (arrayList.get(i-1) + arrayList.get(i))/2;
        }else {
            int i = arrayList.size() / 2;
            return arrayList.get(i);
        }
    }

    public static void main(String[] args) {
        _295_MedianFinder finder = new _295_MedianFinder();
        finder.addNum(1);
        finder.addNum(2);
        System.out.println(finder.findMedian());
    }
}