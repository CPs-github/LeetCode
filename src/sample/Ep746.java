package sample;

public class Ep746 {
    public static void main(String[] args) {
        int[] cost = {10,15,20};
        System.out.println(minCostClimbingStairs(cost));
    }
    public static int minCostClimbingStairs(int[] cost) {

        int s1 = 0 , s2 = 0;
        for (int i = 0 ; i < cost.length ; i++){
            int ret = cost[i] + Math.min(s1,s2);
            s2 = s1;
            s1 = ret;
        }
        return Math.min(s1 ,s2);

    }
}
