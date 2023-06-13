package com.zhuanti.array;

/**
 * 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右轮转 1 步: [7,1,2,3,4,5,6]
 * 向右轮转 2 步: [6,7,1,2,3,4,5]
 * 向右轮转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 *
 * 输入：nums = [-1,-100,3,99], k = 2
 * 输出：[3,99,-1,-100]
 * 解释:
 * 向右轮转 1 步: [99,-1,-100,3]
 * 向右轮转 2 步: [3,99,-1,-100]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/rotate-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _189_RotateArray {
    public void rotate(int[] nums, int k) {
        int [] temp = new int[nums.length];
        k = k % nums.length;
        System.arraycopy(nums,0,temp,k,nums.length - k);
        System.arraycopy(nums,nums.length-k,temp,0,k);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(temp[i]);
//        }
        System.arraycopy(temp,0,nums,0,temp.length);
    }

    public static void main(String[] args) {
        _189_RotateArray array = new _189_RotateArray();
        array.rotate(new int[]{1,2,3,4,5},3);
        array.xxx1(new int[]{1,2,3,4,5,6});
    }

    public void ro(int num[],int k){
        int n = num.length;
        k = k%n;
        int count = gcd(k,n);
        for (int i = 0; i < count; i++) {
            int current = i;
            int prev = num[i];
            do{
                int next = (current + k) % n;
                int temp = num[next];
                num[next] = prev;
                prev = temp;
                current = next;
            }while (i!=current);
        }
    }

    public int gcd(int x,int y){
        return y > 0 ? gcd(y,x%y) : x;
    }

    public void xxx(int num[]){
        for (int zz = 0; zz < 3; zz++) {
            int i1 = num[num.length-1];
            for (int i = 0; i < num.length-1; i++) {
                num[num.length - i - 1] = num[num.length - i - 2];
            }
            num[0] = i1;
        }
//        for (int i : num) {
//            System.out.println(i);
//        }
    }

    public void xxx1(int num[]){
//        for (int zz = 0; zz < 3; zz++) {
//            int pre = num[0];
//            int cur = num[1];
//            num[0] = num[num.length-1];
//            for (int i = 0; i < num.length-1; i++) {
//                cur = num[i+1];
//                num[i+1] = pre;
//                pre = cur;
//            }
//        }



            int pre = num[0];
            int cur = num[1];
            num[0] = num[num.length-1];
            for (int i = 1; i < num.length-3; i++) {
                cur = num[i*3];
                num[i+3] = pre;
                pre = cur;
            }
        }
}
