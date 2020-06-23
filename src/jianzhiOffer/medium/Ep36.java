package jianzhiOffer.medium;

import jianzhiOffer.module.TreeNode;

public class Ep36 {
    TreeNode pre, head;
    public static void main(String[] args) {

    }
    public TreeNode treeToDoublyList(TreeNode root) {
        if (root == null){
            return null;
        }
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }
    public void dfs (TreeNode root){

        if (root == null){
            return;
        }
        dfs(root.left);
        if (pre != null){
            pre.right = root;
        }else {
            head = root;
        }
        root.left = pre;
        pre = root;
        dfs(root.right);

    }
}
