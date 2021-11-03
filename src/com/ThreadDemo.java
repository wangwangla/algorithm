package com;

public class ThreadDemo {
    Thread thread = new Thread();

    public static void main(String[] args) {
        ClassLoader classLoader = ThreadDemo.class.getClassLoader();
        ClassLoader loader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return super.loadClass(name);
            }
        };
    }
}
