package com.dongtaiguihua;

public class BeiBao01 {
    public static void main(String[] args) {
        int w[] = {2,1,3,2};
        int v[] = {3,2,4,2};
        BeiBao01 beiBao01 = new BeiBao01();
        beiBao01.solution(w,v);
        System.out.println(beiBao01.nummm);
    }

    public void solution(int w[],int v[]){
        int arr[] = new int[5];
        dp = new int[w.length+2][w.length+2];
        System.out.println(rec2(0, 5, w.length, w, v));
    }

    /**
     *
     * 递归实现
     * @param i ：从哪一个开始
     * @param j ：总重量
     * @param length
     * @return
     */
    public int rec(int i,int j,int length,int w[],int v[]){
        int res;
        //拿到了末尾  那么就不拿了
        if (i == length){
            return 0 ;
        }else if (j<w[i]){ // 重量太重了，  那么就拿去下一个
            res = rec(i+1,j,length,w,v);
        }else {//下来就是   下一个
            res = Math.max(rec(i+1,j,length,w,v),rec(i+1,j-w[i],length,w,v)+v[i]);
        }
        System.out.println(res);
        return res;
    }


    public int rec1(int i,int j,int length,int w[],int v[],int arr[]){
        int res;
        //拿到了末尾
        if (i == length){
            return 0 ;
        }else if (j<w[i]){ // 重量太重的不要
            if (arr[i+1]!=0)
                res = arr[i+1];
            else
                res = rec1(i+1,j,length,w,v,arr);
        }else {//下来就是
            int i1 = 0;
            if (arr[i+1]!=0)
                i1 = arr[i+1];
            else {
                i1 = rec1(i + 1, j, length, w, v, arr);
            }
            int xx = i1 - w[i];
            res = Math.max(i1,rec1(i+1,j-w[i],length,w,v,arr)+v[i]);
        }
        arr[i] = res;
        return res;
    }

    int dp[][] ;
    int nummm = 0;
    public int rec2(int i,int j,int length,int w[],int v[]){
        nummm++;
        if (dp[i][j] != 0){
            return dp[i][j];
        }
        int res;
        //拿到了末尾
        if (i == length){
            return 0 ;
        }else if (j<w[i]){ // 重量太重的不要
            res = rec2(i+1,j,length,w,v);
        }else {//下来就是
            res = Math.max(rec2(i+1,j,length,w,v),rec2( i+1,j-w[i],length,w,v)+v[i]);
        }
//        System.out.println(res);
        dp[i][j] = res;
        return res;
    }
}
