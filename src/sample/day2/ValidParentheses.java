package sample.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "((((()))()))";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i < s.length() ; i++ ){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                char stackTopElement = stack.empty() ? '?':stack.pop();
                if (stackTopElement != map.get(c)){
                    return false;
                }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
