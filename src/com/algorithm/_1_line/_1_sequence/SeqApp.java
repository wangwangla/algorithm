package com.algorithm._1_line._1_sequence;

import java.util.Iterator;

/**
 * 拥有迭代的能力
 * @param <T>
 */
public class SeqApp<T> implements Iterable<T> {

    private T[] elements;
    private int N;
    private int capacity;
    public SeqApp(){
        this.capacity = 10;
        elements = (T[]) new Object[capacity];
        this.N = 0;
    }

    public SeqApp(int capacity){
        this.capacity = capacity;
        elements = (T[])new Object[capacity];
        this.N = 0;
    }

    public void clear(){
        //为了赶紧释放
        for (T element : elements) {
            element = null;
        }
        this.N = 0;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public T get(int i){
        if (checkIndex(i)) {
            return elements[i];
        }
        return null;
    }

    public void insert(T t){
        elements[N++] = t;
    }

    public void insert(T t,int index){
        for (int i = N; i > index-1; i--) {
            elements[i] = elements[i-1]; 
        }
        elements[index-1] = t;
        N ++;
    }

    public void delete(int index){
        for (int j = index-1; j < N-1; j++) {
            elements[j] = elements[j+1];
        }
        elements[N] = null;
        N--;
    }

    public boolean checkIndex(int index){
        if (index<0 || index > capacity) {
            return false;
        }
        return true;
    }

    @Override
    public Iterator iterator() {
        return new It();
    }

    /**
     * 迭代器这是一个接口，并没有什么高深的实现，如果使用增强for，那么就必须实现迭代器
     */
    private class It implements Iterator{
        private int index;
        @Override
        public boolean hasNext() {
            return index<N;
        }

        @Override
        public T next() {
            return elements[index++];
        }
    }

    public static void main(String[] args) {
        SeqApp s = new SeqApp<Integer>();
        s.insert(2);
        s.insert(3);
        s.print();
        s.insert(5,2);
        s.delete(1);
        s.print();
    }

    private void print(){
        System.out.println("--------------------------------");
        Iterator iterator = iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}