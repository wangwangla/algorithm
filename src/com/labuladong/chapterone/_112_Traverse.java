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
     *
     * 04752613
     * 05726314
     * 06357142
     * 06471352
     * 13572064
     * 14602753
     * 14630752
     * 15063724
     * 15720364
     * 16257403
     * 16470352
     * 17502463
     * 20647135
     * 24170635
     * 24175360
     * 24603175
     * 24730615
     * 25147063
     * 25160374
     * 25164073
     * 25307461
     * 25317460
     * 25703641
     * 25704613
     * 25713064
     * 26174035
     * 26175304
     * 27360514
     * 30471625
     * 30475261
     * 31475026
     * 31625704
     * 31625740
     * 31640752
     * 31746025
     * 31750246
     * 35041726
     * 35716024
     * 35720641
     * 36074152
     * 36271405
     * 36415027
     * 36420571
     * 37025164
     * 37046152
     * 37420615
     * 40357162
     * 40731625
     * 40752613
     * 41357206
     * 41362750
     * 41506372
     * 41703625
     * 42057136
     * 42061753
     * 42736051
     * 46027531
     * 46031752
     * 46137025
     * 46152037
     * 46152073
     * 46302751
     * 47302516
     * 47306152
     * 50417263
     * 51602473
     * 51603742
     * 52064713
     * 52073164
     * 52074136
     * 52460317
     * 52470316
     * 52613704
     * 52617403
     * 52630714
     * 53047162
     * 53174602
     * 53602417
     * 53607142
     * 57130642
     * 60275314
     * 61307425
     * 61520374
     * 62057413
     * 62714053
     * 63147025
     * 63175024
     * 64205713
     * 71306425
     * 71420635
     * 72051463
     * 73025164
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
     * 04752613
     * 05726314
     * 06357142
     * 06471352
     * 13572064
     * 14602753
     * 14630752
     * 15063724
     * 15720364
     * 16257403
     * 16470352
     * 17502463
     * 20647135
     * 24170635
     * 24175360
     * 24603175
     * 24730615
     * 25147063
     * 25160374
     * 25164073
     * 25307461
     * 25317460
     * 25703641
     * 25704613
     * 25713064
     * 26174035
     * 26175304
     * 27360514
     * 30471625
     * 30475261
     * 31475026
     * 31625704
     * 31625740
     * 31640752
     * 31746025
     * 31750246
     * 35041726
     * 35716024
     * 35720641
     * 36074152
     * 36271405
     * 36415027
     * 36420571
     * 37025164
     * 37046152
     * 37420615
     * 40357162
     * 40731625
     * 40752613
     * 41357206
     * 41362750
     * 41506372
     * 41703625
     * 42057136
     * 42061753
     * 42736051
     * 46027531
     * 46031752
     * 46137025
     * 46152037
     * 46152073
     * 46302751
     * 47302516
     * 47306152
     * 50417263
     * 51602473
     * 51603742
     * 52064713
     * 52073164
     * 52074136
     * 52460317
     * 52470316
     * 52613704
     * 52617403
     * 52630714
     * 53047162
     * 53174602
     * 53602417
     * 53607142
     * 57130642
     * 60275314
     * 61307425
     * 61520374
     * 62057413
     * 62714053
     * 63147025
     * 63175024
     * 64205713
     * 71306425
     * 71420635
     * 72051463
     * 73025164
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
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        _112_Traverse traverse = new _112_Traverse();
        traverse.rev(node1);
        System.out.println("--------------------------");
        traverse.eight(0);
    }

}

