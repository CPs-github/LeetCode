package hot100;

import java.util.Scanner;

public class Ep114_FlattenBinaryTreeToLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        System.out.println("..."+t);
    }

    public void flatten(TreeNode root) {
        dfs(root);
    }
    public void dfs(TreeNode root) {
        //  递归终止条件
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null) {
            return;
        }
        TreeNode temp = root;
        dfs(temp.left);
        if (temp.left!= null){
            temp.right = temp.right;
            temp.right = temp.left;
        }
        dfs(temp.right);
    }
    public TreeNode findRight(TreeNode root){
        TreeNode treeNode = root;
        while (treeNode.right != null){
            treeNode = treeNode.right;
        }
        return treeNode;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}