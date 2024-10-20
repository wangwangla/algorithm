package kw.ref;

import kw.ref.bean.User;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceDemo {
    public static void main(String[] args) {
        // 创建一个对象和一个引用队列
        Object obj = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        // 创建一个虚引用指向对象，并与引用队列关联


//        gc before: java.lang.Object@3d24753a
//        gc after: null
        PhantomReference<User> phantomReference = new PhantomReference(obj, referenceQueue);
        Object user = referenceQueue.poll();
        System.out.println("gc before: "+obj); //
        System.gc();
        user = referenceQueue.poll();
        System.out.println("gc after: "+user);
        // 在这里，obj可以随时被回收，phantomReference不会被回收，但也不会再指向原来的对象
        // 可以通过referenceQueue来检查对象是否已经被回收

        // 假设此时obj被回收，那么referenceQueue中应该会有一个对应的引用（但实际上，由于虚引用的特殊性质，我们通常不会直接使用它来获取对象）
        // 注意：虚引用主要用于一些特殊场景，如管理直接内存等，因此上面的代码只是演示了如何创建虚引用，并不代表其实际用途。
    }
}

