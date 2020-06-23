package jianzhiOffer.medium;

import jianzhiOffer.module.TreeNode;

public class Ep26 {
    public static void main(String[] args) {

        TreeNode A = new TreeNode(1);
        TreeNode A1 = new TreeNode(2);
        TreeNode A2 = new TreeNode(3);
        TreeNode A3 = new TreeNode(4);
        A.left = A1;
        A.right= A2;
        A1.left = A3;
        TreeNode B = new TreeNode(3);
        System.out.println(new Ep26().isSubStructure(A,B));

    }
    public  boolean isSubStructure(TreeNode A, TreeNode B) {
        boolean ret = false;
        if(A != null && B != null){
            if (A.val == B.val){
                System.out.println("val==");
                ret = pickChlid(A , B);

            }
            if (!ret){
                ret = isSubStructure(A.left,B);
            }
            if (!ret){
                ret = isSubStructure(A.right,B);
            }
        }
        return ret;
    }
    private boolean pickChlid(TreeNode A , TreeNode B){
        if (B == null) {
            return true;
        }
        if (A == null){
            return  false;
        }

        if (A.val != B.val){
            return false;
        }
        return pickChlid(A.left , B.left)&&pickChlid(A.right,B.right);
    }
}
