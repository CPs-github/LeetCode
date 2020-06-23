package jianzhiOffer.medium;

public class Ep56I {
    public static void main(String[] args) {

    }
    public static int[] singleNumbers(int[] nums) {
        int k = 0;
        for (int num : nums){
            k ^= num;
        }

        int mask = 1;
        while((mask & k)==0){
            mask <<= 1;
        }
        int a = 0 , b = 0;
        for ( int num : nums ){
            if ((mask & num) ==0){
                a ^= num;
            }else {
                b ^= num;
            }
        }
        return new int[]{a,b};

    }
}
