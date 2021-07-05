package com.hanshunping.lianbiao;

/**
 * @author:28188
 * @date: 2021/7/3
 * @time: 17:51
 */
public class Node<T> {
    public T data;
    public LianBiaoHaveHead.Node<T> next;
    public Node(T data){
        this.data = data;
        next = null;
    }
}
