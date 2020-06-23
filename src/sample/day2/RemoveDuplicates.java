package sample.day2;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,2));
        System.out.println(Arrays.toString(nums));
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int index = 0;
        for (int i = 0 ; i< nums.length ; i++){
            if (nums[i] != nums[index]){
                index++;
                nums[index] = nums[i];
            }
        }
        return index+1;
    }
    public static int removeElement(int[] nums, int val) {

        int index = 0;
        for (int i = 0; i < nums.length ; i++){
            if (nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return nums.length-index;
    }
}
