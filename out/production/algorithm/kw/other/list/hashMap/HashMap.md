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

Node<K,V> table;


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





