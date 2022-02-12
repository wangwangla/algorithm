package com.zhuanti.depthsearch;

public class DSearch {
    public static void main(String[] args) {

    }

    int arr[];//数据
    int n; //数组个数
    int k; //总数
    public boolean dfs(int i,int sum){
        if (i == n) return sum == k;
        if (dfs(i+1,sum)){
            return true;
        }
        if (dfs(i+1,sum + arr[i])){
            return true;
        }
        return false;
    }

    /**
     * 数组下标
     * 总数
     * @param i
     * @param sum
     * @return
     */
    boolean dfs1 (int i,int sum){
        if (i == n) return sum == k;
        if (sum == k)return true;
        if (dfs(i+1,sum)){
            return true;
        }
        if (dfs(i+1,sum)){
            return true;
        }
        return false;
    }

    /**
     * 八联通
     * 里面存在几个1组
     * *****1**
     * *1******
     * ***1****
     * ********
     * ***1****
     * *****1**
     *
     *
     *
     * 首先思路，找出一个，找出和他相连接的，都清楚掉，、一共执行了几次这样的操作就存在几个区域
     */
    public void Dfs(int arr[][],int x,int y){
        arr[x][y] = 0;
        int ay = arr.length;
        int ax = arr[0].length;
        for (int i = -1; i <= 1; i++) {
            for (int i1 = 1; i1 <= 1; i1++) {
                int xx = x + i;
                int yy = y + i;
                if (xx >= 0 && xx < ax && yy >= 0 && yy < ay) {
                    if (arr[yy][xx] == 1) {
                        //吧相连接的清除了
                        Dfs(arr, xx, yy);
                    }
                }
            }
        }
    }

    void solve(int arr[][]){
        int res = 0;
        int ay = arr.length;
        int ax = arr[0].length;
        for (int i = 0; i < ay; i++) {
            for (int i1 = 0; i1 < ax; i1++) {
                if (arr[i][i1] == 1) {
                    Dfs(arr,i,i1);
                    res++;
                }
            }
        }
    }

//    宽度搜索
//    从某个状态开始  直到达到某个状态
//    和深度不同在于搜索的顺序  总是先搜索距离初始状态


}

















