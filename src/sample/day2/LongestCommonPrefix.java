package sample.day2;

/**
 * String.indexOf() ����ָ���ַ����ַ������ַ����е�һ�γ��ֵط�������.
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = {"string","otrings","str"};
        String s1 = "asdasdasd";
        String[]  s2 = {} ;
        System.out.println(longestCommonPrefix(s2));

    }
    public static String longestCommonPrefix(String[] strings){
        if (strings.length == 0){
            throw new IllegalArgumentException("��������Ϊ��");
        }
        String prefix = strings[0];
        for (int i = 1 ; i < strings.length ; i++){
            while (strings[i].indexOf(prefix)!= 0){
                prefix = prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

}