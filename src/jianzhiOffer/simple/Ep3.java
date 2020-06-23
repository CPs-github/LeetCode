package jianzhiOffer.simple;

public class Ep3 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 11, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(findRepeatNumber(nums));
    }
    public static int findRepeatNumber(int[] nums) {

        int[] rets = new int[nums.length];
        for (int i = 0 ; i < nums.length; i++){
           // ++rets[nums[i]];

          if ((++rets[nums[i]])>1){
              return nums[i];
          }
        }
        return  -1;
    }
}
