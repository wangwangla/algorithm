package com.algorithm.heap;

/**
 * 使用数组来存储，基本并且需要记录结点的个数
 * 插入数据：
 *  将数据放在最后一个位置，然后将它进行上浮，然后让他和他的父结点进行比较，如果大于父亲结点，那么就将其上浮一个，直到最后一个结点
 *  1.将数据插入到最后一个位置
 *      temp[++N] = t;
 *      swim(N){
 *          while(N>1){
 *              if(temp[N]>temp[N/2]){
 *                  //交换
 *              }
 *              N = N/2;
 *          }
 *      }
 *  2.将结点上浮
 * 删除数据：
 *  删除最大的数据，最大数据在跟的地方，将跟与最下方的进行比较
 *  temp[1] = temp[N-1];
 *
 *  使用数组存储，从1开始存储
 *  0（不用）
 *  1 2 3 4 5 6
 *  基本
 *  - 1的孩子2*1  2*1+1
 *  - 下沉，如果存在有子树，那么就比较两个孩子，否则就直接走左子树。比较是否需要交换。
 */
public class Heap<T extends Comparable<T>>{
    //存储堆中的元素
    private T[] temp;
    //记录堆中元素的个数
    private int N;
    public Heap(int capacity){
        this.temp = (T[])new Comparable[capacity];
        this.N = 0;
    }

    //比较大小
    public boolean less(int i,int j){
        return temp[i].compareTo(temp[j])<0;
    }

    //交换数据
    private void exch(int i,int j){
        T t = temp[i];
        temp[i] = temp[j];
        temp[j] = t;
    }

    /**
     *  插入数据,插入数据之后，都会放到最后一个位置上，这个时候
     *  需要结点上浮来完成
     */
    public void insert(T t){
        temp[++N] = t;
        swim(N);
    }

//    堆使用是数组层序存储
//    2n+1  2n
    //上浮
    private void swim(int k){
        while (k>1){
            if (less(k/2,k)){
                exch(k/2,k);
            }
            k = k/2;
        }
    }

    //下沉
    private void sink(int k){
        while (2*k<=N){
            int max;
            //如果有右子节点
            if (2*k+1<=N){
                if (less(2*k,2*k+1)){
                    max = 2*k+1;
                }else {
                    max = 2*k;
                }
            }else {
                max = 2*k;
            }
            if (!less(k,max)){
                break;
            }
            exch(max,k);
            k = max;
        }
    }

    public T delMax(){
        //1.将根结点与最后的哪一个节点进行交换
        T old = temp[1];
        //2.将最后一个结点删除
        exch(1,N);
        //3.下沉操作
        temp[N--] = null;
        sink(1);
        return null;
    }

    public static void main(String[] args) {
        Heap<Integer> heap = new Heap<>(10);
        heap.insert(1);
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);
        heap.insert(5);
        heap.insert(6);
        heap.insert(7);
        heap.delMax();

    }
}
