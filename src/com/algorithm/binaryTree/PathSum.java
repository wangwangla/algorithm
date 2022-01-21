package com.algorithm.binaryTree;

/**
 * @author:28188
 * @date: 2021/7/1
 * @time: 21:52
 *
 *  int pathSum(TreeNode* root, int targetSum) {
 *         if (!root) return 0;
 *         return sumSearch(root, 0, targetSum) +
 *             pathSum(root->left, targetSum) +
 *             pathSum(root->right, targetSum);
 *     }
 *
 * private:
 *     int sumSearch(TreeNode *root, int pre, int sum) {
 *         if (!root) return 0;
 *         pre += root->val;
 *         return (pre == sum) + sumSearch(root->left, pre, sum) +
 *             sumSearch(root->right, pre, sum);
 *     }
 *
 *
 * 给定一个二叉树的根节点 root ，和一个整数 targetSum ，求该二叉树里节点值之和等于 targetSum 的 路径 的数目。
 *
 * 路径 不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 *
 * 作者：fengziluo
 * 链接：https://leetcode-cn.com/problems/path-sum-iii/solution/2chong-jie-fa-xiang-jie-xi-jie-wen-ti-by-txip/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class PathSum {
    /**
     * 根节点计算方式：
     *
     *
     * @param root
     * @param targetNum
     * @return
     */
































    public int pathSum(TreeNode root,int targetNum){
        if (root == null)return 0;
        return sumSearch(root,0,targetNum)+
                pathSum(root.left,targetNum)+
                pathSum(root.right,targetNum);
    }

    public int sumSearch(TreeNode root,int pre,int sum){
        if (root == null)return 0;
        pre += root.val;
        int xx = 0;
        if(pre == sum) xx =1;
        return  xx+ sumSearch(root.left,pre,sum)+sumSearch(root.right,pre,sum);
    }

    private static int num=0;
    public int ss (TreeNode root,int target){
        xxx(root,0,target);
        return 0;
    }

    public void xxx(TreeNode root,int sum,int target){
        if (root == null)return;
        int val = root.val + sum;
        if (val == target){
            num++;
        }
        root.val = val;
        xxx(root.left,val,target);
        xxx(root.right,val,target);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(-3);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(11);
        TreeNode node7 = new TreeNode(3);
        TreeNode node8 = new TreeNode(-2);
        TreeNode node9 = new TreeNode(1);
        node1.left = node2;
        node1.right = node5;
        node2.left = node4;
        node2.right = node5;
        node4.left = node7;
        node4.right = node8;
        node5.right = node9;
        node3.right=node6;
        PathSum sum = new PathSum();
        sum.ss(node1,8);
        System.out.println("==========="+num);
    }

}
