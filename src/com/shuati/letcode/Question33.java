package com.shuati.letcode;

/**
 * @author:28188
 * @date: 2021/3/11
 * @time: 22:18
 */
public class Question33 {
    public static void rotate(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < len/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len-j-1][i];
                matrix[len-i-1][j] = matrix[len-1-i][len-1-j];
                matrix[len-1-i][len-1-j] = matrix[j][len-i-1];
                matrix[j][len-i-1] = temp;
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


//        int len = matrix.length;
//        for (int i = 0; i < len / 2; i++) {
//            int start = i;
//            int end = len - i - 1;
//            for (int j = 0; j < end - start; j++) {
//                int temp = matrix[start][start + j];
//                matrix[start][start + j] = matrix[end - j][start];
//                matrix[end - j][start] = matrix[end][end - j];
//                matrix[end][end - j] = matrix[start + j][end];
//                matrix[start + j][end] = temp;
//            }
//        }
    }

    public static void main(String[] args) {
        int [][] mar = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        rotate1(mar);
    }

    public static void rotate2(int[][] matrix) {
        int length = matrix.length;
        int arr[][]= new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
//                arr[][] = matrix[i][j];
            }
        }
    }

        public static void rotate1(int[][] matrix) {
        int len = matrix.length;
        int arr [][] = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                arr[j][len - 1- i] = matrix[i][j];
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        // 先来一次

//        for (int i = 0; i < len/2; i++) {
//            for (int j = 0; j < len/2; j++) {
//                int rr = arr[j][i];
//                arr[j][i] = arr[i][j];
//                arr[i][j] = rr;
//            }
//        }
//        for (int i = 0; i < len; i++) {
//            for (int j = 0; j < len; j++) {
//                System.out.print(arr[i][len-j-1]);
//            }
//            System.out.println();
//        }
    }

    /**
     * 1-10十个数字，放在11个大小的数组中，然后有一个重复，那么重复的异或之后为0.
     * 解题：
     * 如果是直接的异或，相同的为0，为了可以不为0，那么自己进行凑成2个，所以相同的就是三个
     * 最后在进行异或，就可以得到值。
     *
     * 这个的这种解法扩展成任意数据，这个方法，就不行了
     */
    public static class Question38 {
        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5,7,7,8,9,10,6,11};
            sou1(arr);
            sou2(arr);
            int x = 6;
            System.out.println(x^0); //任何数据和0异或都为任何数
        }

        //任何数据和0进行异或都是任何数
        public static void sou1(int arr[]){
            int x1 = 0;
            for (int i = 1; i < arr.length; i++) {
                x1 = x1^i;
            }
            for (int temp = 0; temp < arr.length; temp++) {
                x1 = x1^arr[temp];
            }
            System.out.println(""+x1);
        }

        /**
         * 值作为下标，下表进行增加   如果数组的下标大于1的就是多出来的那个值，
         * @param arr
         */
        public static void sou2(int arr[]){
            int temp[] = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                temp[arr[i]]++;
            }
            for (int i = 0; i < temp.length; i++) {
                if (temp[i]==2){
                    System.out.println(i+"");
                }
            }
        }
    }

    /**
     * 将奇偶位进行交换
     * - 先得到奇数位，在的大偶数位
     * - 将基数右移
     * - 将偶数位左移
     * - 异或
     *
     * 这个里面有一个就是a和5，可以转化为2进制
     */
    public static class Question39 {
        public static void main(String[] args) {
            sou1(8);
        }

        public static void sou1(int N){
            int ou = N & 0xaaaaaaaa;
            int ji = N & 0x55555555;
            ji = ji<<1;
            ou = ou>>1;
            System.out.println(ji^ou);
        }
    }

    /**
     * 判断某个数，是不是2的次方数
     */
    public static class Question40 {
        public static void main(String[] args) {
            sou1(7);
        }
        public static void sou1(int N){
            if (((N)&(N-1))==0){
                System.out.println(""+true);
            }else {
                System.out.println("" + false);
            }
        }
    }

    /**
     * 找出二进制中为1的个数
     * 解题：
     *  - 可以与1进行与运算，结果为1的就为1，累加1的个数，原始的数组向右移动
     *  - 移动可以有两种，一种是移动1，一种是移动数据
     *  - （x-1）&x = 0;
     *
     */
    public static class Question41 {
        public static void main(String[] args) {
            sou2(10);
        }

        public static void sou1(int N){
            System.out.println(Integer.toBinaryString(N)+"");
            int count = 0;
            for (int i = 0; i < 32; i++) {
                if ((N&(1<<i)) == (1<<i)){
                    count++;
                }
            }
            System.out.println(count);
        }

        public static void sou2(int N){
            int count = 0;
            while (N!=0){
                N = N&(N-1);  //n^(n-1) = 0
                count++;
            }
            System.out.println(count+"");
        }
    }

    /**
     * 找出数组中落单的数据
     */
    public static class Question42 {
        public static void main(String[] args) {
            int arr[] = {0,4,2,3,2,4,5,6,3,5,6};
            sou1(arr);
        }

        public static void sou1(int arr[]){

            int x = 0;
            for (int i = 0; i < arr.length; i++) {
                x = x^arr[i];
            }
            System.out.println(x+"");
        }
    }
}
