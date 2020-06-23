package jianzhiOffer.medium;

public class Ep33 {
    public static void main(String[] args) {
        int[] postorder = {4, 8, 6, 12, 16, 14, 10};
        System.out.println(verifyPostorder(postorder));
    }
    public static boolean verifyPostorder(int[] postorder) {
        return recur(postorder,0,postorder.length-1);
    }

    public static boolean recur(int[] postorder, int start , int end){
        if (start >= end){
            return true;
        }
        int p = start;
        while (postorder[p] < postorder[end]){
            p++;
        }
        int m = p;
        while (postorder[p] > postorder[end]){
            p++;
        }
        return p == end && recur(postorder , start , m-1) && recur( postorder , m, end-1);
    }
}
