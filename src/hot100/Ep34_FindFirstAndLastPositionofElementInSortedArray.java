package hot100;

import java.util.Arrays;

public class Ep34_FindFirstAndLastPositionofElementInSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Ep34_FindFirstAndLastPositionofElementInSortedArray().
                searchRange(new int[]{5, 7, 7, 8, 8, 10}, 10)));
    }

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0 || target < nums[0] || target > nums[nums.length - 1]) {
            return new int[]{-1, -1};
        }
        int left = 0, right = nums.length - 1;
        int mid = (left + right) / 2;
        int leftIndex = 0, rightIndex = 0;
        boolean tag = false;
        boolean tag1 = false;
        boolean tag2 = false;
        while (left <= right) {
            if (nums[mid] < target) {
                left = mid + 1;
                mid = (left + right) / 2;
            } else if (nums[mid] > target) {
                right = mid - 1;
                mid = (left + right) / 2;
            } else  {
                if (leftIndex == 0 && rightIndex == 0 && !tag){
                    rightIndex = mid;
                    leftIndex = mid;
                    tag = true;
                }else if(  !tag1 || !tag2 ){
                    if (leftIndex >= 0 && nums[leftIndex] ==  target){
                        -- leftIndex;
                    }else {
                        tag1 = true;
                    }
                    if (  rightIndex < nums.length && nums[rightIndex] == target){
                        ++ rightIndex;
                    }else {
                        tag2 = true;
                    }
                }else {
                    return new int[]{leftIndex+1, rightIndex-1};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
