package kw.shejimoshi.other.list.arraylist;

import java.util.RandomAccess;

public class MyArrayList implements RandomAccess {
    public int arr[];
    public int l = 0;
    public MyArrayList(int num){
        arr = new int[num];
    }

    public void setNum(int xx){
        arr[l++] = xx;
    }

    public int getNum(int xx){
        if (xx >= l) {
            System.out.println("gun");
            return 0;
        }
        return arr[xx];
    }
}
