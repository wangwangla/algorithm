package com.offer.rowoffer;

import com.beust.ah.A;
import com.zhuanti.binaryTree.TreeNode;

import java.util.ArrayList;

public class PathSum {
    ArrayList<Integer> arrayList = new ArrayList<>();
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        int ret = rootSum(root, targetSum);
//        ret += pathSum(root.left, targetSum);
//        ret += pathSum(root.right, targetSum);
        return ret;
    }

    private int rootSum(TreeNode root, int targetSum) {
        int ret = 0;
        if (root == null){
            return 0;
        }

        int val = root.val;
        if (val == targetSum){
            ret ++;
        }
        ret += rootSum(root.left ,targetSum - val);
        ret += rootSum(root.right,targetSum - val);

        return ret;
    }

}
