package com.letcode;

public class _1232_CheckStraightLine {
    public static boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <=2)return true;
        int x = coordinates[1][0] - coordinates[0][0];
        int y = coordinates[1][1] - coordinates[0][1];

        for (int i = 2; i < coordinates.length; i++) {
            int tempX = coordinates[i][0] - coordinates[i-1][0];
            int tempY = coordinates[i][1] - coordinates[i-1][1];
            if (Math.abs(tempX) != Math.abs(x) || Math.tempY != y){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        System.out.println(checkStraightLine(arr));
    }
}
