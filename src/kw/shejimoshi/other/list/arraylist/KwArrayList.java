package kw.shejimoshi.other.list.arraylist;

import java.io.Serializable;
import java.util.Arrays;
import java.util.RandomAccess;

public class KwArrayList<T>
        implements
        Serializable,
        RandomAccess,
        Cloneable {
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    private final int DEFAULT_CAPACITY = 10;
    private Object[] element;
    private Object[] DEFAULT_EMPTY_ELEMENTDATA = {};
    private Object[] EMPTY_ELEMENT = {};
    private int DEFAULT_SIZE = 10;
    private int size;
    private int modCount = 0;

    public KwArrayList(){
        this.element = DEFAULT_EMPTY_ELEMENTDATA;
    }

    public KwArrayList(int initialCapacity){
        if (initialCapacity>0){
            element = new Object[initialCapacity];
        }else if (initialCapacity == 0){
            element = EMPTY_ELEMENT;
        }else {
            throw new IllegalArgumentException("size is error!");
        }
    }

    public KwArrayList(KwArrayList arrayList){
        int size = arrayList.size;
        if (size == 0){
            element = EMPTY_ELEMENT;
        }else {
            if (arrayList.getClass() == KwArrayList.class) {
                element = arrayList.element;
            }else {
//                element = Arrays.copyOf()
            }
        }
    }

    public boolean add(T e){
        //将要加入数据的下标
        ensureCapacityInternal(size + 1);
        element[size ++] = e;
        return true;
    }

    public void add(int index,T e){
        rangeCheckForAdd(index);
        ensureCapacityInternal(size + 1);
        System.arraycopy(element,index,element,index + 1,size - index);
        element[index] = e;
        size ++ ;
    }

    private void rangeCheckForAdd(int index) {
        if (index>size || index <0)
            throw new IndexOutOfBoundsException("");
    }

    public void ensureCapacityInternal(int minCapacity){
        ensureExplicitCapacity(calculateCapacity(element,minCapacity));
    }

    private int calculateCapacity(Object[] elementData, int minCapacity) {
        if (elementData == DEFAULT_EMPTY_ELEMENTDATA) {
            return Math.max(DEFAULT_CAPACITY, minCapacity);
        }
        return minCapacity;
    }

    public void ensureExplicitCapacity(int minCapacity){
        modCount ++ ;
        if (minCapacity - element.length > 0){
            grow(minCapacity);
        }
    }

    private void grow(int minCapacity) {
        int newLength = element.length + element.length >> 1;
        if (newLength - minCapacity > 0){
            minCapacity = newLength;
        }
        if (minCapacity - MAX_ARRAY_SIZE > 0){
            hugeCapacity(minCapacity);
        }
        element = Arrays.copyOf(element,minCapacity);
    }


    private void hugeCapacity(int minCapacity) {
        if (minCapacity > MAX_ARRAY_SIZE){
             minCapacity = Integer.MAX_VALUE;
        }
        if (minCapacity < 0){
            throw new OutOfMemoryError();
        }
    }

    public T set(int index , T e){
        rangeCheckForAdd(index);
        T oldValue = (T)element[index];
        element[index] = e;
        return oldValue;
    }

    public T get(int index){
        return (T)element[index];
    }

    public T remove(int index){
        rangeCheckForAdd(index);
        T oldValue = (T)element[index];
        System.arraycopy(element,index+1,element,index,size - index - 1);
        element[size] = null;
        size -- ;
        return oldValue;
    }
}
