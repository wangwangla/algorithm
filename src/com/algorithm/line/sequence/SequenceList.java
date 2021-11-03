package com.algorithm.line.sequence;

import java.util.Objects;

/**
 * 线性表
 *
 * @param <T>
 */
public class SequenceList<T> {
    private T[] elements;

    private int N;

    public SequenceList(){
            elements = (T[]) new Object[10];
    }

    public SequenceList(int capacity){
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
        SequenceList<Integer> sequenceList = new SequenceList<>(3);
        sequenceList.insert(1);
        sequenceList.insert(2);
        sequenceList.print();
        sequenceList.insert(3);
        sequenceList.insert(4);
        sequenceList.print();
        sequenceList.delete(1);
        sequenceList.print();
    }
}
