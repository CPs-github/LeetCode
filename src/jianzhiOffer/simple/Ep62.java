package jianzhiOffer.simple;

public class Ep62 {
    public static void main(String[] args) {
        System.out.println(lastRemaining(5,3));
    }
    public static int lastRemaining(int n, int m) {
        int f = 0;
        for ( int i = 2 ; i != n+1; ++i){
            f = (f + m) % i;
        }
        return f;
    }
}
