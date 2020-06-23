package jianzhiOffer.simple;

public class Ep53I {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(search(nums,1));
    }
    public static int search(int[] nums, int target) {
        return helper(nums,target) - helper( nums , target-1);
    }

    public static int helper(int[] nums , int target){

        int left = 0;
        int right = nums.length-1;

        while (left <= right){
            int mid = (left + right) / 2;
            if (target >= nums[mid]){
                left = mid + 1;
            }else {
                right = mid - 1;
            }

        }
        return left;
    }
}
