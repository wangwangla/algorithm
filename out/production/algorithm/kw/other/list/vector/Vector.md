# Vector

## 构造函数

//大小  增长因子

```java
public Vector(int initialCapacity, int capacityIncrement){}
public Vector(int initialCapacity) {}
public Vector(){}
```

默认大小10 ，溢出时增加的量

默认直接创建 ArrayList时增加的时候创建。

## add

判断是不是需要扩容，2倍扩容。将值加到末尾

它是线程安全的，所有的方法都加了synchronized
