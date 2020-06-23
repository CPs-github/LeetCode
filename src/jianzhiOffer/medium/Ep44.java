package jianzhiOffer.medium;

public class Ep44 {
    public static void main(String[] args) {
        System.out.println(findNthDigit(19));
    }

    public static int findNthDigit(int n) {

        int digit = 1;
        long start = 1;
        long count = 9;
        while (n > count) {
            n -= count;
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }
        long num = start + (n - 1) / digit;
        System.out.println(num);
        return Long.toString(num).charAt((n - 1) % digit) - '0';
    }
}
