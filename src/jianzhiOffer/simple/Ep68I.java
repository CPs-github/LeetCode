package jianzhiOffer.simple;

import jianzhiOffer.module.TreeNode;

public class Ep68I {
    public static void main(String[] args) {

    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        while (root!=null){
            if (q.val<root.val && p.val<root.val){
                root = root.left;
            }else if (q.val>root.val && p.val>root.val){
                root = root.right;
            }else {
                break;
            }
        }
        return root;
    }
    public static TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root){
            return root;
        }
        TreeNode left = lowestCommonAncestor2(root.left,p,q);
        TreeNode right = lowestCommonAncestor2(root.right,p,q);
        if (left == null){
            return right;
        }
        if (right == null){
            return left;
        }
        return root;
    }
}
