package com.algorithm.binaryTree;

import com.algorithm.Queue;

/**
 * 二叉树
 * 这个key是可以进行比较的，所有可以排序
 * 二叉树
 *  - key value left right
 * @param <Key>
 * @param <Value>
 */
public class SortBinaryTree<Key extends Comparable<Key>,Value> {
    private Node root;
    private int N;
    private class Node{
        public Key key;
        private Value value;
        public Node left;
        public Node right;
        public Node(Key key,Value value,Node left,Node right){
            this.key = key;
            this.value = value;
            this.left = left;
            this.right= right;
        }
    }

    public int size(){
        return N;
    }

    public void put(Key key,Value value){
        root = put(root,key,value);
    }

    /**
     * 加入数据，从第一个开始 存储key 和value，根据key排序
     * 不存在key就增加，存在就覆盖值
     * @param root
     * @param key
     * @param value
     * @return
     */
    public Node put(Node root,Key key,Value value){
        if (root == null){
            N++;
            return new Node(key,value,null,null);
        }
        int comTemp = key.compareTo(root.key);
        if (comTemp>0){
            root.right = put(root.right,key,value);
        }else if (comTemp<0){
            root.left = put(root.left,key,value);
        }else {
            root.value = value;
        }
        return root;
    }

    public Value get(Key key){
        return get(root,key);
    }

    private Value get(Node root, Key key) {
        if (root == null){
            return null;
        }
        int cmp = key.compareTo(root.key);
        if (cmp > 0){
            return get(root.right,key);
        }else if (cmp<0){
            return get(root.left,key);
        }else {
            return root.value;
        }
    }

    public void delete(Key key){
        delete(root,key);
    }

    private Node delete(Node root, Key key) {
        //如果未null就返回null
        if (root == null){
            return null;
        }
        //不为null,就进行查找，最终目的时找出相等的值
        int cmp = key.compareTo(root.key);
        if (cmp > 0){
            root.right = delete(root.right,key);
        }else if  (cmp < 0){
            root.left = delete(root.left,key);
        }else {
            //找到相等的值
            N --;
            //如果左子树未null，就返回右子树
            if (root.right==null){
                return root.left;
            }
            if (root.left==null){
                return root.right;
            }

//            10    删除6      10
//          /                 /
//         6                 7       return minNode
//        /\                /\
//       3  8              3  8
//      /\  /\             /\  /\
//     2  47 9            2  4null 9   将这个置为空麻烦

            //找出最小的值
//            Node minNode = new Node(root.right.key,root.right.value,null,null);
            Node minNode = root.right;
            Node preNode = root;
            while (minNode.left != null){
                preNode = minNode;
                minNode = minNode.left;
            }
            Node node = new Node(minNode.key,minNode.value,null,null);
            if (preNode.right.key == minNode.key){
                preNode.right = null;
            }else {
                preNode.left = null;
            }
            //将哪个结点变为nul
            node.left = root.left;
            node.right = root.right;
            root = node;
        }
        return root;
    }

    public Queue<Key> Les(){
        Queue<Key> keys = new Queue<Key>();
        Queue<Node> nodes = new Queue<>();
        nodes.enqueue(root);
        while (!nodes.idEmpty()){
            Node node = nodes.dequeue();
            keys.equals(node.key);
            if (node.left!=null) {
                nodes.enqueue(node.left);
            }
            if (node.right!=null) {
                nodes.enqueue(node.right);
            }
        }
        return keys;
    }

    /**
     * 求树高
     *
     * 左右节点 最大值 +1
     * @param node
     * @return
     */
    public int depth(Node node){
        if (node == null){
            return 0;
        }
        int max = 0;
        int maxR = 0;
        int maxL = 0;

        if (node.left!=null){
            maxL = depth(node.left);
        }
        if (node.right!=null){
            maxR = depth(node.right);
        }
        max = Math.max(maxL,maxR)+1;
        return max;
    }
    public static void main(String[] args) {
        SortBinaryTree<Integer,String> sortBinaryTree = new SortBinaryTree<>();
        sortBinaryTree.put(5,"a");
        sortBinaryTree.put(3,"b");
        sortBinaryTree.put(4,"c");
        sortBinaryTree.put(2,"d");


        System.out.printf("输出："+ sortBinaryTree.size());
        sortBinaryTree.delete(3);
        System.out.println(sortBinaryTree.size());
    }
}
