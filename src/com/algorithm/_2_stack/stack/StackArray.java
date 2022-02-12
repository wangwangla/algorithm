package com.algorithm._2_stack.stack;

/**
 * util的实现通过Vector实现
 * @param <T>
 */
public class StackArray<T> {
    private int length;
    private T element[];

    public StackArray(int capacity){
        element = (T[])new Object[capacity];
        this.length = -1;
    }

    public void insert(T t){
        element[++length] = t;
    }

    public T pop(){
        if (length<0){
            throw new IndexOutOfBoundsException("error");
        }
        return element[length--];
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public T peek(){
        return element[length];
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(10);
        stack.insert("3");
        stack.insert("32");
        stack.insert("6");
        stack.insert("4");
        int lenth = stack.getLength();
        for (int i = 0; i <= lenth; i++) {
            System.out.println(stack.pop());
        }
    }
}
