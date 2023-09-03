# HashMap

## 全局变量

DEFAULT_INITIAL_CAPACITY默认的大小  16
MAXIMUM_CAPACITY最大的大小   1<<30
DEFAULT_LOAD_FACTOR扩容因子    0.75
TREEIFY_THRESHOLD树形因子    8
MIN_TREEIFY_CAPACITY最小树阈值    64

## 节点

Node{
    int hash;
    K key;
    V value;
}

## 存储变量

Node<K,V> table[];

## 构造函数

//初始化大小   扩容因子
public HashMap(int initialCapacity, float loadFactor) {
}

public HashMap(int initialCapacity) { this(initialCapacity, DEFAULT_LOAD_FACTOR); }

public HashMap() { this.loadFactor = DEFAULT_LOAD_FACTOR; // all other fields defaulted }

1)如果初始化大小小于0，非法
2)等于最大值，就等于最大值
3)初始化大小进行修正
cap - 1;得到2的n次方

## put方法

public V put(K key, V value) {}

```java

Node<K,V>[] tab; //局部数组，将table给它
Node<K,V> p; //每一个节点的头
int n; //数组长度
int i; //加入的下标
//tab等于null，初始化的时候值设置了大小和扩展因子
if ((tab = table) == null ||
        (n = tab.length) == 0)
//重新计算大小，给table赋值
    n = (tab = resize()).length;
//如果当前位置没有占用，那么就创建一个节点给这个给位置
if ((p = tab[i = (n - 1) & hash]) == null)
    tab[i] = newNode(hash, key, value, null);
else {
//    如果占用了
    Node<K,V> e; 
    K k;
//    hash相同
    if (p.hash == hash &&
//        key相同
        ((k = p.key) == key
//        值相同
        || (key != null && key.equals(k))))
//        把当前的节点给e
        e = p;
//    现在分为两个：一个是链表一个是红黑树
    else if (p instanceof TreeNode)
        e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
    else {
//        如果是链表，那就进行遍历
        for (int binCount = 0; ; ++binCount) {
//            找到结尾
            if ((e = p.next) == null) {
//                将值放到结尾
                p.next = newNode(hash, key, value, null);
//                到达可以转为链表的时候就进行一个转换
                if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                    treeifyBin(tab, hash);
                break;
            }
            如果节点冲突，那么就将节点进行替换
            if (e.hash == hash &&
                ((k = e.key) == key || (key != null && key.equals(k))))
                break;
            p = e;
        }
    }
//    如果冲突，就会存在一个不为null的返回值
    if (e != null) { // existing mapping for key
        V oldValue = e.value;
        if (!onlyIfAbsent || oldValue == null)
            e.value = value;
        afterNodeAccess(e);
        return oldValue;
    }
}
++modCount;
if (++size > threshold)
    resize();
afterNodeInsertion(evict);
return null;
```

1.判断tab是不是为null

2.如果不是，那么就判断hash的位置是不是为null

    是：那就直接创建节点给当前数组下标

    不是：
        (1)头节点是不是 
            是：当前节点给一个变量
        (2)是不是一个tree 
            是：加入返回一个节点给变量
        (3)链表：存在  不存在
            存在：当前节点给一个变量
            不存在：这个变量为null，节点加到结尾

3.这个变量有什么用

3.1.如果不为null,

将原来的值得到。如果为null，那就返回当前将要加入的值

3.2.如果为null

大小加1，然后查看是不是需要扩容。

## 如何进行转换

1.如果数组为null,大小小于64，就进行一次扩容

```java
if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
```

2.当前节点不为null

得到hash下标的头节点，然后对节点进行遍历。形成双向链表.
在转红黑树(学完红黑树回来补)


## resize方法

1.得到老的大小

2.范围判断

3.一大堆判断,

4.创建一个数组

5.数组操作

5.1.遍历old数组

如果old位置不为null

1).只有头，那么就重新计算一个下标，将头放进去

2).树，那就进行拆分

3).最后如果是链表

- 进行遍历是逃不过了
  
- hash为0特殊处理，好像是放nullkey的

进行hash得到得到和为0和不为0的，然后将它们给新的数组下标。

## get

get方法通过散列得到数组的下标

(1)第一个下标不为null，存在值，并且相等，那么就返回
(2)如果头的下一个不为null,就判断第一个节点是不是TreeNode的节点
(3)链表，从头到尾进行判断；

## reset

原来的长度大于0，如果原理的容量大于最大容量就直接返回。
否则就扩容为2倍。





