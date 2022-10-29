package com.labuladong._1_chapterone;

import com.zhuanti.binaryTree.BuildTree;
import com.zhuanti.binaryTree.ListNode;
import com.zhuanti.binaryTree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class _112_Traverse {
    /*************        数组      ***********/
    private void traverse1(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /*************        链表      ***********/
    private void travese2(ListNode head){
        for (ListNode node = head;node!=null;node= node.next){
            System.out.println(node.val);
        }
    }

    /************    链表前后续      ***************/
    private void travese3(ListNode head){
        ListNode temp = head;
        while (temp!=null){
            System.out.println(temp);
            temp = temp.next;
        }
    }


    private void travese4(ListNode head){
        if (head == null)return;
        System.out.println("前序 : "+ head.val);
        travese4(head.next);
        System.out.println("后序 : "+ head.val);
    }


    private void traverse2(ListNode head){
        if (head==null){
            return;
        }
        System.out.println("链表前序");
        travese2(head.next);
        System.out.println("链表后");
    }


    //    反转   后序
    public ListNode rev(ListNode head){
        if (head==null || head.next == null)return head;
        ListNode rev = rev(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
    }


    /*************       二叉树      ***********/

    public int ans = Integer.MIN_VALUE;
    int oneSideMax(TreeNode root){
        if (root == null)return 0;
        int left = Math.max(0,oneSideMax(root.left));
        int right = Math.max(0,oneSideMax(root.right));
        ans = Math.max(ans,left+right+root.val);
        return Math.max(left,right)+root.val;
    }


    /**
     * 恢复
     */
    TreeNode pre,temp1,temp2;
    public void traverse(TreeNode root){
        if (root==null)return;
        traverse(root.left);
        if (pre!=null){
            if (pre.val>root.val){
                if (temp1==null) {
                    temp1 = root;
                }else {
                    temp2 = root;
                }
            }
        }
        pre = root;
        //找到两个点
        traverse(root.right);
    }


    public void br(int arr[], LinkedList<Integer> track){
        if (track.size() == arr.length){
            System.out.println("----");
        }
        for (int i = 0; i < arr.length; i++) {
            if (track.contains(arr[i])){
                continue;
            }
            track.add(arr[i]);
            br(arr,track);
            track.removeLast();
        }
    }

    /**
     * 全排列
     * @param arr
     * @param v
     * @param track
     */
    public void br(int arr[], int v[] ,LinkedList<Integer> track){
        if (track.size() == arr.length){
            System.out.println("----");
        }
        for (int i = 0; i < arr.length; i++) {
            if (v[i] == 1)continue;
            v[i] = 1;
            track.add(arr[i]);
            br(arr,track);
            track.removeLast();
            v[i] = 0;
        }
    }

    int arr[] = new int[8];
    /**
     * 八皇后是一个全排列
     * @param args
     */
    public void eight(int args){
        if (args == 8){
            System.out.println();
            for (int a = 0; a < arr.length; a++) {
                System.out.print(arr[a]);
            }
            return;
        }
        for (int i = 0; i < 8; i++) {
            arr[args] = i;
            if (judge(args))
            eight(args+1);
        }
    }

    /**
     * 同一个行
     *
     * 斜
     *
     *
     * @param n
     * @return
     */
    private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[n] || Math.abs(n-i) == Math.abs(arr[n] - arr[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(5);
//        ListNode node6 = new ListNode(6);
//
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//
//        _112_Traverse traverse = new _112_Traverse();
//        traverse.rev(node1);
//        System.out.println("--------------------------");
//        traverse.eight(0);
        int pre[] = {1,2,4,5,3,6,7};
        int mid[] = {4,2,5,1,6,3,7};
        _112_Traverse traverse = new _112_Traverse();
//        TreeNode root = traverse.bu(pre,mid,Integer.MAX_VALUE+1);
        System.out.println("--------------------");
    }

}

