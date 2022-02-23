package com.zhuanti.dongtaiguihua;

public class _96_NumTrees {

    public int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = 1;
        G[1] = 1;

        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.println(G[i]+"--"+G[j-1]+"--"+G[i-j]);
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }

    public static void main(String[] args) {
        _96_NumTrees numTrees = new _96_NumTrees();
        numTrees.numTrees(3);
    }
}
