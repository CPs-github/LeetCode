package sample.day2;

import java.util.*;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
       // System.out.println(lengthOfLongestSubstring3("acabac"));
    }
    public static int lengthOfLongestSubstring(String s){
        int len = 0;
        Set<Character> set = new HashSet<>();
        int i = 0 , j = 0;
        while (i < s.length() && j < s.length()){
            if( !set.contains(s.charAt(i)) ){
                set.add(s.charAt(i++));
                len = Math.max(len , i - j);
            }else {
                set.remove(s.charAt(j++));
            }
        }
        return len;
    }
    public static int lengthOfLongestSubstring2(String s){
        int len = 0;
        Map<Character ,Integer> map = new HashMap<>();
        for (int i = 0, j = 0; i < s.length(); i++ ){
            System.out.print(s.charAt(i)+"  "+map.get(s.charAt(i))+" "+j+" "+len+"  ->->->  ");
            if (map.containsKey(s.charAt(i))){

                j = Math.max(map.get(s.charAt(i)),j);
            }
            len = Math.max(len , i - j +1);
            map.put(s.charAt(i),i+1);
            System.out.println(s.charAt(i)+"  "+map.get(s.charAt(i))+" "+j+" "+len);
        }
        return len;
    }
    public static int lengthOfLongestSubstring3(String s){
        int len = 0;
        char[] chars = s.toCharArray();
        int leftindex = 0;
        for (int i = 0 ; i < chars.length ; i++){
            for (int index = leftindex ; index < i ; index++){
                if (chars[index]==chars[i]){
                    len = Math.max(len , i - leftindex);
                    leftindex = index + 1;
                    break;
                }
            }
        }
        return Math.max(len , chars.length - leftindex);
    }
}
