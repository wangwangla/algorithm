package com.zhuanti.erfenchazhao;

public class FindLastElement {
    public int findFristElement(int arr[] ,int target){
        int low = 0;
        int hight = arr.length - 1;
        int mid = 0;
        while (low <= hight){
            mid = ( hight + low ) / 2;
            if (arr[mid] > target){
                hight = mid - 1;
            }else if (arr[mid] < target){
                low = mid + 1;
            }else {
                if (mid == arr.length-1 || arr[mid + 1]!= target){
                    return mid;
                }
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1,1,3,5,6,7,7,7,7,7,7};
        FindLastElement element = new FindLastElement();
        System.out.println(element.findFristElement(arr, 7));
    }

}
