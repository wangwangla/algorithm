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
        if (length >= element.length-1){
            int newlength = kuorong(length);
            T []newElement = (T[])new Object[newlength];

            for (int i = 0; i <= length; i++) {
                newElement[i] = element[i];
            }

            element = newElement;
        }

        System.out.println(length);
        element[++length] = t;
    }

    public int kuorong(int oldLength){
        if (oldLength>=Integer.MAX_VALUE){
            throw new IndexOutOfBoundsException("无法添加");
        }else {
            int i = Integer.MAX_VALUE - oldLength;
            if (i>=oldLength){
                return oldLength * 2;
            }else {
                return Integer.MAX_VALUE;
            }
        }
    }

    public T pop(){
        if (length<0){
            throw new IndexOutOfBoundsException("error");
        }
        return element[length--];
    }

    public int getLength() {
        return length + 1;
    }

    public boolean isEmpty(){
        return length == -1;
    }

    public T peek(){
        return element[length];
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(10);
        System.out.println("stack size:"+stack.getLength());
        System.out.println("stack isEmpty:"+stack.isEmpty());
        stack.insert("3");
        stack.insert("32");
        System.out.println("stack size" + stack.getLength());
        System.out.println("stack isEmpty:"+stack.isEmpty());
        stack.insert("6");
        stack.insert("4");

        System.out.println("stack peek pre size" + stack.getLength());
        System.out.println("peek top:"+stack.peek());
        System.out.println("stack peek after size" + stack.getLength());

        for (int i = 0; i < 100; i++) {
            stack.insert(i);
        }

        int lenth = stack.getLength();
        for (int i = 0; i < lenth; i++) {
            System.out.println(stack.pop());
        }

    }
}
