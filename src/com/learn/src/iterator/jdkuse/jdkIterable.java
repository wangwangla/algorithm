package com.learn.src.iterator.jdkuse;

import java.util.function.Consumer;

/**
 * 迭代器是一个工厂方法啊
 *
 * 迭代是怎样使用工厂模式的
 * 每次遍历的时候，会调用iterator方法。就会创建一个迭代对象
 *
 * @param <T>
 */
public interface jdkIterable<T> {
    jdkIterator<T> iterator();

    /**
     * 1.8之后接口不仅仅只有为实现的方法
     */
    /**
     * @since 1.8
     */
    default void forEach(Consumer<? super T> action) {
//        Objects.requireNonNull(action);
//        for (T t : this) {
//            action.accept(t);
//        }
    }

    /**
     * @since 1.8
     * 这个是处理流操作
     */
//    default Spliterator<T> spliterator() {
//        return Spliterators.spliteratorUnknownSize(iterator(), 0);
//    }
}
