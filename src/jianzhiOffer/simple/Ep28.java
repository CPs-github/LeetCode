package jianzhiOffer.simple;

import jianzhiOffer.module.TreeNode;

/**
 * 来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 */
public class Ep28 {
    public static void main(String[] args) {

    }
    public static boolean isSymmetric(TreeNode root) {
        return root == null ? true : fun(root.left,root.left);
    }

    public static boolean fun(TreeNode left, TreeNode right){
        if (left == right){
            return true;
        }
        if (left == null || right == null || right.val != left.val){
            return false;
        }
        return fun(left.left,left.right)&&fun(right.left,right.left);
    }
}
