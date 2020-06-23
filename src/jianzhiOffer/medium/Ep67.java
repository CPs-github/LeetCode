package jianzhiOffer.medium;

public class Ep67 {
    public static void main(String[] args) {

    }
    public int strToInt(String str) {
        if (str.length() == 0) return 0;
        char[] chars = str.trim().toCharArray();
        int i = 1 , length = Integer.MAX_VALUE;
        int ret = 0 , sign = 1;
        if (chars[0] == '-'){
            sign = -1;
        }else if (chars[0] != '+'){
            i = 0;
        }
        for (int j = i ; j < chars.length ; j++){
            if (chars[j] < '0' || chars[j] > '9' ){
                break;
            }
            if (ret > length || ret == length && chars[j] > '7'){
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            ret = ret*10 + (chars[j]-'0');
        }
        return sign*(int) ret;
    }
}
