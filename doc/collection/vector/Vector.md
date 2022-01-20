# Vector

## 成员变量
```java
protected int capacityIncrement; //增长因子
protected Object[] elementData;//存储位置
protected int elementCount;//大小
```

Vector继承实现和Arraylist一样，四个实现，一个继承。

## 构造函数

一共四个，主要的有两个，因为大多都是默认值。
和Arraylist不同的是大小为10，但是增加因子默认为0.并且数组创建是直接进行创建的。

```java
//创建数组的大小，增长因子
public Vector(int initialCapacity, int capacityIncrement) {
    super();
    if (initialCapacity < 0)
        throw new IllegalArgumentException("Illegal Capacity: "+
                                           initialCapacity);
    this.elementData = new Object[initialCapacity];
    this.capacityIncrement = capacityIncrement;
}
//指定大小
public Vector(int initialCapacity) {
    this(initialCapacity, 0);
}

public Vector() {
    this(10);
}
public Vector(Collection<? extends E> c) {
    Object[] a = c.toArray();
    elementCount = a.length;
    if (c.getClass() == ArrayList.class) {
        elementData = a;
    } else {
        elementData = Arrays.copyOf(a, elementCount, Object[].class);
    }
}
```

## 增加元素

```java
public synchronized boolean add(E e) {
    modCount++;
    ensureCapacityHelper(elementCount + 1);
    elementData[elementCount++] = e;
    return true;
}
```

## 扩容

它就很简单了，将要加入数据的下标，和数组的大小进行比较，如果下标大于数组大小就进行扩容。
扩容的时候，如果没指定扩容因子的大小就扩容为原来的2倍.

## 删除

删除和ArrayList一样，之不过就是加了一共保证线程安全的东西。


## 其他属性

## 简单总结

初始化的容量是10，每次扩容为原理的2倍，它的所有方法，都使用synchronized关键字进行修饰。
它是线程安全的。

Arraylist中也进行一些并发操作，每次修改操作会加一个遍历。

