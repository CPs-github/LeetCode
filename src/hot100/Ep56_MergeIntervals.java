package hot100;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Ep56_MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,4},{0,1},{5,7},{8,10},{9,11},{15,18}};
        for (int[] i : new Ep56_MergeIntervals().merge(intervals)){
            System.out.println(Arrays.toString(i));
        }

    }
    public int[][] merge(int[][] intervals) {
        int num = 0;
        List<Integer[]> li = new ArrayList<>();
        boolean[] isMerge = new boolean[intervals.length];
        for (int i = 0 ; i < intervals.length ; i++){
            for (int j = i+1 ; j < intervals.length ; j++){
                if (isMergeIntervals(intervals[i],intervals[j]) && !isMerge[j]){
                    intervals[i][0] = Math.min(intervals[i][0] , intervals[j][0]);
                    intervals[i][1] = Math.max(intervals[i][1] , intervals[j][1]);
                    isMerge[j] = true;
                    num++;
                }
            }
           // System.out.println(num);
        }
       // return intervals;
        return removeSubIntervals(intervals,intervals.length-num);
    }
    public boolean isMergeIntervals(int[] a , int[] b){
        if(a[0] <= b[0] && a[1] >= b[0] || a[1]>= b[0] && a[1] <= b[1] ||a[0] >= b[0] && a[0] <= b[1] ){
            return true;
        }
        return false;
    }
    public int[][] removeSubIntervals(int[][] nums , int len){
        int[][] rets = new int[len][2];
        rets[0] = nums[0];
        int index = 0;
        for (int i = 0 ;  i < nums.length ; i++ ){
          //  System.out.println(Arrays.toString(nums[i]));
            if (rets[index][0] <= nums[i][0] && rets[index][1] >= nums[i][1] ){

            }else {
                rets[++index] = nums[i];

            }
           // System.out.println(Arrays.toString(rets[index]));
        }
        return  rets;
    }
}
