package hot100;

import java.util.ArrayList;
import java.util.List;

public class Ep78_SubSets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(new Ep78_SubSets().subsets(nums));
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> rets = new ArrayList<>();
        rets.add(new ArrayList<>());
        if(nums.length == 0 ){
            return rets;
        }
        dfs(rets ,new ArrayList<>() , nums , 0);
        return rets;
    }
    public void dfs(List<List<Integer>> rets ,List<Integer> ret, int[] nums , int index){
        // 递归终止条件
        if(index >= nums.length){
            return;
        }

        for(int i = index ; i < nums.length ; i ++){
            ret.add(nums[i]);
            rets.add(new ArrayList<>(ret));
            dfs(rets,ret,nums,i+1);
            ret.remove(ret.size()-1);
        }
    }
}
