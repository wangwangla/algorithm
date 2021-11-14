package com.zhuanti.erchashu;

/**
 * 二叉树的一个小总结
 *
 *
 */
public class Learn01 {
    /**
     * 不变的骨架
     *
     * */
    public void bianli(TreeNode node){
        if (node == null)return;
        bianli(node.left);
        bianli(node.right);
    }
    /*
    * 遍历
    * */
    public void bianli1(TreeNode node){
        if (node == null)return;
        //前序
        bianli1(node.left);
        //中序
        bianli1(node.right);
        //后续
    }

    public boolean isSame(TreeNode node1,TreeNode node2){
        if (node1 == null && node2 == null)return true;
        if (node1 == null || node2 == null)return false;
        if (node1.val != node2.val)return false;
        return isSame(node1.left,node2.left) && isSame(node1.right,node2.right);
    }



    //相同的树


}
