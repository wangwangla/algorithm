package kw.other.readsrc;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Hashtable;

public class HashMpSrc {
    public static void main(String[] args) {
        //增加因子0.75F
        HashMap hashMap = new HashMap();
        /**
         *  存储在一个node数组中
         * 如果数组节点为null，那么就直接创建
         * 将数据放在这个节点上
         *
         * 如果不为null
         * hash是不是相同的（同） key相同  更新值
         * 如果是二叉树，那么就加入到 二叉树中
         * 如果都不是，那么久创建一个一个节点，插入到链表的末端，如果这个时候
         * 链表的长度大于7，那么就转换为二叉树。中间找到了，那就直接中间替换掉
          */
        hashMap.put("xx","xx");

        hashMap.get("xx");

        Hashtable hashtable = new Hashtable();
        hashtable.put("x","x");
//        NullPointerException
//        FileNotFoundException
    }
}
