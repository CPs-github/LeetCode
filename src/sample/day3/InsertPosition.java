package sample.day3;

public class InsertPosition {
    public static void main(String[] args) {
        int[] nums  = new int[1000];
        for (int i = 0 ; i < 1000 ; i ++){
            nums[i] = i*2;
        }
        int target = 101;
        System.out.println(searchInsert(nums, target));
    }

    //    public static int searchInsert(int[] nums, int target) {
//        for (int i = 0 ; i < nums.length;i++){
//            if (nums[i]==target){
//                return i;
//            }
//            if (target<nums[i]){
//                return i;
//            }
//        }
//        return nums.length;
//
//    }
    public static int searchInsert(int[] nums, int target) {

        /**
         *  尝试用二分法查找
         */
        int left = 0, right = nums.length-1;
        int mid = 0;
        while (left <= right){
            mid = (left + right)/2;
            if (target == nums[mid]) {
                return mid;
            }else if (target < nums[mid]){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
}
