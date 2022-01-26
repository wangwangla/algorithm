package com.labuladong.chapterthree;

import com.algorithm.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _351_Codec {
    /**
     * 数组保存
     * @param root
     */
    ArrayList<Integer> arrayList = new ArrayList<>();
    public void saveOne(TreeNode root){
//        数组存储
        if (root == null){
            arrayList.add(-1);
            return;
        }
        arrayList.add(root.val);
        saveOne(root.left);
        saveOne(root.right);
    }

    public TreeNode descOne(ArrayList<Integer> arrayList){
        if (arrayList.isEmpty())return null;

        int frist = arrayList.remove(0);
        if (frist == -1)return null;
        TreeNode root = new TreeNode(frist);
        root.left = descOne(arrayList);
        root.right = descOne(arrayList);
        return root;
    }

    private ArrayList<Integer> ans = new ArrayList<>();
    public void saveTwo(TreeNode root){
        if (root == null){
            ans.add(-1);
            return;
        }
        saveTwo(root.left);
        saveTwo(root.right);
        ans.add(root.val);
    }

    public TreeNode descTwo(ArrayList<Integer> arrayList){
        if (arrayList.isEmpty())return null;
        int frist = arrayList.remove(arrayList.size()-1);
        if (frist == -1)return null;
        TreeNode root = new TreeNode(frist);
        root.left = descTwo(arrayList);
        root.right = descTwo(arrayList);
        return root;
    }

    ArrayList<Integer> thr = new ArrayList<>();
    public void saveThree(TreeNode root){
        if (root == null){
            thr.add(-1);
            return;
        }
        saveTwo(root.left);
        thr.add(root.val);
        saveTwo(root.right);
    }

    public void cengxu(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if (cur.left!=null){
                queue.offer(cur.left);

            }
        }
    }

//    public TreeNode descThree(ArrayList<Integer> arrayList){
//        if (thr.isEmpty())return null;
//        int frist = arrayList.remove(arrayList.size()-1);
//        if (frist == -1)return null;
//        TreeNode root = new TreeNode(frist);
//        root.left = descTwo(arrayList);
//        root.right = descTwo(arrayList);
//        return root;
//    }




    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2);
        TreeNode root2 = new TreeNode(1);
        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(6);
        root1.left = root2;
        root1.right = root3;
        root2.right = root4;
        _351_Codec codec = new _351_Codec();
        codec.saveTwo(root1);
//        codec.saveOne(root1);
//        System.out.println(codec.arrayList);
//
//        TreeNode desc = codec.descOne(codec.arrayList);
        System.out.println("---------------");
//
    }
}
