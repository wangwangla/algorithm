package com.algorithm._4_tree;

//import com.sun.org.apache.regexp.internal.RE;
//import sun.plugin2.ipc.windows.WindowsIPCFactory;

/**
 * 我认为这个很重要的地方技术  左右旋转，
 * 什么时候需要变色
 *
 * 删除数据增加 数据
 *
 * 性质：
 * a.左子树 小于根  右子树大于根
 *
 * 保证每条路径都不比其他路径超出两倍
 *
 * 根节点黑的，
 * 一个红节点，两个黑节点
 * 任意路径从头到尾都有相同的黑节点
 *
 * 加入节点都是红的
 * 那么 会出现几种情况
 * a.左边不为红    右为红就进行旋转
 * b.左边为红  左边的左边为红
 *
 *
 *
 * 左树为红，右树不为红
 * 只能有一个红 不可以连续
 * 根节点为黑
 * 红节点接两个黑节点
 * null为黑节点
 *
 * @param <Key>
 * @param <Value>
 */
public class RedBlackTree<Key extends Comparable<Key>,Value> {
    //根结点
    private Node root;
    //记录树中的元素的个数
    private int N;
    //红色链接
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    /**
     * 红黑树
     * a.表示颜色
     * b.左孩子
     * c.右孩子
     * d.key
     * e.value
     */
    private class Node{
        public Key key;
        public Value value;
        public Node left;
        public Node right;
        public boolean color;

        public Node(Key key,Value value,Node left,Node right,boolean color){
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
            this.color = color;
        }
    }

    public int size(){
        return N;
    }

    public boolean isRed(Node x){
        if (x == null){
            return false;
        }
        return x.color == RED;
    }


    public Node rotateLeft(Node h){
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }
    /**
     * you旋
     * 举例子
     *       10                     8
     *      / \                    / \
     *     8   11    旋转         7   10
     *    / \                        / \
     *   7   9                      9   11
     *  现在是8 ,8就是代码中的x    x.right = 9  ,将9给了left
     *
     *  坐旋转类似
     * @param h
     * @return
     */
    public Node rotateRight(Node h){
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    public void flipColor(Node h){
        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }

    public void put(Key key,Value value){
        root = put(root,key,value);
        //根节点黑
        root.color = BLACK;

    }

    private Node put(Node root, Key key, Value value) {
        //插入的节点是一个红节点
        if (root == null){
            N++;
            root = new Node(key,value,null,null,RED);
            return root;
        }
        int cmp = root.key.compareTo(key);
        //插入的小于当前值，去左分支   否则去右分支  等于就将值覆盖
        if (cmp>0){
            root.left = put(root.left,key,value);
        }else if (cmp<0){
            root.right = put(root.right,key,value);
        }else {
            root.value = value;
        }


        //右边为红，需要左旋转
        if (!isRed(root.left)&&isRed(root.right)) {
            root = rotateLeft(root);
        }
        //需要右旋转
        if (isRed(root.left)&&isRed(root.left.left)){
            root = rotateRight(root);
        }
        //左右都为红，需要翻转
        if (isRed(root.left)&&isRed(root.right)){
            flipColor(root);
        }
        return root;
    }

    public Node get(Key key){
        return getNode(root,key);
    }

    private Node getNode(Node root, Key key) {
        if (root==null){
            return null;
        }
        int com = root.key.compareTo(key);
        if (com < 0){
            return getNode(root.right,key);
        }
        else if (com>0){
            return getNode(root.left,key);
        }else {
            return root;
        }
    }

    public static void main(String[] args) {
        RedBlackTree<Integer,Integer> tree = new RedBlackTree();
        tree.put(80,80);
        tree.put(20,20);
        tree.put(30,30);
        tree.put(40,80);
        tree.put(120,80);
        tree.put(25,80);
        System.out.println("-------------------");
    }
}
