package jianzhiOffer.simple;

import java.util.Arrays;

public class Ep59 {
    public static void main(String[] args) {
        int[] nums = {8,-1,3};
        System.out.println(Arrays.toString(maxSlidingWindow(nums,2)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length<=1|| nums.length < k || k <= 1){
            return nums;
        }
        int[] rets = new int[nums.length - k +1];
        int index = -1,i = 0 , j = i + k - 1, ret = 0;
        int length = nums.length;
        while (j < length){
            if (index < i){
                index = i;
                for (int t = i ; t <= j ; t++){
                    if (nums[index] < nums[t]){
                        index = t;
                    }
                }
                rets[ret++] = nums[index];
            }else {
                if(nums[index] < nums[j]){
                    index = j;
                }
                rets[ret++] = nums[index];
            }

            i++;
            j++;
        }

        return rets;
    }
}
