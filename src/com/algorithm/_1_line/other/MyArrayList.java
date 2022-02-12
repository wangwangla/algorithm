package com.algorithm._1_line.other;

/**
 * 自己实现官方ArrayList
 *
 * 1.实现List Serializable, RandomAccess,Cloneable
 * 1.三个构造函数
 * 1.1.默认的{}
 * 1.2.{}
 */
public class MyArrayList {
    private Object[] element;
    private Object[] DEFAULT_EMPTY_ELEMENT = {};
    private Object[] EMPTY_ELEMENT = {};
    public MyArrayList(){
        element = DEFAULT_EMPTY_ELEMENT;
    }

    public MyArrayList(int initCapti){

    }

}
