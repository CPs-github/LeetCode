package jianzhiOffer.medium;

public class Ep48 {
    public static void main(String[] args) {
        String s = "ABC";
        System.out.println(new Ep48().lengthOfLongestSubstring1("AAB"));
        System.out.println(s.substring(0,s.length()-1));
    }

    // 暴力解决
    public int lengthOfLongestSubstring1(String s) {
        int ret = 0;

        for (int i = 0 ; i <= s.length() ; i++){
            for (int j = i+1 ; j < s.length() ; j++){
               System.out.println("..."+s.substring(i,j)+"   "+String.valueOf(s.charAt(j)));
                if (s.substring(i,j).contains(String.valueOf(s.charAt(j)))){
                    ret = Math.max(ret,j-i);
                    break;
                }else if(j == s.length()-1){
                    ret = Math.max(ret,j-i+1);
                }
            }
        }

        return ret == 0 ? s.length():ret;
    }
}
