package com.zhuanti.doublepoint;

/**
 * 给你一个长度固定的整数数组 arr，请你将该数组中出现的每个零都复写一遍，并将其余的元素向右平移。
 *
 * 注意：请不要在超过该数组长度的位置写入元素。
 *
 * 要求：请对输入的数组 就地 进行上述修改，不要从函数返回任何东西。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[1,0,2,3,0,4,5,0]
 * 输出：null
 * 解释：调用函数后，输入的数组将被修改为：[1,0,0,2,3,0,0,4]
 * 示例 2：
 *
 * 输入：[1,2,3]
 * 输出：null
 * 解释：调用函数后，输入的数组将被修改为：[1,2,3]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/duplicate-zeros
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _1089_duplicateZeros {
    public void duplicateZeros(int[] arr) {
        int arr1[] = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            if (index>=arr1.length)break;
            if (i1!=0){
                arr1[index ++] = arr[i];
            }else {
                arr1[index++] = 0;
                if (index>=arr1.length)break;
                arr1[index++] = 0;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,4,5,0};
        _1089_duplicateZeros duplicateZeros = new _1089_duplicateZeros();
        duplicateZeros.duplicateZeros(arr);
    }
}
