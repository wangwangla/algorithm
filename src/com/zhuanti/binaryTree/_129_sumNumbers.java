package com.zhuanti.binaryTree;

import com.beust.ah.A;

import java.util.ArrayList;

public class _129_sumNumbers {

    private ArrayList<Integer> arrayList = new ArrayList<>();
    public int sumNumbers(TreeNode root) {
        pre(root);
        return result;
    }

    int result = 0;
    public void pre(TreeNode root){
        if (root==null)return;
        arrayList.add(root.val);
        if(root.left==null && root.right == null){
            int xx = 0;
            for (Integer integer : arrayList) {
                xx = xx*10+integer;
            }
            result += xx;
            arrayList.remove(arrayList.size()-1);
            System.out.println();
            return;
        }
        pre(root.left);
        pre(root.right);
        arrayList.remove(arrayList.size()-1);
    }
}
