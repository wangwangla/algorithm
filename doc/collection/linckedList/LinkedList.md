# LinkedList


## Deque

队列需要使用到的方法。

## AbstractSequentialList

提高一些基本增删改查方法

## 成员变量

```java
//大小
transient int size = 0;
//开始节点
transient Node<E> first;
//尾节点
transient Node<E> last;

```

## linkFrist

加载第一个位置

```java
private void linkFirst(E e) {
    final Node<E> f = first;
    final Node<E> newNode = new Node<>(null, e, f);
    first = newNode;
    if (f == null)
        last = newNode;
    else
        f.prev = newNode;
    size++;
    modCount++;
}
```

## linkLast

```java
void linkLast(E e) {
    final Node<E> l = last;
    final Node<E> newNode = new Node<>(l, e, null);
    last = newNode;
    if (l == null)
        first = newNode;
    else
        l.next = newNode;
    size++;
    modCount++;
}
```

## indexOf

查询从头到尾 返回它的下标

一般会分为 null 和 Object

它是一个双向链表，可以认为是一个数组，从头到尾，从尾到头