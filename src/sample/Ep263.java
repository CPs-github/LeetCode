package sample;

public class Ep263 {

    public static void main(String[] args) {
   //     System.out.println(isUgly(6));
        System.out.println(nthUglyNumber(10));
    }
    public static boolean isUgly(int num) {
        if (num  < 1){
            return false;
        }
        int[] nums = {2,3,5};
        for (int i : nums){
            while (num % i == 0){
                num = num / i;
            }
        }
        if (num == 1){
            return true;
        }
        return false;
    }
    public static int nthUglyNumber(int n) {
        int ugly = 0;
        int[] uglys = new int[1690];
        uglys[0] = 1;
        int i2 = 0 , i3 = 0, i5 = 0;
        for (int i = 1 ; i < n ; i++){
            ugly = Math.min(Math.min(2*uglys[i2] , 3*uglys[i3]),5*uglys[i5]);
            uglys[i] = ugly;
            if (ugly == uglys[i2]*2){
                ++i2;
            }
            if (ugly == uglys[i3]*3){
                ++i3;
            }
            if (ugly == uglys[i5]*5){
                ++i5;
            }
            System.out.println(ugly);
        }
        return ugly;
    }
}
