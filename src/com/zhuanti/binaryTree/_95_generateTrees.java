package com.zhuanti.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个整数 n ，请你生成并返回所有由 n 个节点组成且节点值从 1 到 n 互不相同的不同 二叉搜索树 。
 * 可以按 任意顺序 返回答案。
 * 输入：n = 3
 * 输出：[[1,null,2,null,3],[1,null,3,2],[2,1,3],[3,1,null,null,2],[3,2,null,1]]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/unique-binary-search-trees-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _95_generateTrees {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0){
            return new ArrayList<>();
        }
        return generateTrees(1,n);
    }

    public List<TreeNode> generateTrees(int start,int end){
        List<TreeNode> list = new ArrayList<>();
        //为null的时候就基本已经结束了
        if (start > end){
            list.add(null);
            return list;
        }

        for (int i = start; i < end; i++) {
            List<TreeNode> leftNodes = generateTrees(start,i-1);
            List<TreeNode> rightNodes = generateTrees(i+1,end);
            for (TreeNode leftNode : leftNodes) {
                for (TreeNode rightNode : rightNodes) {
                    TreeNode current = new TreeNode(i);
                    current.left = leftNode;
                    current.right = rightNode;
                    list.add(current);
                }
            }
        }
        return list;
    }

    /**
     * 只返回个数
     * 0个数字为1  1个数字为1
     * 2个数字 左边的个数 * 右边的个数
     * @param n
     * @return
     */
    public int numTrees(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int i1 = 1; i1 <= i; i1++) {
                //左边  * 右边
                dp[i] += dp[i1 - 1] * dp[i-i1];
            }
        }
        return dp[n];
    }


}

















