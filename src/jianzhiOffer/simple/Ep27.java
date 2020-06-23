package jianzhiOffer.simple;

import jianzhiOffer.module.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 *  二叉树镜像翻转
 */
public class Ep27 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(5);
        TreeNode n5 = new TreeNode(6);
        TreeNode n6 = new TreeNode(7);

        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;
        n2.left = n5;
        n2.right = n6;
//        levelOrderByStack(root);
//        mirrorTree(root);
//        System.out.println();
//        levelOrderByStack(root);
 //       System.out.println(root.equals(mirrorTree(root)));

        System.out.println(isSymmetric(root));
    }
    public static TreeNode mirrorTree(TreeNode root) {

        TreeNode node = root;

        if (node.left != null || node.right != null){
            TreeNode t = node.left;
            node.left = node.right;
            node.right = t;
            mirrorTree(node.left);
            mirrorTree(node.right);
        }

        return node;
    }
    public static boolean isSymmetric(TreeNode root) {
        return root == null ? true : fun(root.left,root.right);
    }

    public static boolean fun(TreeNode left, TreeNode right){
        if (left == right){
            return true;
        }
        if (left == null || right == null || right.val != left.val){
            return false;
        }
        return fun(left.left,right.right)&&fun(right.left,right.left);
    }

    public static void levelOrderByStack(TreeNode node){
        if (node == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (queue.size() != 0){
            int length = queue.size() ;
            for (int i = 0; i < length ; i++){
                TreeNode temp = queue.poll();
                System.out.print(temp.val+" ");
                if (temp.left != null){
                    queue.add(temp.left);
                }
                if (temp.right != null){
                    queue.add(temp.right);
                }
            }
        }
    }

}
