package medium;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(new SearchInRotatedSortedArray().search(new int[]{1},0));
    }
    public int search(int[] nums, int target) {
        if (nums.length == 0){
            return -1;
        }
        int maxIndex = 0;
        int left = 0 , right = nums.length-1, mid = 0;

        for (int i = 0 ; i < right ; i++ ){
            if (nums[i]>nums[i+1]){
                maxIndex = i;
                break;
            }
        }
        if(target > nums[maxIndex] || target < nums[maxIndex+1]){
            System.out.println("oooooo");
            return -1;
        }
        System.out.println("max " + maxIndex);
        if (target < nums [maxIndex] && target >= nums[0]){
            right = maxIndex;
            mid = (right + left)/2;
            while (left <= right){
                if(target > nums[mid]){
                    left = mid+1;
                    mid = (right + left)/2;
                }else  if(target < nums[mid]){
                    right = mid-1;
                    mid = (right + left)/2;
                }else {
                    return mid;
                }
            }
        }else {
            System.out.println("11--");
            left = maxIndex+1;
            mid = (right + left)/2;
            while (left <= right){
                if(target > nums[mid]){
                    left = mid+1;
                    mid = (right + left)/2;
                    System.out.println(">>>>");
                }else  if(target < nums[mid]){
                    right = mid-1;
                    mid = (right + left)/2;
                    System.out.println("<<<");
                }else {
                    return mid;
                }
            }
        }

        return -1;
    }

}
