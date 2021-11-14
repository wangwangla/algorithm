package com.zhuanti.erchashu;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 先写一次  前中后遍历
 */
public class Easy01 {
    public static void main(String[] args) {

    }
    private TreeNode  root;
    public void pre(TreeNode node){
        if (node == null)return;
        System.out.println(root.val);
        pre(node.left);
        pre(node.right);
    }

    public void mid(TreeNode node){
        if (node == null)return;
        mid(node.left);
        System.out.println(root.val);
        mid(node.right);
    }

    /**
     * 左到最底部
     * 在出栈
     * 出一次；-使用  去右子树
     * - 右子树右没有左子树
     *
     * @param root
     */
    public void mid2(TreeNode root){
        Deque<TreeNode> deque = new LinkedList<>();
        while (root!=null||!deque.isEmpty()){
            while (root!=null){
                deque.push(root);
                root = root.left;
            }
            root = deque.pop();
            System.out.println(root.val);
            root = root.right;
        }
    }

    public void mid3(TreeNode node){
        Deque<TreeNode> deque = new LinkedList<>();
        while (root != null || !deque.isEmpty()){
            if (root!=null){
                deque.push(root);
                root = root.left;
            }
            root = deque.pop();
            System.out.println(root.val);
            root = root.right;
        }
    }

    public void hou(TreeNode node){
        if (node == null)return;
        hou(node.left);
        hou(node.right);
        System.out.println(root.val);
    }


    /**
     * 中序遍历 是从小到大的
     *
     * @param root
     * @return
     *
     * 我不想存储它，我只想只记住上次的，但是这个测试用例，一直给我两个最小值 。
     *
     * 主要使用了中序遍历  中序遍历是从小到大的
     */
    private TreeNode node1;
    private TreeNode node2;
    private boolean xx = true;
    private int last = Integer.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        tav(root);
        int val = node1.val;
        node1.val = node2.val;
        node2.val = val;
        return xx;
    }

    private void tav(TreeNode root) {
        if(root == null) return;
        tav(root.left);
        if(root.val != Integer.MIN_VALUE){
            if (root.val>last){
                last = root.val;
            }else{
                if (node1 == null){
                    node1 = root;
                }else {
                    node2 = root;
                }
                xx = false;
            }
        }
        tav(root.right);
    }



}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
