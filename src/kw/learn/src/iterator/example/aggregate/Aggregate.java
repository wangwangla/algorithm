package kw.learn.src.iterator.example.aggregate;

import kw.learn.src.iterator.example.iterator.Iterator;

/**
 * 所要遍历的集合接口，实现接口的可以保存多个元素的接口
 */
public interface Aggregate {
    public abstract Iterator iterator();
}
