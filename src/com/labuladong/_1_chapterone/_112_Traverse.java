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


    /*************       二叉树      ***********/


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
    public TreeNode buildTree1(int pre[],int inorder[]){
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
        TreeNode root = traverse.bu(pre,mid,Integer.MAX_VALUE+1);
        System.out.println("--------------------");
    }

}

