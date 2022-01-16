package kw.learn.src.iterator;

/**
 * 什么是迭代器模式？
 * 使用一种方式访问一个聚合对象内部各个元素，而不暴露内部对象
 *
 *
 */
public class IteratorApp {
    public static void main(String[] args) {
        int arr[] = {};
        //常见遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
