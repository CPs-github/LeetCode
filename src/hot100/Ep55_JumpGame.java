package hot100;

import java.util.Arrays;

public class Ep55_JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,5,0,0};
        System.out.println(new Ep55_JumpGame().canJump(nums));
    }
    public boolean canJump(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo,-1);
        return dfs(nums,0,memo);
    }
    public boolean dfs(int[] nums, int index ,int[] memo){
        // 递归终止条件
        if(nums.length-1-index <= nums[index]){
            return true;
        }
        if (nums[index] == 0){
            return false;
        }
        if (memo[index] != -1){
            return memo[index] == 0 ? false : true;
        }
        boolean ret = false;
        for (int i = 1 ; i <= nums[index] ; i++){
            index = index + i;
            System.out.println(index);
            if (dfs(nums,index,memo)){
                memo[index] = 1;
                return true;
            }
            memo[index] = 0;
            index = index-i;
        }
        return ret;
    }
}
