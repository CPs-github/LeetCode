package jianzhiOffer.simple;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ep17 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNumbers(1)));
    }
    public static int[] printNumbers(int n) {
        int maxNum = 1;
        for (int i = 0 ; i < n ; i++){
            maxNum = maxNum*10;
        }
        int[] array = new int[maxNum-1];
        for (int i = 1 ; i < maxNum ; i++){
            array[i-1] = i;
        }
        return array;
    }
}
