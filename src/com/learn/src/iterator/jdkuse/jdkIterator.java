package com.learn.src.iterator.jdkuse;

import java.util.function.Consumer;

/**
 * 下一个  是否有下一个
 * 删除方法
 *
 * 增强for循环，加了forEachRemaining
 */
public interface jdkIterator<E> {
    boolean hasNext();
    E next();
    default void remove() {
        throw new UnsupportedOperationException("remove");
    }
    default void forEachRemaining(Consumer<? super E> action) {
//        Objects.requireNonNull(action);
//        while (hasNext())
//            action.accept(next());
    }
}
