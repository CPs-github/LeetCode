package jianzhiOffer.medium;

import jianzhiOffer.module.ListNode;
import jianzhiOffer.module.TreeNode;

import java.awt.font.FontRenderContext;
import java.io.FileOutputStream;
import java.util.*;

/**
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回：
 * [3,9,20,15,7]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Ep32I {
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
        System.out.println(levelOrder2(root));

    }

    public static int[] levelOrder(TreeNode root) {
        if (root == null ){
            return new int[0];
        }
        Queue<Integer> roots = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(queue.size() > 0){
            int length = queue.size();
            for (int i = 0 ; i < length ; i++){
                TreeNode treeNode = queue.poll();
                roots.add(treeNode.val);
                System.out.print(treeNode.val);
                if (treeNode.left != null){
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null){
                    queue.add(treeNode.right);
                }
            }
        }
        System.out.println();
        int[] nums = new int[roots.size()];
        for (int i = 0 ; i < nums.length ; i++){
           nums[i] = roots.poll();
        }

        return nums;
    }
    public static List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> lli = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() != 0){
            int length = queue.size();
            LinkedList<Integer> li = new LinkedList<>();
            for (int i = 0 ; i < length ; i++){
                TreeNode temp = queue.poll();
                if (lli.size()%2 == 0){
                    li.addLast(temp.val);
                }else {
                    li.addFirst(temp.val);
                }
                if (temp.left != null){
                    queue.add(temp.left);
                }
                if (temp.right != null){
                    queue.add(temp.right);
                }
            }
            lli.add(li);
        }
        return lli;
    }

}
