package jianzhiOffer.simple;

public class Ep53II {
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++){
            if (nums[i]!=i){
                return nums[i]-1;
            }
        }
        return nums[nums.length-1]+1;
    }
}
