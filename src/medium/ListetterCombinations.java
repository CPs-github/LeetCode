package medium;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListetterCombinations {
    public static void main(String[] args) {
        String digits = "23";
        ListetterCombinations listetterCombinations = new ListetterCombinations();
        System.out.println(listetterCombinations.letterCombinations(digits));
    }
    public final static String[] LETTERMAP = { " ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    private List<String> rets;
    public List<String> letterCombinations(String digits) {
        rets = new ArrayList<String>();
        if (digits.length()==0 ){
            return rets;
        }

        char[] nums = digits.trim().toCharArray();
        findCombinations(nums,0,"");
        System.out.println(rets.hashCode()+"+");
        return rets;
    }
    private void findCombinations(char[] nums , int index , String s){

        if (index == nums.length){
            rets.add(s);
            return;
        }
        char c = nums[index];
        if (c >= '0' && c <= '9' && c != '1'){
            String letters = LETTERMAP[c-'0'];
            char[] chars = letters.trim().toCharArray();
            for (int i = 0 ; i < chars.length ; i++){
                System.out.println("当前数字："+c+" 正在使用的符号是" + chars[i]);
                findCombinations(nums,index+1,s+chars[i]);
            }

            System.out.println("chars ["+index+"] = "+ c + "已完成 ，返回");
        }
    }
}
