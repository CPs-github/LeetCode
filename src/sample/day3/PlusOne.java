package sample.day3;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

        int[] digits = {9,0,1,9};
        System.out.println(Arrays.toString(new PlusOne().plusOne(digits)));
    }

    public int[] plusOne(int[] digits) {
        int i = 0, length = digits.length, p = 0;

        while (i < length - 1 && length > 1) {
            if (digits[i] != 0) {
                break;
            }
            ++i;
        }
        int[] nums = new int[length - i];
        while (i < length) {
            nums[p] = digits[i];
            ++i;
            ++p;
        }
        digits = nums;
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        length = digits.length-1;
        while (length>-1){
            if (digits[length] == 10 && length > 0){
                digits[length-1] = digits[length-1] + 1;
                digits[length] = 0;
                System.out.println(">>>>>>"+digits[length]);
                --length;
            }else if (digits[0] == 10){
                int[] tnums = new int[digits.length+1];
                tnums[0] = 1;
                tnums[1] = 0;
                for (int ii=2 ; ii < tnums.length ; ++ii){
                    tnums[ii] = digits[ii-1];
                }
                digits = tnums;
                break;
            }else {
                break;
            }

        }
        return digits;
    }
}
