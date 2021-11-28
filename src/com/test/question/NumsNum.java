package com.test.question;

import java.util.ArrayList;
import java.util.List;

public class NumsNum<T> {
    private ArrayList<T> arrayList;
    public NumsNum(){
        arrayList = new ArrayList<>();
    }
    public void add(T data){
        arrayList.add(data);
    }

    public void remove(T data){
        arrayList.remove(data);
    }

    public void addAll(List<T> arr){
        for (T t : arr) {
            add(t);
        }
    }
}
