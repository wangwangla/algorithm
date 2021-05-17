package com.offer;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.HashMap;

/**
 *
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），
 * 也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。
 * 请问该机器人能够到达多少个格子？
 *
 * 示例 1：
 *
 * 输入：m = 2, n = 3, k = 1
 * 输出：3
 * 示例 2：
 *
 * 输入：m = 3, n = 1, k = 0
 * 输出：1
 * 提示：
 *
 * 1 <= n,m <= 100
 * 0 <= k <= 20
 *
 * letcode超来的答案
 * 一个二维数组，值默认为false
 */
public class Question11 {
    private static HashMap<String,String> hashMap = new HashMap<>();
    boolean [][]memory;
    int res = 0;

    public int movingCount(int m, int n, int k) {
        if (k==0 || m==1 && n==1) return 1;
        // 初始化默认为false
        memory = new boolean[m][n];
        // 从(0,0)位置开始遍历
        dfs(0,0,k,m,n);
        return res;
    }

    private void dfs(int x, int y, int k,int m, int n) {
        // 如果memory[x][y] == true 说明遍历过了 剪枝
        if (x==m || y==n || memory[x][y]) return;
        // 判断是否满足另外一个条件
        if (panduan(x)+panduan(y)>k) return;
        // 走到这里说明此格没有遍历过 将memory置为true
        memory[x][y] = true;
        // 返回值+1
        res++;
        System.out.println(x+","+y);
        hashMap.remove(x+""+y);
        // 往下走一格
        dfs(x+1,y,k,m,n);
        // 往右走一格
        dfs(x,y+1,k,m,n);
    }

    // 返回x的各个位相加的和
    static int panduan(int x){
        if (x==100) return 1;
        if (x<=9) return x;
        return x/10+x%10;
    }

    /**
     * 还需要修改，  因为现在这种会
     * @param m
     * @param n
     * @param k
     * @return
     */
    public static int movingCount1(int m, int n, int k) {
        int x = 0;
        for (int i = 0; i < m; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                if (panduan(i)+panduan(i1)<=k) {
                    x++;
                    hashMap.put(i+""+i1,null);
                    System.out.println(i+""+i1);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        movingCount1(16,8,4);
        System.out.println("===");
        System.out.println("==========================================");

        Question11 question11 = new Question11();
        question11.movingCount(16,8,4);

        System.out.println("+===================");
    }

}
