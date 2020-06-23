package jianzhiOffer.medium;

public class Ep49 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(11));
    }
    public static int nthUglyNumber(int n) {
        if (n<2){
            return 1;
        }
        int i = 1 , num = 1;
        while (true){
            if (num%2==0||num%3==0||num%5==0){
                i++;
                if (i==n){
                    break;
                }
            }
            num++;
        }
        return num;
    }
}
