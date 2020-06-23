package jianzhiOffer.medium;

/**
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100"、"5e2"、"-123"、"3.1416"、"0123"都表示数值，
 * 但"12e"、"1a3.14"、"1.2.3"、"+-5"、"-1E-16"及"12e+5.4"都不是。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/biao-shi-shu-zhi-de-zi-fu-chuan-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Ep20 {
    public static void main(String[] args) {
        System.out.println(isNumber(".1"));
    }

    public static boolean isNumber(String s) {
        boolean numflag = false;
        boolean dotflag = false;
        boolean eflag = false;
        char[] chars = s.trim().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                numflag = true;
            } else if (chars[i] == '.') {
                if (dotflag || eflag) {
                    return false;
                }
                dotflag = true;
            } else if (chars[i] == 'e' || chars[i] == 'E') {
                if (eflag || !numflag) {
                    return false;
                }
                eflag = true;
            } else if (chars[i] == '-' || chars[i] == '+') {
                if (i != 0 || chars[i - 1] != 'e' || chars[i - 1] != 'E') {
                    return false;
                }
            }else {
                return false;
            }
        }
        return numflag;
    }
}
