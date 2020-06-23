package jianzhiOffer.simple;

public class Ep15 {
    public static void main(String[] args) {

        System.out.println(hammingWeight(9));
        System.out.println(8&7);
    }

    public static int hammingWeight(int n) {
        int[] arr = new int[31];
        for (int i = 31; i >= 0; i--) {
            arr[(n >>> i & 1)] += (n >>> i & 1);
        }
        return arr[1];
    }
}
