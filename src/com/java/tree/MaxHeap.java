package com.java.tree;

public class MaxHeap {
    protected int capacity;
    protected int size;
    protected int []items;

    public MaxHeap(){
        this.capacity = 10;
        this.size = 0;
        this.items = new int[capacity];
    }

    //左子树的下标
    public int getLeftChildIndex(int parentindex){
        return 2*parentindex+1;
    }

    //得到右子树的下标
    public int getRightChildIndex(int parentindex){
        return 2*parentindex+2;
    }

    //得到父下标
    public int getParentIndex(int childIndex){
        return (childIndex-1)/2;
    }

    public boolean hasLeftChild(int parentindex)
    {
        return getLeftChildIndex(parentindex) < size;
    }


    public boolean hasRightChild(int parentindex)
    {
        return getRightChildIndex(parentindex) < size;
    }

    public boolean hasParent(int index){
        return getParentIndex(index) >= 0;
    }

    public int leftChild(int parentindex){
        return items[getLeftChildIndex(parentindex)];
    }

    public int rightChild(int parentindex){
        return items[getRightChildIndex(parentindex)];
    }

    public int parent(int index)
    {
        return items[getParentIndex(index)];
    }
    public void swap(int indexone,int indextwo){
        int temp = items[indexone];
        items[indexone] = items[indextwo];
        items[indextwo] = temp;
    }

    public void add(int item)
    {
        items[size] = item;
        size++;
        heapifyUp();
    }

    public void isEmpty(String name)
    {
        if(size == 0)
        {
            System.out.println(name+"cant poll");
        }
    }

    public int poll()
    {
        isEmpty("its empty");

        int item = items[0];
        items[0] = items[size-1];
        size--;

        heapifyDown();
        return item;
    }

    public void heapifyDown()
    {
        int index = 0;

        while(hasLeftChild(index)){
            int smallerChildIndex = getLeftChildIndex(index);

            if(hasRightChild(index) && rightChild(index) > leftChild(index))
            {
                smallerChildIndex = getRightChildIndex(index);
            }

            if(items[index] > items[smallerChildIndex])
            {
                break;
            }
            else{
                swap(index,smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }


    public void heapifyUp()
    {
        int index = size - 1;
        while(hasParent(index) && parent(index) < items[index]){
            swap(getParentIndex(index),index);
            index = getParentIndex(index);
        }
    }
}
