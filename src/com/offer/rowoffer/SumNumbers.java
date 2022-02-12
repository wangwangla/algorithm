package com.offer.rowoffer;

import com.zhuanti.binaryTree.TreeNode;

/**
 * 补充一下，深度和广度遍历
 */
public class SumNumbers {
    int ans = 0;
    public int sumNumbers(TreeNode root) {
        dfs(root,0);
        return ans;
    }

    public void dfs(TreeNode node,int prevSum){
        if (node==null) {
            return;
        }
        int sum = prevSum * 10 + node.val;
        if (node.left == null&& node.right == null){
            ans += sum;
        }else {
            dfs(node.left, sum);
            dfs(node.right, sum);
        }
    }
}
