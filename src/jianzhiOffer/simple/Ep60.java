package jianzhiOffer.simple;

import java.util.Arrays;
import java.util.HashMap;

/**
 *   知识点： 动态规划
 *
 */
public class Ep60 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(3)));
    }
    public static double[] twoSum(int n) {
        if (n < 1){
            return new double[0] ;
        }
        // 总次数 all
        double all = Math.pow(6,n);
     //   double all =1.0;
        // 定义转移矩阵
        double[] dpMatrix = new double[6*n+1];
        double[] helperMatrix = new double[5*n+1];
        for (int i = 1 ; i <= 6 ; i++){
            dpMatrix[i] = 1;
            helperMatrix[i-1] = 1.0/6;
        }
        for (int i = 2 ; i <= n; i++){
            for (int j = 6*n ; j >= 1 ; j--){
                int temp = 0;
                for (int k = 1 ; k <= 6 ; k++){
                    temp += ( j >= k)?dpMatrix[j - k] : 0;
                    System.out.println( j+">"+temp+ ">>"+(j>=k));
                }
                dpMatrix[j] = temp;
                if (i == n && j >= n){
                    helperMatrix[j-i] = dpMatrix[j]/all;
                }
            }
        }
        return helperMatrix;
    }
}
