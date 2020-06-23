package jianzhiOffer.simple;

import jianzhiOffer.module.TreeNode;

import java.util.*;

public class Ep32II {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null ){
            return new ArrayList<>();
        }
        List<List<Integer>> lli = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() > 0){
            int length = queue.size();
            List<Integer> li = new ArrayList<>();
            for (int i = 0 ; i < length ; i++ ){
                TreeNode tempNode = queue.poll();
                li.add(tempNode.val);
                if (tempNode.left != null){
                    queue.add(tempNode.left);
                }
                if (tempNode.right != null ){
                    queue.add(tempNode.right);
                }
            }
            lli.add(li);
        }
        return lli;

    }
}
