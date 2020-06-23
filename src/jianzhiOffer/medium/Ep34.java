package jianzhiOffer.medium;

import jianzhiOffer.module.TreeNode;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.List;

public class Ep34 {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> lli = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        recur(lli,li,root,sum);
        return lli;
    }

    public static void  recur(List<List<Integer>> lli,  List<Integer> li , TreeNode root , int sum){
        if (root == null ){
            return;
        }
        li.add(root.val);
        if (sum == root.val && root.left == null && root.right == null){
            lli.add(new ArrayList<>(li));
        }else {
            recur( lli , li , root.left , sum - root.val);
            recur( lli , li , root.right , sum - root.val);
        }
        li.remove(li.size()-1);
    }
}
