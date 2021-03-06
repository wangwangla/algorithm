package com.algorithm._11_array;

public class XiShuArray {

    public void initArray(int[][] arr){
        int h = arr.length;
        int l = arr[0].length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[0].length; i1++) {
                //计算出一共存在多少有效数字
                if (arr[i][i1]!=0) {
                    count++;
                }
            }
        }
        int[][] array = new int[count + 1][3];
        array[0][0] = h;
        array[0][1] = l;
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[0].length; i1++) {
                //将数字存起来，   x,y,v
                if (arr[i][i1] == '1'){
                    array[count][0] = i;
                    array[count][1] = i1;
                    array[count][2] = arr[i][i1];
                }
            }
        }

    }

    /**
     * 还原
     * @param arr
     */
    public void spaArray(int[][] arr){
        int[] ints = arr[0];
        int hang = ints[0];
        int lie = ints[1];
        int array[][] = new int[hang][lie];
        for (int i = 1; i < array.length; i++) {
            int[] ints1 = array[i];
            int i1 = ints1[0];
            int i2 = ints1[1];
            array[i1][i2] = ints1[2];
        }
    }
}
