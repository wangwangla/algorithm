package com.zhuanti.dongtaiguihua;

/**
 * 动态 规划 接雨水
 */
public class _42_Trap {
    public static void main(String[] args) {
        _42_Trap question06 = new _42_Trap();
        System.out.println(question06.jieyushui(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    public int ruinWater(int []height){
        int n = height.length;
        if (n == 0)return 0 ;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            if (leftMax[i]<height[i]) {
                leftMax[i] = height[i];
            }else {
                leftMax[i] = leftMax[i-1];
            }
        }
        int [] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >=0; i--) {
            if (rightMax[i]<height[i]) {
                rightMax[i] = height[i];
            }else {
                rightMax[i] = rightMax[i+1];
            }
        }


        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(leftMax[i],rightMax[i])-height[i];
        }
        System.out.println();
        return 0;
    }

    public int jieyushui(int arr[]){
        int left = 0;
        int right = arr.length-1;
        int xx = 0;
        int h = 0;
        for (int i = 0; i < arr.length; i++) {
            if (h<arr[i]){
                h = arr[i];
            }
        }

        for (int i = 0; i < h; i++) {
            while (arr[left]<i){
//                sout();
                left++;
            }
            while (arr[right]<i){
//                sout();
                right--;
            }
            if (left>=right){
                break;
            }else {
                xx += (right - left - 1);
            }
        }

        for (int i : arr) {
            xx -= i;
        }

        return xx;
    }
}
