package com.zhuanti.erchashu;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 添加备注
 *
 * 执行用时：
 * 1 ms
 * , 在所有 Java 提交中击败了
 * 90.68%
 * 的用户
 * 内存消耗：
 * 38.4 MB
 * , 在所有 Java 提交中击败了
 * 88.34%
 * 的用户
 * 通过测试用例：
 * 34 / 34
 */
public class CengxuBianli {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.push(root);
        while (deque.size()!=0){
            TreeNode poll = deque.poll();
            //访问一个
            System.out.println(poll.val);
            if (poll.left!=null){
                deque.add(poll.left);
            }
            if (poll.right != null) {
                deque.add(poll.right);
            }

        }
        return lists;
    }

    public List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        if (root!=null) {
            deque.push(root);
        }
        while (deque.size()!=0){
            int size = deque.size();
            List<Integer> list = new ArrayList<>();
            while (size>0){
                TreeNode poll = deque.poll();
                //访问一个
                list.add(poll.val);
                if (poll.left!=null){
                    deque.add(poll.left);
                }
                if (poll.right != null) {
                    deque.add(poll.right);
                }
                size --;
            }
            lists.add(list);
        }
        return lists;
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        boolean flag = true;
        if (root!=null) {
            deque.push(root);
        }
        while (deque.size()!=0){
            int size = deque.size();
            ArrayList<Integer> list = new ArrayList<>();
            while (size>0){
                TreeNode poll = deque.poll();
                //访问一个
//                list.(poll.val);
//                这里的插入顺序改变一下就可以了
                if (poll.left!=null){
                    deque.add(poll.left);
                }
                if (poll.right != null) {
                    deque.add(poll.right);
                }
                size --;
            }
            lists.add(list);
        }
        return lists;
    }


    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        CengxuBianli bianli = new CengxuBianli();
        List<List<Integer>> lists = bianli.levelOrder1(node1);
        System.out.println(lists);
    }
}
