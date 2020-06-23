package jianzhiOffer.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Ep38 {
    public static void main(String[] args) {

        System.out.println(new Ep38().permutation("abc"));
    }

    public char[] chars ;
    public List<String> rets;
    public  String[] permutation(String s) {
        chars = s.toCharArray();
        rets = new ArrayList<>();
        dfs(0);
        return rets.toArray(new String[rets.size()]);
    }
    public void dfs(int x){
        // 递归终止条件
        if (x == chars.length-1){
            rets.add(String.valueOf(chars));
            return;
        }
        HashSet<Character> set = new HashSet<>();

        for (int i = x; i < chars.length; i++){
            // 剪枝操作 , 每个层次不允许出现重复的字符，当出现重复的字符时直接跳过实现剪枝；
            if (set.contains(chars[i])){
                continue;
            }
            set.add(chars[i]);
            swap(i , x);
            dfs(x+1);
            swap(i,x);
        }
    }
    public void swap (int i , int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
