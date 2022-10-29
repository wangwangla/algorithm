package com.zhuanti.binaryTree;

import java.util.ArrayList;

public class _98_isValidBST {
    private ArrayList<Integer> arrayList = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        mid(root);
        if (arrayList.size()<=0)return true;
        int pre = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (pre > arrayList.get(i)){
                return false;
            }
        }
        return true;
    }

    public void mid(TreeNode root){
        mid(root.left);
        arrayList.add(root.val);
        mid(root.right);
    }
}
