package com.learn.src.arraylist.listIterator;

import com.learn.src.iterator.example.iterator.Iterator;

/**
 * 为例适应list，顺序访问的
 * 正反方向进行
 * @param <T>
 */
public interface JdkListIterator<T> extends Iterator<T> {
        // Query Operations

        boolean hasNext();

        T next();

        boolean hasPrevious();

        T previous();

        int nextIndex();

        int previousIndex();


        // Modification Operations

        void remove();

        void set(T e);

        void add(T e);
}
