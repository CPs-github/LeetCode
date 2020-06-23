package sample.day1;

/**
 * 3�����⣺ ������
 */
public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(10));
    }
    public static boolean isPalindrome(int x) {
        if (x < 0 ){
            return false;
        }
        if(x < 10){
            return true;
        }
        long i = 0;
        long t = x;
        while (t != 0){
            i = i * 10 + (t%10);
            t = t/10;
        }
        return i == x;
    }
}
