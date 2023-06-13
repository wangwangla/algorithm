package com.letcode;

import com.algorithm._5_graph.Graph;
import com.zhuanti.linklist.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * n叉树和二叉树一样
 */
public class _590_Poster {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public void helper(Node root, List<Integer> res) {
        if (root == null) {
            return;
        }
//        for (Node ch : root.children) {
//            helper(ch, res);
//        }
//        res.add(root.val);
    }
}
