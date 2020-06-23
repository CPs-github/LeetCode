package jianzhiOffer.simple;

import jianzhiOffer.module.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[2,7] 或者 [7,2]
 * 示例 2：
 *
 * 输入：nums = [10,26,30,31,47,60], target = 40
 * 输出：[10,30] 或者 [30,10]
 *  
 *
 * 限制：
 *
 * 1 <= nums.length <= 10^5
 * 1 <= nums[i] <= 10^6
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Ep57 {
    public static void main(String[] args) {

    }
    public static int[] twoSum(int[] nums, int target) {

        int left = 0 , right = nums.length-1 ;
        int s = nums[left] + nums[right];
        while (left <= right){
            if (target > s){
                s = nums[++left]+nums[right];
            }else if (target < s){
                s = nums[left]+nums[--right];
            }else {
                return new int[]{nums[left] , nums[right]};
            }
        }
        return new int[0];
    }
    public static int[][] findContinuousSequence(int target) {

        List<int[]> arrays = new ArrayList<>();
        int left = 1, right = 1 , sum = 0;
        while (left<=target/2){
            if (sum < target){
                sum += right;
                right++;
            }else if (sum > target){
                sum -= left;
                left++;
            }else {
                int[] array = new int[right-left];
                for (int i = left ; i <= right; i++){
                    array[i-left] = i ;
                }
                arrays.add(array);
            }
            left++;
            sum -= left;
        }
        return arrays.toArray(new int[arrays.size()][]);
    }
}
