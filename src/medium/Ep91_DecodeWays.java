package medium;

public class Ep91_DecodeWays {
    public static void main(String[] args) {

    }
    public int numDecodings(String s) {
        // 如果字符串长度为0，直接返回 0
        if (s.length()==0){
            return 0;
        }

        char[] charArray = s.toCharArray();
        int length = charArray.length;
        int[] dp = new int[length+1];
        // 初始状态值
        dp[length] = 1;
        for (int i = length-1 ; i > -1 ; i-- ){
            // 0 没有对应的字母，只能在 10 ，20 中使用
            if(charArray[i] == '0'){
                continue;
            }
            int num = 0 ;
            for (int j = i ; j < length &&j - i < 2 ; j++ ){
                // 如果两个数字可以组成解码成一个字母时
                num = num * 10 + (charArray[j] - '0');
                if(num < 27){
                    dp[i] = dp[i] + dp[j+1];
                }
            }
        }
        return dp[0];
    }

}
