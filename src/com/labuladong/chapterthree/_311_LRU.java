package com.labuladong.chapterthree;

import com.sun.corba.se.impl.orb.NormalParserData;

/**
 * 缓存淘汰算法
 */
public class _311_LRU {
    class Node{
        public int key,value;
        public Node next,pre;
        public Node(int k,int v){
            this.key = k;
            this.value = v;
        }
    }

    class DoubleList{
        private Node head;
        private Node tail;
        private int size;

    }
}
