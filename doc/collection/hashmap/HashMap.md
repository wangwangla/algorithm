# HashMap

hashmap实现

## 成员遍历

```java
初始化大小 16
static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;

最大大小
static final int MAXIMUM_CAPACITY = 1 << 30;

负载因子
static final int DEFAULT_LOAD_FACTOR = 0.75F;

节点的拉链长度  如果为8，那么就需要转换为tree
static final int TREEIFY_THRESHOLD = 8;


Node<K,V>[] table;
```

## Node节点

节点，有key value 拉链所以需要下一个节点next

```java
class Node<K,V> implements Map.Entry<K,V>{
    final int hash;
    final K key;
    V value;
    Node<K,V> next;
}
```

## 构造函数

```java
负载因子  初始化大小
public HashMap(int initialCapacity, float loadFactor) {
    if (initialCapacity < 0)
        throw new IllegalArgumentException("Illegal initial capacity: " + initialCapacity);
    if (initialCapacity > MAXIMUM_CAPACITY)
        initialCapacity = MAXIMUM_CAPACITY;
    if (loadFactor <= 0 || Float.isNaN(loadFactor))
        throw new IllegalArgumentException("Illegal load factor: " + loadFactor);
    this.loadFactor = loadFactor;
    this.threshold = tableSizeFor(initialCapacity);
}

没有参数的构造方法，
```

初始化大小

## tableSizeFor

简单理解就是将数字中间的0，都变为1。

```java
static final int tableSizeFor(int cap) {
    int n = cap - 1;
    n |= n >>> 1;
    n |= n >>> 2;
    n |= n >>> 4;
    n |= n >>> 8;
    n |= n >>> 16;
    return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
}
```

## put方法

1.如果table为null或者长度为0；
我们刚才看了初始化方法，并没有给table加入值，就是一个null.
给table设置初始值：

- 开始为0
那么容量就为默认16，下一个要调整的值为16*负载因子。

- 原来的大小大于0
如果大于最大容量，下一个需要扩容就是最大值，直接返回
老的扩容2倍小于最大值，那么就扩容2倍，下次扩容原来需要扩容的2倍
  
- 如果大小为0.下一次扩容为原来的。

一大堆就是为例确定扩容的大小，以及下次需要扩容的大小。

```java
  Node<K,V>[] oldTab = table;
        int oldCap = (oldTab == null) ? 0 : oldTab.length;
        int oldThr = threshold;
        int newCap, newThr = 0;
        if (oldCap > 0) {
        if (oldCap >= MAXIMUM_CAPACITY) {
        threshold = Integer.MAX_VALUE;
        return oldTab;
        }
        else if ((newCap = oldCap << 1) < MAXIMUM_CAPACITY &&
        oldCap >= DEFAULT_INITIAL_CAPACITY)
        newThr = oldThr << 1; // double threshold
        }
        else if (oldThr > 0) // initial capacity was placed in threshold
        newCap = oldThr;
        else {               // zero initial threshold signifies using defaults
        newCap = DEFAULT_INITIAL_CAPACITY;
        newThr = (int)(DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY);
        }
        if (newThr == 0) {
        float ft = (float)newCap * loadFactor;
        newThr = (newCap < MAXIMUM_CAPACITY && ft < (float)MAXIMUM_CAPACITY ?
        (int)ft : Integer.MAX_VALUE);
        }
        threshold = newThr;
```

### 重新的创建tab

原来就为null,就到此结束，创建一个数组即可。

如果不为null。
从老的里面进行遍历，将原来数组的值设置为null.
（1）如果没有拉链
newTab进行重新hash将值放入新数组。
（2）如果是红黑树，进行split
（3）如果是链表
下一个为，顶点的下一个，如果hash和原来的hash为0，那么就放入低链表，否则放入高链表。
让将值在存入数组中（分为高和低）


扩容（初始化结束）

### 存储数据

如果table为null,那么就直接创建节点

否则：
（1）如果存储的数据和数组下标的值，那么就将节点给变量
（2）如果是树，存放完返回一个节点给变量
（3）进行遍历，
- 如果找到相同的就停止掉
- 未找到就加到结尾，加入之后需要判断是不是需要转换为树

如果链表的长度大于8，那就进行中转换

### 转换为树

如果数组的长度小于64，继续增加数组长度。


转换：
先将链表变为一个双向链表
在转换为红黑树。


## get方法

根据hash找到frist, 如果相等就返回，如果树就从树中找，链表就进行遍历