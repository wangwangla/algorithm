package com.offer;

/**
 * @author:28188
 * @date: 2021/4/14
 * @time: 7:51
 *
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *
 *  
 *
 * 例如，给出
 *
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * 思路：
 *    A
 *  /  \
 * B    C
 *
 * 前序：ABC
 * 中序：BAC
 *
 * 思路：
 *   前序第一个为第一个数据为  3 ，那么开始第一个数据就是3
 *   然后中序将二者进行分开    9   和  15  20  7 两组
 *
 *        3
 *      /  \
 *     9   15   20  7
 *
 *    看前序第一个为20，那么根据中序在分组   15  7
 *        3
 *      /  \
 *     9   20    15 7
 *
 *     根据中序的顺序
          3
 *      /  \
 *     9   15
 *         / \
 *        20  7
 *
 *
 */
public class Question05 {

//    Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        第一个前序   然后进行分组
        int frist = preorder[0];
//        根据中序分组
//        inorder  分组
//        分组结束   前序
        return null;
    }
}
