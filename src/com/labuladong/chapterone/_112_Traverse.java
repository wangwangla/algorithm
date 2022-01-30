package com.labuladong.chapterone;

import com.algorithm.binaryTree.ListNode;
import com.algorithm.binaryTree.TreeNode;

import java.util.LinkedList;

public class _112_Traverse {
    private void traverse1(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private void travese2(ListNode head){
        for (ListNode node = head;node!=null;node= node.next){
            System.out.println(node.val);
        }
    }


    public TreeNode buildTree(int pre[],int inorder[]){
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



    private void traverse2(ListNode head){
        if (head==null){
            return;
        }

        travese2(head.next);
    }

    public int ans = Integer.MIN_VALUE;
    int oneSideMax(TreeNode root){
        if (root == null)return 0;
        int left = Math.max(0,oneSideMax(root.left));
        int right = Math.max(0,oneSideMax(root.right));
        return Math.max(left,right)+root.val;
    }

    private void traverse1(ListNode head){
        while (head!=null){
            //顺序
            System.out.println(head.val);
            head = head.next;
            //逆序
            System.out.println(head.val);
        }
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
            v[i] = 1;
        }
    }

}
