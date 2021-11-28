package com.zhuanti.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class Demo04 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    /**
     * 先找到根
     *
     * @param preorder
     * @param p_start
     * @param p_end
     * @param inorder
     * @param i_start
     * @param i_end
     * @return
     */
    private TreeNode buildTreeHelper(int[] preorder, int p_start, int p_end, int[] inorder, int i_start, int i_end) {
        // preorder 为空，直接返回 null
        if (p_start == p_end) {
            return null;
        }
        //前序第一个为根
        int root_val = preorder[p_start];
        TreeNode root = new TreeNode(root_val);
        //在中序遍历中找到根节点的位置
        int i_root_index = 0;
        for (int i = i_start; i < i_end; i++) {
            if (root_val == inorder[i]) {
                i_root_index = i;
                break;
            }
        }
        int leftNum = i_root_index - i_start;
        //递归的构造左子树
        root.left = buildTreeHelper(preorder, p_start + 1, p_start + leftNum + 1, inorder, i_start, i_root_index);
        //递归的构造右子树
        root.right = buildTreeHelper(preorder, p_start + leftNum + 1, p_end, inorder, i_root_index + 1, i_end);
        return root;
    }
    private TreeNode buildTreeHelper1(int[] preorder, int p_start, int p_end, int[] inorder, int i_start, int i_end) {

//        buildTree(preorder,p_start+1,p_start+ ,inorder);
        return null;
    }

    /**
     * 我用的是贪心，所以没有取得最佳结果。
     *
     * 第二个方法是使用图（树），二叉树
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        int xx = 0;
        int yy = 0;
        int num = 0;
        int temp=0;
        for (int i = 0; i < size; i++) {
            List<Integer> list = triangle.get(i);
            temp = list.get(xx);
            yy = xx;
            if (list.size()>xx+1) {
                if (temp>list.get(xx+1)){
                    temp = list.get(xx+1);
                    yy = xx+1;
                }
            }
            if (xx-1>=0){
                if (temp>list.get(xx-1)){
                    temp = list.get(xx-1);
                    yy = xx-1;
                }
            }
            System.out.println(temp);
            num+=num;
            xx = yy;
        }
        return 0;
    }

    public int maxProfit(int[] prices) {
        int dp[] = new int[prices.length];
        dp[0] = 0;
        int min = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i] = Math.max(dp[i-1],prices[i]-min);
            if (min>prices[i]){
                min=prices[i];
            }
        }
        return dp[prices.length-1];
    }

    public int maxProfit1(int[] prices) {
        int dp[] = new int[prices.length];
        dp[0] = 0;
        int min = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i] = Math.max(dp[i-1],prices[i]-min);
            if (min>prices[i]){
                min=prices[i];
            }
        }
        return dp[prices.length-1];
    }
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(-1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(-1);
        list3.add(-3);
//        ArrayList<Integer> list4 = new ArrayList<>();
//        list4.add(4);
//        list4.add(1);
//        list4.add(8);
//        list4.add(3);
        list.add(list1);
        list.add(list2);
        list.add(list3);
//        list.add(list4);

        Demo04 demo04 = new Demo04();
        demo04.minimumTotal(list);

    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
