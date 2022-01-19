# TreeMap

TreeSet是对TreeMap的一层封装

##  常量

```java
//treemap需要排序
private final Comparator<? super K> comparator;
private transient Entry<K,V> root;
private transient int size = 0;
//修改次数，主要是为并发做的，比如在遍历的时候，执行了其他修改操作，就会抛出异常。
private transient int modCount = 0;
```

## Entry

节点是一个红黑树节点，有key value left right 和颜色

```java
static final class Entry<K,V> implements Map.Entry<K,V> {
    K key;
    V value;
    Entry<K, V> left;
    Entry<K, V> right;
    Entry<K, V> parent;
    boolean color = BLACK;
}
```

set值返回原来的值  

相等判断：
比较key和value





































