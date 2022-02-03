package learn.chaptertree;

import com.algorithm.binaryTree.TreeNode;

import java.util.Stack;

public class _311_TreeOrder {
    public void pre(TreeNode root){
        if (root==null){
            return;
        }
        System.out.println(root.val);
        pre(root.left);
        pre(root.right);
    }

    public void pre1(TreeNode root){
        if (root!=null){
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()){
                root = stack.pop();
                System.out.println(root.val);
                if (root.right!=null){
                    stack.push(root.right);
                }
                if (root.left!=null){
                    stack.push(root.left);
                }
            }
        }
    }

}
