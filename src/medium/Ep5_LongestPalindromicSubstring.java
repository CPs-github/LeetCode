package medium;

public class Ep5_LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(new Ep5_LongestPalindromicSubstring().longestPalindrome2(s));
    }
    /**
     * 暴力解法:
     *  双循环逐次判断
     *
     *   时间复杂度为 O(n^3)
     */

    public String longestPalindrome1(String s) {
        // 空字符串和一个字符的字符串都是回文的。
        int len = s.length();
        if (len<2){
            return s;
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = 1;
        for (int i = 0 ; i < len - 1; i++){
            for (int j = i + 1 ; j < len ; j++){
                if (j - i + 1 > right && isPalindrome(chars,i,j)){

                    right = j - i +1;
                    left = i;
                }
            }
        }
        return s.substring(left,left + right);
    }


    /**
     *  使用动态规划找出最长回文子串
     * @param s
     * @return
     */
    public String longestPalindrome2(String s) {
        // 空字符串和一个字符的字符串都是回文的。
        int len = s.length();
        if (len<2){
            return s;
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = 1;
        boolean[][] dp = new boolean[len][len];

        // dp 矩阵对角线上的元素全是true ，一个字符的字符串为回文字符串
        for (int i = 0 ; i < len ; i++){
            dp[i][i] = true;
        }

        // 状态转移过程
        for(int j = 1 ; j < len ; j++){
            for (int i = 0 ; i < j ; i++){
                if (chars[i] != chars[j]){
                    dp[i][j] = false;
                }else {
                    if (j - i < 3){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }

                if (dp[i][j] && j - i + 1 > right ){

                    right = j - i +1;
                    left = i;
                }

            }
        }
        return s.substring(left,left+right);
    }



    public boolean isPalindrome(char[] chars , int left ,int right){
        while (left < right){
            if (chars[left] != chars[right]){
                return false;
            }
            left++;
            right --;
        }
        return true;
    }
}
