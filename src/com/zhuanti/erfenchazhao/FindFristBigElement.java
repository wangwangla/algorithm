package com.zhuanti.erfenchazhao;

public class FindFristBigElement {
    public int findFristElement(int arr[] ,int target){
        int low = 0;
        int hight = arr.length - 1;
        int mid = 0;
        while (low <= hight){
            mid = ( hight + low ) / 2;
            if (arr[mid] >= target){
                if (mid == 0 || arr[mid - 1] < target)
                    return mid;
                hight = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,7,8,9};
        FindFristBigElement element = new FindFristBigElement();
        System.out.println(element.findFristElement(arr, 7));
    }

}
