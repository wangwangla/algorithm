package com.labuladong._1_chapterone;

import com.zhuanti.binaryTree.TreeNode;

public class _1121_BuildTree {


    /**
     * 构建树
     *
     * 开始位置    结束位置
     *
     *          1
     *      2       3
     *   4    5  6    7
     *   前序：1245367
     *   前序：4251637
     *
     *   拆分
     * @param pre
     * @param inorder
     * @return
     */
    public TreeNode buildTree1(int pre[], int inorder[]){
        return helper(0,0,inorder.length-1,pre,inorder);
    }

    public TreeNode helper(int preStart,int inStart,int inEnd,int []pre,int []inorder){
        if (preStart>pre.length-1||inStart>inEnd)return null;
        TreeNode root = new TreeNode(pre[preStart]);
        int index = 0;
        for (int i = inStart;i<inEnd;i++){
            if (inorder[i]==root.val){
                index = i;
                break;
            }
        }
        root.left = helper(preStart+1,inStart,index-1,pre,inorder);
        root.right = helper(preStart+index-inStart+1,index+1,inEnd,pre,inorder);
        return root;
    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder,  inorder, (long)Integer.MAX_VALUE + 1);
    }
    int pre = 0;
    int in = 0;
    private TreeNode buildTreeHelper(int[] preorder, int[] inorder, long stop) {
        //到达末尾返回 null
        if(pre == preorder.length){
            return null;
        }
        //到达停止点返回 null
        //当前停止点已经用了，in 后移
        if (inorder[in] == stop) {
            in++;
            return null;
        }
        int root_val = preorder[pre++];
        TreeNode root = new TreeNode(root_val);
        //左子树的停止点是当前的根节点
        root.left = buildTreeHelper(preorder,  inorder, root_val);
        //右子树的停止点是当前树的停止点
        root.right = buildTreeHelper(preorder, inorder, stop);
        return root;
    }



    public TreeNode bu(int[]prea,int []mida,long stop){
        if (pre == prea.length){
            return null;
        }
        if (mida[in] == stop){
            in++;
            return null;
        }
        int stopV = prea[pre++];
        TreeNode node = new TreeNode(stopV);
        node.left = bu(prea,mida,stopV);
        node.right = bu(prea,mida,stop);
        return node;
    }

    public TreeNode tree(int preStart,int inStart,int inEnd,int []pre,int []inorder){
        if (preStart > pre.length-1 || inStart > inEnd){
            return null;
        }
        TreeNode node = new TreeNode(pre[preStart]);
        int index = 0;
        for (int i = inStart;i<inEnd;i++){
            if (inorder[i] == node.val){
                index = i;
                break;
            }
        }
        node.left = tree(preStart+1,inStart,index-1,pre,inorder);
        node.right = tree(preStart+index-inStart+1,inStart,index+1,pre,inorder);
        return node;
    }

    public static void main(String[] args) {
        int pre[] = {1,2,4,5,3,6,7};
        int mid[] = {4,2,5,1,6,3,7};
        _1121_BuildTree traverse = new _1121_BuildTree();
        TreeNode root = traverse.bu(pre,mid,Integer.MAX_VALUE+1);
        System.out.println("--------------------");
    }
}
