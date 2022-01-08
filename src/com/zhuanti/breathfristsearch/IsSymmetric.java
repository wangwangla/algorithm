package com.zhuanti.breathfristsearch;

import com.algorithm.binaryTree.TreeNode;

import java.util.ArrayList;

public class IsSymmetric {
    public static void main(String[] args) {

    }


    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }

    public boolean check(TreeNode root1,TreeNode root2){
        if (root1==null&&root2!=null){
            return false;
        }
        if (root2==null&&root1!=null){
            return false;
        }
        return root1.val == root2.val && check(root1.left,root2.right) && check(root1.right,root2.left);
    }
//
//    public boolean isSymmetric(TreeNode root) {
//        xx(root);
////        System.out.println(arrayList);
//        for (int i = 0; i < arrayList.size(); i++) {
//            if (i>arrayList.size()/2)break;
//            if (arrayList.get(i) != arrayList.get(arrayList.size()-1)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    ArrayList<Integer> arrayList = new ArrayList<>();
//
//    public void xx(TreeNode node){
//        if (node == null)
//        xx(node.left);
//        arrayList.add(node.val);
//        xx(node.right);
//    }
}
