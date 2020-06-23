package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        int[] nums = {2, -1, 1, 0, -1};

        System.out.println(new SumOfThreeNumbers().threeSum(nums));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> rets = new ArrayList<>();
        dfs(nums, rets, new ArrayList<>(), 0, 0);
        return rets;
    }

    public void dfs(int[] nums, List<List<Integer>> rets, List<Integer> ret, int index, int sum) {

        // 递归终止条件
        if (!rets.contains(ret) && ret.size() == 3 && sum == 0) {
            rets.add(new ArrayList<>(ret));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            sum += nums[i];
            ret.add(nums[i]);
            System.out.println(index + " 递归：" + nums[i] + ">>" + ret);
            dfs(nums, rets, ret, i + 1, sum);
            System.out.println(index + " 回溯：" + nums[i]);
            ret.remove(ret.size() - 1);
            sum -= nums[i];
        }
        return;
    }
}
