package medium;

import java.util.Arrays;

public class Ep322CionsChange {
    public static void main(String[] args) {
        System.out.println(new Ep322CionsChange().coinChange(new int[]{1,2,5},11));
    }
    public int coinChange(int[] coins, int amount) {

        // 状态转移数组
        int[] f = new int[amount+1];
        // 硬币面值的数组长度，即硬币的种类
        int len = coins.length;
        // 初始化，初始状态
        f[0] = 0;

        // 状态转移方程：f[n] = min{f[n-1]+1 , f[n-2]+1 , f[n-5]+1};
        // 转台转移过程
        for(int i = 1 ; i <= amount ; ++ i){

            // 初始化 f[i]
            f[i] = Integer.MAX_VALUE;
            for(int j = 0 ; j < len ; ++j){
                /**
                 * 边界条件： i - 硬币面值 >= 0 ； 硬币面值 = coins[j]
                 * MAX_VALUE +1 会溢出导致数据异常，故MAX_VALUE > f[i - coins[j]];
                 */
                if(i >= coins[j] &&  f[ i - coins[j] ]  != Integer.MAX_VALUE ){
                    f[i] = Math.min(f[i] , f[ i - coins[j] ]+1);
                }

            }
        }
        if(f[amount] == Integer.MAX_VALUE ){
            f[amount] = -1;
        }

        return f[amount];
    }
}
