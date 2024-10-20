package kw.ref;

import java.lang.ref.WeakReference;

public class WeakReferenceExample {
    public static void main(String[] args) {
        // 创建一个对象和一个弱引用指向它
        Object obj = new Object();
        WeakReference<Object> weakReference = new WeakReference<>(obj);

        System.out.println(weakReference.get());
        for (int i = 0; i < 10000; i++) {

            byte[] c = new byte[1000000];
        }
        System.gc();
        if (weakReference!=null) {
            System.out.println(weakReference.get());
        }
        //但是我并未看到null
        // 在这里，obj可能随时被回收，weakReference将变为null
        // 可以在这里进行其他操作，但要注意weakReference可能为null
    }
}