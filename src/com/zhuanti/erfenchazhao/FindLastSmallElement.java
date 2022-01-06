package com.zhuanti.erfenchazhao;

public class FindLastSmallElement {
    public int findFristElement(int arr[] ,int target){
        int low = 0;
        int hight = arr.length - 1;
        int mid = 0;
        while (low <= hight){
            mid = ( hight + low ) / 2;
            if (arr[mid] > target){
                hight = mid - 1;
            }else {
                if (mid == arr.length-1 || arr[mid + 1] > target)
                    return mid;
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,7,8,9};
        FindLastSmallElement element = new FindLastSmallElement();
        System.out.println(element.findFristElement(arr, 7));
    }

}
