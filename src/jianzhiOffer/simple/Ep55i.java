package jianzhiOffer.simple;

import jianzhiOffer.module.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Ep55i {
    public static void main(String[] args) {

    }
    public static int maxDepth(TreeNode root) {
        int deep = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(queue.size()!=0){
            int length = queue.size();
            for (int i = 0 ; i < length; i++){
                TreeNode node = queue.poll();

                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            deep++;
        }
        return deep;
    }
}
