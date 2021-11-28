package com.test.question;

import java.util.ArrayList;
import java.util.List;

public class Nums<T> extends NumsNum<T>{
    private int num;

    @Override
    public void add(T data) {
        num++;
        super.add(data);
    }

    @Override
    public void addAll(List<T> arr) {
        num += arr.size();;
        super.addAll(arr);
    }

    public static void main(String[] args) {
        Nums<Integer> nums = new Nums();
        nums.add(1);
        nums.add(2);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        nums.addAll(arrayList);
        System.out.println(nums.num);
    }
}
