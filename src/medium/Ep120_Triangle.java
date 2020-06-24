package medium;

import java.util.Arrays;
import java.util.List;

public class Ep120_Triangle {

    public static void main(String[] args) {

    }
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 0 || triangle == null){
            return 0;
        }

        int[] dp = new int[triangle.size()+1];
        List<Integer> nums = triangle.get(triangle.size()-1);
        for (int i = 0 ; i < nums.size() ; i++){
            dp[i] = nums.get(i);
        }

        for (int i = triangle.size()-2; i >-1 ; --i ){
            List<Integer> integers = triangle.get(i);
            for (int j = 0 ; j < integers.size() ; j++){
                dp[j] = Math.min(integers.get(j)+dp[j],integers.get(j)+dp[j+1]);
            }
            System.out.println(Arrays.toString(dp));
        }
        return dp[0];
    }
}
