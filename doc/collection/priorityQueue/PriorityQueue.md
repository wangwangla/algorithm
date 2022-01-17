# PriorityQueue 

优先队列
使用数组实现，默认大小为11

小顶堆  大顶堆


## 常量

private static final int DEFAULT_INITIAL_CAPACITY = 11; 
transient Object[] queue; // non-private to simplify nested class access
rivate int size = 0;
private final Comparator<? super E> comparator;
transient int modCount = 0; // non-private to simplify nested class access

## 构造函数

传入的参数有大小和比较器，如果没有大小，那么就使用默认的大小11.

## add

```java
public boolean offer(E e) {
    if (e == null)
        throw new NullPointerException();
    modCount++;
    int i = size;
    //如果大小大于数组的大小，那么就扩容
    if (i >= queue.length)
        grow(i + 1);
    size = i + 1;
    if (i == 0)
        queue[0] = e;
    else
        siftUp(i, e);
    return true;
}
```

## 扩容

int newCapacity = oldCapacity + ((oldCapacity < 64) ?
(oldCapacity + 2) :
(oldCapacity >> 1));

小于64，就每次加old+2,否则加2倍
