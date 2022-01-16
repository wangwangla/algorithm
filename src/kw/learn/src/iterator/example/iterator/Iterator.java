package kw.learn.src.iterator.example.iterator;

/**
 * 类似于一个循环变量
 */
public interface Iterator<T> {
    public abstract boolean hasNext();
    public abstract T next();
}
