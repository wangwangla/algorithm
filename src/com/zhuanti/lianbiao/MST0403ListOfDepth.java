package com.zhuanti.lianbiao;

import com.zhuanti.binaryTree.ListNode;
import com.zhuanti.binaryTree.TreeNode;

import java.util.*;

public class MST0403ListOfDepth {
    public ListNode[] listOfDepth(TreeNode tree) {
        Queue<TreeNode> deque = new LinkedList<>();
        deque.offer(tree);
        List<ArrayList> res = new ArrayList<>();
//        ListNode[] listNodes = new ListNode[]
        while (deque.size()>0){
            ArrayList<Integer> arrayList = new ArrayList<>();
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = deque.poll();
//                System.out.println(poll.val);
                arrayList.add(poll.val);
//                res.add(new ListNode(poll.val));
//                System.out.println();

                if (poll.left != null) {
                    deque.offer(poll.left);
                }
                if (poll.right != null) {
                    deque.offer(poll.right);
                }
            }
            res.add(arrayList);
        }
        for (ArrayList re : res) {
            for (int i = 0; i < re.size(); i++) {
                System.out.print(re.get(i));
            }
            System.out.println();
        }
        return null;
    }
}
