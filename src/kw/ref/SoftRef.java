package kw.ref;

import kw.ref.bean.User;

import java.lang.ref.SoftReference;

public class SoftRef {

    public static void main(String[] args) {
//        String str1 = n
        User user = new User();
        SoftReference<User> softReference = new SoftReference<User>(user);
        System.out.println(softReference.get());
        //当空间不足到时候，进行回收  不会造成内存溢出


        //一般的我们可以看那个资源被回收了
    }
}
