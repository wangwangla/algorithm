package com.zhuanti.segmenttree;

public class SegmentTree2 {
    private int data[];
    private int tree[];
    public SegmentTree2(int arr[]){
        this.data = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            data[i] = arr[i];
        }
        this.tree = new int[arr.length * 2];
    }

    public void buildSegment(int treeIndex,int treeLeft,int treeRight){
        if (treeLeft == treeRight){
            //left 和 right一样
            tree[treeIndex] = data[treeLeft];
            return;
        }
        int leftTreeIndex = 2 * treeIndex + 1;
        int rightTreeIndex = 2 * treeIndex + 2;
        int mid = treeLeft + (- treeLeft + treeRight) >> 2;
        buildSegment(leftTreeIndex,treeLeft,mid);
        buildSegment(leftTreeIndex,mid+1,treeRight);
        tree[treeIndex] = tree[leftTreeIndex] + tree[rightTreeIndex];
    }

    public int query(int treeIndex,int treeLeft,int treeRight){
//        if (treeLeft == )
        return 0;
    }
}
