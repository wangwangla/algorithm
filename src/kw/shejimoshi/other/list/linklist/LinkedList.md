# LinkedList

实现了Serialize/Cloneable/Dequeg和List

## 成员变量

- size为0
- 头尾节点


## 构造方法

//无参
public LinkedList() {
}

//传入一个集合
public LinkedList(Collection<? extends E> c) {
    this();
    addAll(c);
}

## 节点

是一个双链表

```java
private static class Node<E> {
    E item;
    Node<E> next;
    Node<E> prev;

    Node(Node<E> prev, E element, Node<E> next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }
}
```

## 放入一个作为头节点

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

实现方式，如果开始是null链表，那么需要给last赋值
如果不是null，需要将原来节点的前一个节点设置为新设置的头节点

## 尾部放入节点

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

如果没有节点，需要给头设置节点
有节点，需要将原来尾部节点的下一个指向新传的，新节点的前一个等于原来的那个。
