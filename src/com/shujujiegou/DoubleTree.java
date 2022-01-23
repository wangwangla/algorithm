package com.shujujiegou;

import com.algorithm.binaryTree.TreeNode;

public class DoubleTree {
    void traverse(TreeNode node){
        if (node == null)return;
        traverse(node.left);
        traverse(node.right);
    }

    /**
     * add one
     * @param node
     */
    void addOne(TreeNode node){
        if (node == null)return;
        node.val ++;
        addOne(node.left);
        addOne(node.right);
    }

    /**
     * 两个链表相同
     * @param root1
     * @param root2
     * @return
     */
    boolean isSampleTree(TreeNode root1,TreeNode root2){
        if (root1 == null && root2 == null)return true;
        if (root1 == null || root2 == null)return false;
        if (root1.val != root2.val)return false;
        return isSampleTree(root1.left,root2.left) && isSampleTree(root1.right,root2.right);
    }

    boolean isVaildBST(TreeNode root){
        return isVaildBST(root,null,null);
    }

//    判断合法性
    private boolean isVaildBST(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null)return true;
        if (min!=null && min.val >= root.val)return false;
        if (max!=null && max.val <= root.val)return false;
        return isVaildBST(root.left,min,root) && isVaildBST(root.right,root,max);
    }

    boolean isInTree(TreeNode root,int target){
        if (root == null) return false;
        if (root.val == target)return true;
        return isInTree(root.left,target)
                ||isInTree(root.right,target);
    }

    boolean isInBST(TreeNode root,int target){
        if (root == null)return false;
        if (root.val == target)return true;
        if (root.val > target){
            return isInTree(root.left,target);
        }else {
            return isInTree(root.right,target);
        }
    }

    TreeNode insertIntoBST(TreeNode root,int target){
        if (root == null) return new TreeNode(target);
        if (root.val == target)return root;
        if (root.val > target){
            root.left = insertIntoBST(root.left,target);
        }else {
            root.right = insertIntoBST(root.right,target);
        }
        return root;
    }

    TreeNode deleteIntoBST(TreeNode root,int target){
        if (root == null) return null;
        if (root.val == target){
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
//            if (root.left)
        }
        if (root.val > target){
            root.left = deleteIntoBST(root.left,target);
        }else {
            root.right = deleteIntoBST(root.right,target);
        }
        return root;
    }



    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(6);
        TreeNode node5 = new TreeNode(20);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        DoubleTree tree = new DoubleTree();
        System.out.println(tree.isVaildBST(node1));
    }
}
