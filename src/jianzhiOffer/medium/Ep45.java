package jianzhiOffer.medium;

public class Ep45 {
    public static void main(String[] args) {

    }
    public String minNumber(int[] nums) {

        String[] strs = new String[nums.length];
        for (int i = 0 ; i < nums.length ; i++){
            strs[i] = String.valueOf(nums[i]);
        }
        fastSort(strs, 0, strs.length - 1);
        StringBuilder res = new StringBuilder();
        for(String s : strs)
            res.append(s);
        return res.toString();

    }

    public void fastSort(String[] strs , int l , int r){
        if (l > r){
            return;
        }
        int i = l , j = r;
        String temp = strs[i];
        while (i<j){
            while ((strs[i]+strs[j]).compareTo(strs[j]+strs[i]) <= 0 && i < j){
                j--;
            }
            while ((strs[i]+strs[j]).compareTo(strs[j]+strs[i]) >= 0 && i < j){
                i++;
            }
            temp = strs[i];
            strs[i] = strs[j];
            strs[j] = temp;
        }
        strs[i] = strs[l];
        strs[l] = temp;
        fastSort(strs,l,i-1);
        fastSort(strs,i+1,r);

    }

}
