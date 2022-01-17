# AbstractSequentialList

## get方法

通过下标由迭代器中获取值。

```java
public E get(int index) {
        try {
        return listIterator(index).next();
        } catch (NoSuchElementException exc) {
        throw new IndexOutOfBoundsException("Index: "+index);
    }
}
```

迭代器是通过孩子实现的。

## set

set如果没有值，那么就抛出异常。

```java
 public E set(int index, E element) {
    try {
        ListIterator<E> e = listIterator(index);
        E oldVal = e.next();
        e.set(element);
        return oldVal;
    } catch (NoSuchElementException exc) {
        throw new IndexOutOfBoundsException("Index: "+index);
    }
}
```

## add 

得到迭代器 执行add方法

## remove