package com.labuladong.chapterthree;

import com.algorithm.binaryTree.TreeNode;

public class _331_BinaTree {
    public void traverse(TreeNode treeNode){
        traverse(treeNode);
        traverse(treeNode);
    }

    public void plusOne(TreeNode treeNode){
        if (treeNode == null)return;
        treeNode.val += 1;
        plusOne(treeNode.left);
        plusOne(treeNode.right);
    }

    public boolean isSampleTree(TreeNode root1,TreeNode root2){
        if (root1 == null && root2 == null)return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;
        return isSampleTree(root1.left,root2.left)&&isSampleTree(root1.right,root2.right);
    }

    public boolean isVTree(TreeNode root){
        if (root == null)return true;
        return isVTree(root.left,root.right);
    }

    public boolean isVTree(TreeNode left,TreeNode right){
        if (left == null && right == null)return true;
        if (left ==  null || right == null)return false;
        if (left.val != right.val)return false;
        return isVTree(left.left,right.right)
                && isVTree(left.right,right.left);
    }

    /**
     * 不确定  ？？？？？？？？？？？
     */
    private int lastVal ;
    public boolean isVaildBST(TreeNode root){
        isVTree(root.left);
        if (lastVal == Integer.MAX_VALUE) {
            lastVal = root.val;
        }else {
            if (root.val <= lastVal)return false;
            lastVal = root.val;
        }
        isVTree(root.right);
        return true;
    }

    public boolean isInBST(TreeNode root,int target){
        if (root == null)return false;
        if (root.val == target)return true;
        return isInBST(root.left,target)||isInBST(root.right,target);
    }

    public boolean isInBST1(TreeNode root,int target){
        if (root == null)return false;
        if (root.val == target)return true;
        if (root.val < target){
            isInBST(root.right,target);
        }else {
            isInBST(root.left,target);
        }
        return false;
    }

    public TreeNode insertBST(TreeNode root,int val){
        if (root == null)return new TreeNode(val);
        if (root.val == val){
            return root;
        }
        if (root.val <val){
            root.left = insertBST(root,val);
        }else if (root.val>val){
            root.right = insertBST(root,val);
        }
        return root;
    }

    public TreeNode deleteNode(TreeNode root,int val){
        if (root == null)return null;
        if (root.val == val){
//            return root;
            if (root.left == null && root.right == null){
                return null;
            }else if (root.left==null){
                return root.right;
            }else if (root.right == null){
                return root.left;
            }else {

            }
        }
        if (root.val <val){
            root.left = insertBST(root,val);
        }else if (root.val>val){
            root.right = insertBST(root,val);
        }
        return root;
    }

    public int numsNodes(TreeNode node){
        if (node == null)return 0;
        return 1 + numsNodes(node.left) + numsNodes(node.right);
    }

    public int numsNode(TreeNode root){
        int h = 0;
        while (root!=null){
            root = root.left;
            h++;
        }
        return (int)Math.pow(2,h)+1;
    }

    public int count(TreeNode root){
        TreeNode l = root;
        TreeNode r = root;
        int hl = 0;
        int hr = 0;
        while (l != null){
            l = l.left;
            hl ++;
        }
        while (r != null){
            r = r.right;
            hr ++ ;
        }

        if (hl == hr)return (int)Math.pow(2,hl) + 1;
        return 1 + count(root.left) + count(root.right);
    }

    public void codec(){

    }

}