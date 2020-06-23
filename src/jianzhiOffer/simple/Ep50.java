package jianzhiOffer.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 * 示例:
 * s = "abaccdeff"
 * 返回 "b"
 * s = ""
 * 返回 " "
 *  
 * 限制：
 *
 * 0 <= s 的长度 <= 50000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Ep50 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
    public static char firstUniqChar(String s) {
        if (s == ""){
            return ' ';
        }
        HashMap<Character,Boolean> hashMap = new LinkedHashMap<>();
        for (int i = 0 ; i < s.length() ; i++){
            if (hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i),false);
            }else {
                hashMap.put(s.charAt(i),true);
            }
        }
        for (Character character : hashMap.keySet()){
            if (hashMap.get(character) == true){
                return character;
            }
        }
        return ' ';
    }
}
