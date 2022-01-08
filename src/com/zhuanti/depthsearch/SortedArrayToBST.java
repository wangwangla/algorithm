package com.zhuanti.depthsearch;

import com.algorithm.binaryTree.TreeNode;

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return def(nums,0,nums.length);
    }

    public TreeNode def(int[] arr,int low ,int hi){
        if (low < hi){
            int mid = (low + hi) / 2;
            TreeNode node = new TreeNode(arr[mid]);
            node.left = def(arr,low,mid-1);
            node.left = def(arr,mid+1,hi);
            return node;
        }
        return null;
    }
}
