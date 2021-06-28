package com.binaryTree;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

/**
 * @author:28188
 * @date: 2021/6/27
 * @time: 18:41
 *
 *
 */
public class Questiion07 {

    private int lastVla = Integer.MAX_VALUE;
    private boolean flag = true;
    public boolean isValidBST(TreeNode root) {
        trav(root);
        return flag;
    }

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

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
}
