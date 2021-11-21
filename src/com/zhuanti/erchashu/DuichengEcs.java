package com.zhuanti.erchashu;


import java.util.ArrayList;
import java.util.List;

public class DuichengEcs {
//    中序遍历，然后倒过来比较数字
//    ----------------------------------------------------------------------------------
    ArrayList<TreeNode> arrayList = new ArrayList<>();
    public boolean isSymmetric(TreeNode root) {
        bianli(root);
        System.out.println("----------------------");
        iscommon();
        return false;
    }

    private boolean iscommon() {
        for (TreeNode node : arrayList) {
            System.out.println(node.val);
        }
        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i).val+"  "+arrayList.get(arrayList.size()-1-i).var);
            if (arrayList.get(i).val != arrayList.get(arrayList.size()-1-i).val) {
                return false;
            }
        }
        return true;
    }

    public void bianli(TreeNode node){
        if (node==null)return;
        bianli(node.left);
        arrayList.add(node);
        bianli(node.right);
    }

//    ------------------------------------------------------------------------
    public boolean isSymmetric1(TreeNode root) {
        check(root,root);
        return false;
    }

    private boolean check(TreeNode root, TreeNode treeNode) {
        if (root==null && treeNode == null){
            return true;
        }
        if (root==null || treeNode == null){
            return false;
        }
        return root.val == treeNode.val && check(root.left,root.right) && check(root.right,root.left);
    }


    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(4);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node6;
        node3.left = node7;
        node3.right = node5;
        DuichengEcs duichengEcs = new DuichengEcs();
        duichengEcs.isSymmetric(node1);

    }
}
