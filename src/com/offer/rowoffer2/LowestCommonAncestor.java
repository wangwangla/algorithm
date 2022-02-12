package com.offer.rowoffer2;

import com.zhuanti.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 *
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 *
 * 例如，给定如下二叉树:  root = [3,5,1,6,2,0,8,null,null,7,4]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q ==root){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

//        left == null 说明没有
//        right
        return null;
    }


    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> pl = new ArrayList<>();
        ArrayList<TreeNode> ql = new ArrayList<>();
        List<TreeNode> node = findNode(root, pl, p);
        List<TreeNode> node1 = findNode(root, ql, q);

        return null;
    }

    private List<TreeNode> findNode(TreeNode treeNode, ArrayList list, TreeNode target){

        if (treeNode==null)return null;
        list.add(treeNode);
        if (treeNode.val == target.val){
            return new ArrayList<>(list);
        }
        List l = findNode(treeNode.left,list,target);
        List r = findNode(treeNode.left,list,target);
        if (l!=null)return l;
        if (r != null) return r;
        return null;
    }

}
