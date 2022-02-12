package com.algorithm._3_queue;

/**
 * 最小堆
 *
 * 堆
 * - 每次插入数据在最下面
 * - 他是一个完全二叉树
 * - 加入数据之后会进行上浮和下沉
 *
 *
 * 空间大小 2的层数次方
 *
 * 存储方式一个数组 + 一个容量的下标
 *
 *
 * 孩子  和  父类
 *
 * x的孩子2*index   2 * index - 1
 *
 *
 * 父类  x/2
 *
 * @param <T>
 */
public class MinPriorityQueue<T extends Comparable> {
    private T[] items;
    private int N;

    public MinPriorityQueue(int capatity){
        this.items = (T[])new Comparable[capatity+1];
        this.N = 0;
    }

    public boolean less(int i,int j){
        return items[i].compareTo(items[j])<0;
    }

    public void exch(int i,int j){
        T temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

    public T delMin(){
        //保存最大的
        T t = items[1];
        //交换数据
        exch(1,N);
        items[N--] = null;
        sink(1);
        return items[N];
    }

    private void sink(int i) {
        int min;
        while (2*i<=N){
            if (2*i+1<=N){
                if (less(2*i,2*i+1)){
                    min = 2*i;
                }else {
                    min = 2*i+1;
                }
            }else {
                min = 2*i;
            }
            if (less(i,min)){
                break;
            }
            exch(i,min);
            i=min;
        }
    }

    public void insert(T t){
        items[++N] = t;
        swim(N);
    }

    private void swim(int n) {
        while (n>1){
            if(less(n,n/2)){
                exch(n,n/2);
            }
            n/=2;
        }
    }

    public boolean isEmpty(){
        return N == 0;
    }
}
