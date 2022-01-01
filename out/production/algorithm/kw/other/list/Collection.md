# Collection

Collection继承了Iterable,实现可以是使用增强for循环，包含的方法有
```java
Iterator<T> iterator();
default void forEach(Consumer<? extends T> action)
```

## List接口继承了Collection

## ArrayList实现了List接口

## RandomAccess

随机访问速度会更快。

##  Cloneable

当一个类使用克隆接口标识，就表示可以使用克隆创建新的对象，对于克隆存在前克隆和深克隆。

### 浅拷贝

```java

public class Animal implements Cloneable{
    private String type;
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Animal clone() throws CloneNotSupportedException {
        return (Animal) super.clone();
    }
}
```


### 深拷贝

深拷贝重点代码
```java
@Override
    public Dog clone() throws CloneNotSupportedException {
        Dog dog = (Dog) super.clone();
        dog.type = type.clone();
        return dog;
    }
```

完整代码实现

```java
package kw.other.list.clone;

public class Type implements Cloneable{
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public Type clone() throws CloneNotSupportedException {
        return (Type) super.clone();
    }
}


package kw.other.list.clone;

public class Dog implements Cloneable {
    private String name;
    private Type type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public Dog clone() throws CloneNotSupportedException {
        Dog dog = (Dog) super.clone();
        dog.type = type.clone();
        return dog;
    }
}



package kw.other.list.clone;

public class DepthClone {
    public static void main(String[] args) {
        try {
            Dog dog = new Dog();
            Type type = new Type();
            type.setType(2);
            dog.setName("wngwng");
            dog.setType(type);
            System.out.println(dog.getType()+"-----------"+dog.getType().getType());
            Dog clone = (Dog) dog.clone();
            Type type1 = clone.getType();
            type1.setType(4);

            System.out.println(dog.getType()+"-----------"+dog.getType().getType());
            System.out.println(clone.getType()+"--------------"+clone.getType().getType());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}


```

## Serializable

实现序列化的目的是当需要将类写入文件的时候使用，它用来标识这个类需要进行序列化操作，否则在写入读取就会出现错误。

```java
public class People implements Serializable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


写和读取
People people = new People();
people.setAge(210);
people.setName("khhhhw");
ObjectOutputStream inputStream = new ObjectOutputStream(new FileOutputStream(new File("1.txt")));
inputStream.writeObject(people);
inputStream.flush();
inputStream.close();

ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("1.txt"));
People people1 = (People) objectInputStream.readObject();
System.out.println(people1.getAge()+"--"+people1.getName());

```
## 构造方法

一共有三个
1.第一个

```java
public ArrayList() {
    //将默认的空数组给赋值
    this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
}
```

2.一个参数

```java
public ArrayList(int initialCapacity) {
    if (initialCapacity > 0) {
        this.elementData = new Object[initialCapacity];
    } else if (initialCapacity == 0) {
        this.elementData = EMPTY_ELEMENTDATA;
    } else {
        throw new IllegalArgumentException("Illegal Capacity: "+
                                           initialCapacity);
    }
}

如果大小大于0，那么就创建一个指定大小的
如果等于0，那么就给一个空的（空和上面的默认空不一样）
```

3.参数为一个集合的

```java
 public ArrayList(Collection<? extends E> c) {
        Object[] a = c.toArray();
        if ((size = a.length) != 0) {
            if (c.getClass() == ArrayList.class) {
                elementData = a;
            } else {
                elementData = Arrays.copyOf(a, size, Object[].class);
            }
        } else {
            // replace with empty array.
            elementData = EMPTY_ELEMENTDATA;
        }
    }
```

如果个数为0，那么就给一个空数组

如果不等于0，如果是ArrayList，那么就直接赋值

如果不是ArrayList的，那就进行赋值值。

## add方法

在增加之前先进行一次扩容操作 

### 扩容

如果是默认的空数组，那么就返回默认的数组大小10.
然后修改进行一次加操作。
再次判断加过之后的大小，大于数组中数据的大小，那么就进行一次扩容

扩容过程
- 如果传入的大小大于原来的1.5倍，那么就使用传入的值
- 如果大于最大值，（最大值+1等于负数），那么就是内存溢出
  如果大于最大值-8，那么就等于最大值。
  

### 数组元素的复制

```java
 public static <T,U> T[] copyOf(U[] original, int newLength, Class<? extends T[]> newType) {
    @SuppressWarnings("unchecked")
    T[] copy = ((Object)newType == (Object)Object[].class)
        ? (T[]) new Object[newLength]
        : (T[]) Array.newInstance(newType.getComponentType(), newLength);
    System.arraycopy(original, 0, copy, 0,
                     Math.min(original.length, newLength));
    return copy;
}
```

1.add一个值

将值放在数组的末尾
```java
public boolean add(E e) {
    ensureCapacityInternal(size + 1);  // Increments modCount!!
    elementData[size++] = e;
    return true;
}
```




