package com.zhuanti.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MedianFinder {
//    int count=0;
//    int nums = 0;
//
//    /** initialize your data structure here. */
//    public MedianFinder() {
//
//    }
//
//    public void addNum(int num) {
//        count += num;
//        nums++;
//    }
//
//    public double findMedian() {
//        if (nums==0)return 0;
//        return count * 1.0 / nums;
//
//   }

    ArrayList<Integer> arrayList = new ArrayList<>();
    /** initialize your data structure here. */
    public MedianFinder() {

    }

    public void addNum(int num) {
        arrayList.add(num);
    }

    public double findMedian() {
        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        if (arrayList.size()>0){
            if (arrayList.size()==1){
                return arrayList.get(0);
            }else {
                if (arrayList.size() % 2 == 0) {
                    int integer = arrayList.get(arrayList.size() / 2);
                    int int2 = arrayList.get(arrayList.size() / 2-1);
                    return (int2+integer)*1.0/2;
                }else {
                    return arrayList.get(arrayList.size() / 2);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        MedianFinder finder = new MedianFinder();
        finder.addNum(1);
        finder.addNum(2);
        finder.addNum(3);
        System.out.println(finder.findMedian());
    }
}
