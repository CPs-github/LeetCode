package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePartitioning {

    public static void main(String[] args) {
       // System.out.println(new PalindromePartitioning().partition("av"));

    }


    public List<List<String>> partition(String s) {
        List<List<String>> rets = new ArrayList<>();
        dfs(0,s,rets,new ArrayList<>());
        return rets;
    }


    public void dfs(int index , String s , List<List<String>> rets , List<String> ls){
        if (index == s.length()){
            rets.add(new ArrayList<>(ls));
            return;
        }

        for (int i = index ; i <= s.length()-1 ; i++){
            if (isPalindrome(s.substring(index,i+1))){
                String t = s.substring(index , i+1);
                ls.add(t);
                System.out.println(t);
                dfs(i+1,s,rets,ls);
                ls.remove(ls.size()-1);
            }
        }
    }

    public boolean isPalindrome(String s) {
        /**
         *  采用双指针地方式判断该字符串是否为回文字符串。
         */
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
