package com.zhuanti.segmenttree;

public class App {
    private int tree[];
    private int[] data;

    public App(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        data = new int[arr.length];
        for (int i = 0; i < data.length; i++) {
            data[i] = arr[i];
        }
        this.tree = new int[data.length * 4];
        buildSegmentTree(0, 0, data.length - 1);
    }

    private void buildSegmentTree(int treeIndex, int treeLeft, int treeRight) {
        if (treeLeft == treeRight) {
            tree[treeIndex] = data[treeLeft];
            return;
        }
        int leftTreeIndex = getLeft(treeIndex);
        int rightTreeIndex = getRight(treeIndex);
        int mid = treeLeft + (treeRight - treeLeft) / 2;
        buildSegmentTree(leftTreeIndex, treeLeft, mid);
        buildSegmentTree(rightTreeIndex, mid + 1, treeRight);
        tree[treeIndex] = (tree[leftTreeIndex] + tree[rightTreeIndex]);

    }

    public int query(int start, int end) {
        return query(0, 0, data.length - 1, start, end);
    }

    private int query(int treeIndex, int treeLeft, int treeRight, int queryL, int queryR) {
        if (treeLeft == queryL && treeRight == queryR) {
            return tree[treeIndex];
        }
        int mid = treeLeft + (treeRight - treeLeft) / 2;
        int leftTreeIndex = getLeft(treeIndex);
        int rightTreeIndex = getRight(treeIndex);
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


    public int getLeft(int index) {
        return index * 2 + 1;
    }

    public int getRight(int index) {
        return index * 2 + 2;
    }

    public int sumRange(int i, int j) {
        return query(i, j);
    }

    private int sum[] = null;
    public void xx(int arr[]){
        if (arr== null||arr.length ==0)return;
        sum = new int[arr.length];
        sum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum[i] = sum[0] + arr[i];
        }
    }

    public int res(int start,int end){
        return start > 0 ? sum[end] - sum[start] : sum[end];
    }
}
