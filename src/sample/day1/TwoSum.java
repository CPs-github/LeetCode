package sample.day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1����Ŀ������֮��
 * Ҫ������һ������ nums[] �� һ��Ŀ���� target ��
 * �������������ҵ������� nums[i] , nums[j]��ʹ�����ǵĺ͵��� target, ���� i,j ��
 * �������ҵ��򱨳��쳣��
 */
public class TwoSum {

    public static void main(String[] args) {
 //       int[] nums = {7, 6, 8, 3, 1, 9, 11, 9, 7};
        int[] nums = {7, 6, 8, 3, 1, 9, 11, 9, 7};
        int target = 14;
        System.out.println(Arrays.toString(solution1(nums, target)));
        System.out.println(Arrays.toString(solution2(nums, target)));
        System.out.println(Arrays.toString(solution3(nums, target)));
    }

    /**
     * ����һ�������������������Ԫ�����ʣ�
     * ʱ�临�Ӷ�Ϊ O��n^2)��
     *
     * @param nums
     * @param target
     */
    public static int[] solution1(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("Any two elements in this array are not equal to target!!");
    }

    public static int[] solution2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                // map.containsKey(complement) ��ֹ�ҵ���ֵ
                //map.get(complement) != i ��ֹ�Լ����Լ���
                return new int[]{i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("Any two elements in this array are not equal to target");
    }

    public static int[] solution3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Any two elements in this array are not equal to target");
    }
}
