package jianzhiOffer.simple;

import java.util.Arrays;

public class Ep21 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(exchange(nums)));
    }
    public static int[] exchange(int[] nums) {
        int i = 0, j = nums.length-1;
        int odd = 0 , eve = 0;
        int[] odds = new int[nums.length];
        int[] eves = new int[nums.length];
        while ( i < j){
            if (nums[i]%2 > 0 ){
                odds[odd++] = nums[i];
            }else {
                eves[eve++] = nums[i];
            }
            if (nums[j]%2 > 0 ){
                System.out.println(odd);
                odds[odd++] = nums[j];
            }else {
                eves[eve++] = nums[j];
            }
            i++;
            j--;
        }
        if (i == j){
            if (nums[i]%2 > 0 ){
                odds[odd++] = nums[i];
            }else {
                eves[eve++] = nums[i];
            }
        }

        for (int k = odd ; k < odds.length ; k++){
            odds[k] = eves[k - odd];
        }
        nums = odds;
        return nums;
    }
}
