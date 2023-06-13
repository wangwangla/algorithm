package com.labuladong.chongfu;

import com.zhuanti.binaryTree.TreeNode;

public class BildTree {
    public void buildTree(int pre[],int mid[]){

    }

    public TreeNode helper(int preStart,int midStart,int midEnd,int pre[],int mid[]){
        if (preStart>pre.length-1 || midStart > midEnd)return null;
        TreeNode root = new TreeNode(pre[preStart]);
        int index = 0;
        for (int i = midStart; i < midEnd; i++) {
            if (mid[i] == root.val){
                index = i;
                break;
            }
        }
        root.left = helper(preStart+1,midStart,midEnd-1,pre,mid);
        root.right = helper(preStart+index+1-midStart,index+1,midEnd,pre,mid);
        return root;
    }
}
