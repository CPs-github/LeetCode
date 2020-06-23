package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {


        System.out.println(new CombinationSumII().combinationSum2(new int[] {2,5,2,1,2},5));
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> rets = new ArrayList<>();
        dfs(candidates,rets,new ArrayList<>(),0,0,target);
        return rets;
    }
    public void dfs( int[] nums, List<List<Integer>> rets , List<Integer> ret , int index ,
                     int sum , int target){

        if(sum == target){
            if (!rets.contains(ret)){
                rets.add(new ArrayList<>(ret));
            }
            return;
        }
        if(sum > target || index > nums.length-1 ){
            return;
        }

        for(int i = index ; i < nums.length; i++){

            System.out.println(index);
            sum += nums[i];
            ret.add(nums[i]);
            dfs(nums,rets,ret,i+1,sum,target);
            sum -= nums[i];
            ret.remove(ret.size()-1);
        }
    }
}
