package jianzhiOffer.simple;

public class Ep10II {
    public static void main(String[] args) {
        System.out.println(numWays(7));
    }
    public static int numWays(int n) {

        if (n == 0 || n == 1){
            return 1;
        }
        int fib = -1;
        int fn1 = 0 , fn2 = 1;
        for (int i = 0 ; i <= n ; i++){
            fib = (fn1 + fn2) % 1000000007;
            fn2 = fn1;
            fn1 = fib;
        }

        return fib;

    }

}
