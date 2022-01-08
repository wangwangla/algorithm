package com.algorithm.binaryTree;

/**
 * @author:28188
 * @date: 2021/6/27
 * @time: 18:41
 *
 *
 *
 */
public class isValidBST {

    private int lastVla = Integer.MAX_VALUE;
    private boolean flag = true;
    public boolean isValidBST(TreeNode root) {
        trav(root);
        return flag;
    }

    /**
     * 搜索树的中序遍历是按照从小到大的方式
     * @param root
     */
    public void trav(TreeNode root) {
        if (flag==false)return;
        if (root != null) {
            trav(root.left);
            if (lastVla == Integer.MAX_VALUE){
                lastVla = root.val;
            }else if (lastVla>=root.val){
                flag = false;
            }else {
                lastVla = root.val;
            }
            trav(root.right);
        }
    }



    private boolean xx = true;
    private Integer last = null;
    public boolean isValidBST2(TreeNode root) {

        tav(root);
        return xx;
    }

    private void tav(TreeNode root) {
        if(root == null) return;
        tav(root.left);
        if (last==null){
            last = root.val;
        }else {
            if (root.val > last) {
                last = root.val;
            } else {
                xx = false;
            }
        }
        tav(root.right);
    }
}
