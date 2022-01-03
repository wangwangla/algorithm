package com.algorithm.line.sequence;

/**
 * 线性表  数组实现
 *
 * @param <T>
 */
public class SequenceListArray<T> {
    private T[] elements;

    private int N;

    public SequenceListArray(){
            elements = (T[]) new Object[10];
    }

    public SequenceListArray(int capacity){
        elements = (T[]) new Object[capacity];
        this.N = 0;
    }
    public void clear(){
        this.N = 0;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public T get(int i){
        return elements[i];
    }

    public void insert(T t){
        if (N>=elements.length){
            kuorong();
        }
        elements[N++] = t;
    }

    public void kuorong(){
        int length = elements.length;
        int newLength = (int)(length * 1.5F);
        T [] newElements = (T[]) new Object[newLength];
        for (int i = 0; i < length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public void insert(int i,T t){
        checkIndex(i);
        for (int j = N; j > i ; j--) {
            elements[j] = elements[j-1];
        }
        elements[i] = t;
        N++;
    }

    public void delete(int index){
        checkIndex(index);
        for (int i = index; i < N; i++) {
            elements[i-1] = elements[i];
        }
        N --;
    }

    public void checkIndex(int index){
        if(index>=N){
            throw new RuntimeException("this "+ index + "out of size! ");
        }
    }

    private void print(){
        System.out.println("----------------");
        for (int i = 0; i < N; i++) {
            System.out.println(elements[i]);
        }
    }

    public static void main(String[] args) {
        SequenceListArray<Integer> sequenceListArray = new SequenceListArray<>(3);
        sequenceListArray.insert(1);
        sequenceListArray.insert(2);
        sequenceListArray.print();
        sequenceListArray.insert(3);
        sequenceListArray.insert(4);
        sequenceListArray.print();
        sequenceListArray.delete(1);
        sequenceListArray.print();
    }
}
