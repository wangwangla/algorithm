package com.offer.rowoffer;

import java.util.ArrayList;
import java.util.Collections;

public class Offer_59_MaxQueue {
    ArrayList<Integer> arr = new ArrayList<>();
    ArrayList<Integer> arr1 = new ArrayList<>();
    public Offer_59_MaxQueue() {
    }

    public int max_value() {
        if (arr.size()<=0)return -1;
//        return arr.remove(arr.size()-1);
        return arr.get(arr.size()-1);
    }

    public void push_back(int value) {
        arr.add(value);
        Collections.sort(arr);
        arr1.add(value);
    }

    public int pop_front() {
        if (arr1.size()<=0)return -1;
        Integer remove = arr1.remove(0);
        Collections.sort(arr);
        arr.remove(remove);
        return remove;
    }


}
