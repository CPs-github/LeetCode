package jianzhiOffer.simple;

import jianzhiOffer.module.TreeNode;

public class Ep55II {
    public static void main(String[] args) {

    }

    public static boolean isBalanced(TreeNode root) {

        return reCur(root) != -1;
    }
    public static int reCur( TreeNode root){
        if (root == null ){
            return 0;
        }
        int left = reCur(root.left);
        if (left == -1){
            return -1;
        }
        int right = reCur(root.right);
        if (right == -1){
            return -1;
        }
        return Math.abs(left-right) < 2 ? Math.max(left,right) + 1 : -1;
    }
}
