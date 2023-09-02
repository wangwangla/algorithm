package com.algorithm._1_line._1_sequence;

import java.util.Iterator;
import java.util.function.UnaryOperator;

/**
 * 拥有迭代的能力
 * @param <T>
 */
public class SeqApp<T> implements Iterable<T> {
    //存储在数组中
    private T[] elements;
    //当前数据个数
    private int N;
    //容量 == 数组大小
    private int capacity;
    //默认是10
    public SeqApp(){
        this(10);
    }

    public SeqApp(int capacity){
        this.capacity = capacity;
        this.elements = (T[])new Object[capacity];
        this.N = 0;
    }

    public void clear(){
        //为了赶快释放
//        for (T element : elements) {
//            element = null;
//        }
//        这个才是对的吧
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
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
        if (checkIndex(N + 1)){
            elements[N++] = t;
        }
    }

    public void insert(T t,int index){
        if (!checkIndex(N + 1))return;
        for (int i = N; i > index-1; i--) {
            //ArrayList使用System.copy
            elements[i] = elements[i-1];
            //
//            System.arraycopy(elements,index-1,elements,index,N-index);
        }
        elements[index-1] = t;
        N ++;
    }

    public void delete(int index){
        if (!checkIndex(index))return;
        for (int j = index-1; j < N-1; j++) {
            elements[j] = elements[j+1];
        }
        elements[N] = null;
        N--;
    }

    public boolean checkIndex(int index){
        if (index<0 || index >= capacity) {
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

        s.replaceAll(new UnaryOperator<Integer>() {

            @Override
            public Integer apply(Integer integer) {
                return integer * 3;
            }
        });
    }

    private void print(){
        System.out.println("--------------------------------");
        Iterator iterator = iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void replaceAll(UnaryOperator<T> integerUnaryOperator){
        int length = elements.length;
        for (int i = 0; i < length; i++) {
            elements[i] = integerUnaryOperator.apply(elements[i]);
        }
    }
}
