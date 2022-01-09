package com.zhuanti.segmenttree;

public class SegmentTree {
    private int tree[];
    private int data[];

    public SegmentTree(int data[]){
        if (data == null || data.length == 0){
            return;
        }
        this.data = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            this.data[i] = data[i];
        }
        //
        this.tree = new int[data.length * 2];
    }

    public void buildSegmentTree(int treeIndex,int treeLeft,int treeRight){
        if (treeLeft == treeRight){
            tree[treeIndex] = data[treeLeft];
            return;
        }

        int leftTreeeIndex = 2 * treeIndex + 1;
        int rightTreeeIndex = 2 * treeIndex + 2;

        int mid = treeLeft + (treeLeft + treeRight) >> 1;
        buildSegmentTree(leftTreeeIndex,treeLeft,mid);
        buildSegmentTree(rightTreeeIndex,mid+1,treeRight);
        tree[treeIndex] = tree[leftTreeeIndex] + tree[rightTreeeIndex];
    }

    public int query(int start,int end){
        return query(0,0,data.length-1,start,end);
    }

    public int query(int treeIndex,int treeLeft,int treeRight,int queryL,int queryR){
        if (treeLeft == queryL && treeRight == queryR){
            return tree[treeIndex];
        }

        int mid = treeLeft + (treeLeft - treeRight) >> 1;
        int leftTreeIndex = 2 * treeIndex + 1;
        int rightTreeIndex = 2 * treeIndex + 2;
        if (queryR <= mid) {
            return query(leftTreeIndex, treeLeft, mid, queryL, queryR);
        }
        if (queryL >= mid + 1) {
            return query(rightTreeIndex, mid + 1, treeRight, queryL, queryR);
        }
        int left = query(leftTreeIndex, treeLeft, mid, queryL, mid);
        int right = query(rightTreeIndex, mid + 1, treeRight, mid + 1, queryR);
        return left + right;
    }

    public int sumRange(int i, int j) {
        return query(i, j);
    }
}
