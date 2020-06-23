package medium;

/**
 * 给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
 *
 * 示例 1:
 *
 * 输入: 2
 * 输出: 1
 * 解释: 2 = 1 + 1, 1 × 1 = 1。
 * 示例 2:
 *
 * 输入: 10
 * 输出: 36
 * 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36。
 * 说明: 你可以假设 n 不小于 2 且不大于 58。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/integer-break
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class IntegerBreak {
    public static int[] memo ;
    public static void main(String[] args) {
        System.out.println(integerBreak1(120));
    }
    // 方法一：采用递归思想解决
    public static int integerBreak1(int n) {
        memo = new int[n+1];
        return breakInteger(n);
    }
    public static int breakInteger(int n ){
        int ret = -1;
        if (n ==1){
            return 1;
        }
        if (memo[n]!=0){
            return memo[n];
        }
        for (int i = 1 ; i < n ; i++ ){
            ret = Math.max(ret%1000000007, Math.max(i*(n - i)%1000000007,i*breakInteger(n-i)%1000000007));
        }

        memo[n] = ret%1000000007;
        return ret%1000000007;
    }

    /**
     * 方法二 采用动态规划实现；
     * @param n
     * @return
     */
    public static int integerBreak2(int n) {
        int[] arr = new int[n+1];
        arr[0] = 1;
        for (int i = 2; i <= n ; i++){
            for (int j = 1 ; j < i ; j++){
                arr[i] = Math.max(arr[i] , Math.max(j*(i-j),j*arr[i-j]));
            }
        }

        return arr[n];
    }
}
