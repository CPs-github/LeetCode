package jianzhiOffer.simple;

public class Ep65 {
    public static void main(String[] args) {
        System.out.println(add(1,1));
        System.out.println(1&1<<2);
    }
    public static int add(int a, int b) {
        while (b!=0){
            int c = (a&b)<<1;
            a = a^b;
            b = c;
        }
        return a;
    }
}
