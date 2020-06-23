package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(new Permutations().permute(nums));
    }

    public List<List<Integer>> lli;
    public List<List<Integer>> permute(int[] nums) {
        lli = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        for (int num : nums){
            li.add(num);
        }
        recur(li,new ArrayList<>());
        return lli;
    }

    public void recur(List<Integer> li,List<Integer> rets){
        // 写出递归终止条件
        if (li.size() == 0){
           lli.add(new ArrayList<>(rets));
            return;
        }

        for (int i = 0; i < li.size() ; i++){
            List<Integer> tl = li;
            rets.add(tl.get(i));
            int t = tl.get(i);
            tl.remove(tl.get(i));
            recur(tl,rets);
            tl.add(i,t);
            rets.remove(rets.size()-1);
        }
    }
}
