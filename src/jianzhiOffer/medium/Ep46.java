package jianzhiOffer.medium;

import java.util.Arrays;

/**
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 * <p>
 * 来源：力扣（LeetCode）
 * 示例 1:
 * <p>
 * 输入: 12258
 * 输出: 5
 * 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 链接：https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Ep46 {
    public static void main(String[] args) {
        System.out.println("结果：" + new Ep46().translateNum(506));
    }

    public static char[] dic;
    public static int ret;

    public void setDic(char[] dic) {
        for (int i = 0; i < 26; i++) {
            dic[i] = (char) ('a' + i);
        }
    }

    //  暴力解法
    public int translateNum(int num) {
        dic = new char[26];
        ret = 0;
        String nums = String.valueOf(num);
        setDic(dic);
        dfs(nums, 0);
        return ret;
    }

    public void dfs(String nums, int index) {
        // 递归终止条件
        if (index == nums.length()) {
            ret++;
            return;
        }
        //递归语句

        for (int i = index; i < nums.length(); i++) {
            int temp;
            String ts = nums.substring(index, i + 1);
            temp = Integer.valueOf(ts);
            if (ts.length()>1 && temp <10){
                continue;
            }

            if (temp < 26 && ts.length()<3 ) {
                dfs(nums, i + 1);

            }
        }
    }
}
